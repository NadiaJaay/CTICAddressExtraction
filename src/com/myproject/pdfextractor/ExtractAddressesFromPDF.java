package com.myproject.pdfextractor;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class ExtractAddressesFromPDF {
    public static void main(String[] args) {

    	String pdfFilePath = ""; //path to PDF

        // Regex pattern to match "Municipal Address" and extract the address
        String pattern = "Municipal Address:\\s*(.*)";
        Pattern regex = Pattern.compile(pattern);

        // List to store extracted addresses
        List<String> addresses = new ArrayList<>();

        try {
            File pdfFile = new File(pdfFilePath);
            try (PDDocument document = Loader.loadPDF(pdfFile)) { 
                // Extract text from the PDF
                PDFTextStripper pdfStripper = new PDFTextStripper();
                String text = pdfStripper.getText(document);

                // Search for "Municipal Address" entries
                Matcher matcher = regex.matcher(text);
                while (matcher.find()) {
                    addresses.add(matcher.group(1).trim());
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the PDF: " + e.getMessage());
        }

        // Print extracted addresses
        if (!addresses.isEmpty()) {
            System.out.println("Extracted Municipal Addresses:");
            for (String address : addresses) {
                System.out.println(address);
            }
            System.out.println("Total number of addresses: " + addresses.size());

        } else {
            System.out.println("No municipal addresses found in the PDF.");
        }
    }
}
