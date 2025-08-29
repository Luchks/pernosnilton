import pdfplumber
import csv

with pdfplumber.open("input.pdf") as pdf:
    for page_number, page in enumerate(pdf.pages, start=1):
        tables = page.extract_tables()
        for table_number, table in enumerate(tables, start=1):
            output_filename = f"page_{page_number:02d}_table_{table_number:02d}.csv"
            with open(output_filename, "w", newline="") as f:
                writer = csv.writer(f)
                writer.writerows(table)
