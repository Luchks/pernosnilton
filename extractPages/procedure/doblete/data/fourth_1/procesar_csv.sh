#!/bin/bash

# Carpeta de entrada y salida
#INPUT_DIR="csv_entrada"
INPUT_DIR="."
OUTPUT_DIR="csv_salida"

mkdir -p "$OUTPUT_DIR"

# Procesar todos los CSV
for file in "$INPUT_DIR"/*.csv; do
    base=$(basename "$file")
    output="$OUTPUT_DIR/$base"

    awk -F',' -v OFS=',' '
    NR==1 { 
        print; 
        next 
    } 
    NR%2==0 { 
        # Combinar fila anterior con la actual
        for(i=1;i<=NF;i++) {
            printf "%s%s", prev[i] " " $i, (i==NF?ORS:OFS)
        }
        next
    } 
    { 
        split($0, prev, OFS) 
    } 
    END { 
        # Si hay fila impar al final, imprimirla tal cual
        if(NR%2==1) {
            for(i=1;i<=length(prev);i++) {
                printf "%s%s", prev[i], (i==length(prev)?ORS:OFS)
            }
        }
    }' "$file" > "$output"

    echo "Procesado: $file -> $output"
done

echo "✅ Todos los archivos han sido procesados en $OUTPUT_DIR"
