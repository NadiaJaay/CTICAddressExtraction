# **Municipal Address Extractor**

A Java-based tool designed to extract municipal addresses from unstructured PDF files and prepare the data for use in Excel or other applications. This project demonstrates the use of **Apache PDFBox** for PDF parsing and showcases automation of data extraction workflows.

---

## **Features**
- Efficiently extracts municipal address data from complex and unstructured PDF files.
- Outputs extracted addresses for manual entry into Excel or further processing.
- Handles large PDF files with multiple pages and diverse text layouts.
- Demonstrates the use of **regular expressions** to identify and extract targeted data.

---

## **Technologies Used**
- **Java**: Core programming language used for the tool's development.
- **Apache PDFBox**: Library used for parsing PDF files.
- **Regular Expressions**: To identify and extract relevant address data.

---

## **How It Works**
1. The tool processes a PDF file containing address information.
2. It identifies and extracts lines matching the pattern `Municipal Address: [Address Here]`.
3. The extracted addresses are printed to the console.

---

## **Example Output**
```
Extracted Municipal Addresses:
1. 123 Candy Lanee, Candy, Ontario
2. 129 Chicago Street South, Timmins, Ontario
3. 25 Ice Lane, Ice, Ontario
Total number of addresses: 3
...
```
