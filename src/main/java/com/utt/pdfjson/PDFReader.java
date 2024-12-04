/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utt.pdfjson;

import org.apache.pdfbox.pdmodel.PDDocument; 
import org.apache.pdfbox.text.PDFTextStripper; 

import java.io.File; 
import java.io.IOException;

/**
 *
 * @author gabyn
 */
public class PDFReader {
    public static String leerPDF(String rutaArchivo) { 
        try (PDDocument documento = PDDocument.load(new File(rutaArchivo))) {
            PDFTextStripper stripper = new PDFTextStripper();
            return stripper.getText(documento); 
        } catch (IOException e) { 
            e.printStackTrace();
        } return null; }
}
