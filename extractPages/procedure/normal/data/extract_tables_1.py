import pdfplumber
import csv

with pdfplumber.open("input.pdf") as pdf:
    with open("output.csv", "w", newline="") as f:
        writer = csv.writer(f)
        for page in pdf.pages:
            table = page.extract_table()
            if table:
                writer.writerows(table)
