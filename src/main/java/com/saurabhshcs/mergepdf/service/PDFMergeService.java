package com.saurabhshcs.mergepdf.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.pdfbox.multipdf.PDFMergerUtility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

@Slf4j
public class PDFMergeService
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        File file1 = new File("files/1.pdf");
        File file2 = new File("files/2.pdf");

        PDFMergerUtility pdfMergerUtility = new PDFMergerUtility();

        pdfMergerUtility.setDestinationFileName("files/1-plus-2.pdf");
        pdfMergerUtility.addSource(file1);
        pdfMergerUtility.addSource(file2);

        pdfMergerUtility.mergeDocuments();

        log.info("{} and {} has been merged into the {} successfully.", file1.getName(), file2.getName(), pdfMergerUtility.getDestinationFileName());
    }
}
