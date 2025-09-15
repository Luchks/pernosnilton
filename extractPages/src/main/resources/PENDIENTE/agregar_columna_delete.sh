#!/usr/bin/env bash
# Inserta una columna "DELETE" vacía al inicio de cada CSV en el directorio

for f in *.csv; do
    [ -e "$f" ] || continue

    # Archivo temporal
    tmp="${f}.tmp"

    # Usamos awk: FS=OFS="," define el separador de campos como coma
    awk 'BEGIN{FS=OFS=","} 
         NR==1 {print "DELETE", $0; next} 
         {print "", $0}' "$f" > "$tmp"

    # Reemplazamos el archivo original
    mv "$tmp" "$f"
    echo "Columna DELETE añadida en: $f"
done
