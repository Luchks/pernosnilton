#!/usr/bin/env bash
DB_USER="root"
DB_PASS="123"
DB_NAME="deleteNow"
set -o errexit
set -o pipefail

{
    echo "TRUNCATE TABLE lstRowsAtribute;"

    for f in "$@"; do
        if [[ -f "$f" ]]; then
            rows=$(wc -l < "$f")
            echo "INSERT INTO lstRowsAtribute VALUES ('$f', $rows);"
        else
            echo "-- Warning: $f is not a regular file" >&2
        fi
    done
} | mysql -u"$DB_USER" -p"$DB_PASS" "$DB_NAME"
