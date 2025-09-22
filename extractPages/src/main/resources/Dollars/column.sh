#!/usr/bin/env bash
# Uso: ./contar_columnas.sh file1.csv file2.csv ...

DB_USER="root"
DB_PASS="123"
DB_NAME="deleteNow"

# Abortar si hay error en cualquier paso
set -o errexit
set -o pipefail

{
    # Vaciar la tabla al inicio
    echo "TRUNCATE TABLE lstColumnDollar;"

    # Generar los INSERT para cada archivo CSV
    for f in "$@"; do
        if [[ -f "$f" ]]; then
            cols=$(head -n 1 "$f" | awk -F',' '{print NF}')
            echo "INSERT INTO lstColumnDollar VALUES('$f',$cols);"
        else
            echo "-- Warning: $f no es un archivo regular"
        fi
    done
} | mysql -u"$DB_USER" -p"$DB_PASS" "$DB_NAME"
