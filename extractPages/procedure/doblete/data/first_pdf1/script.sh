#!/bin/bash

input="page_01_table_02.csv"
output="archivo_unido.csv"

# Número de filas fijas (además de la cabecera)
KEEP=2

# Limpiar salida
> "$output"

# Guardar cabecera
head -n 1 "$input" >> "$output"

# Guardar las filas fijas
head -n $((KEEP+1)) "$input" | tail -n +2 >> "$output"

# Procesar desde la fila siguiente a las fijas
tail -n +$((KEEP+2)) "$input" | awk -F, -v keep="$KEEP" '
NR % 2 == 1 {
    # Guardar fila impar
    for (i=1; i<=NF; i++) col[i]=$i
    next
}
NR % 2 == 0 {
    # Concatenar columna por columna con espacio
    for (i=1; i<=NF; i++) {
        if (i>1) printf(",")
        printf("%s %s", col[i], $i)
    }
    printf("\n")
}
END {
    # Si quedó fila sin pareja
    if (NR % 2 == 1) {
        for (i=1; i<=NF; i++) {
            if (i>1) printf(",")
            printf("%s", col[i])
        }
        printf("\n")
    }
}' >> "$output"
