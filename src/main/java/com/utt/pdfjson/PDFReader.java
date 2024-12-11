/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utt.pdfjson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

/**
 *
 * @author gabyn
 */
public class PDFReader {
    public static List<String> leerPDF(String rutaArchivo) { 
        List<String> data = new ArrayList<String>();
        try (PDDocument documento = PDDocument.load(new File(rutaArchivo))) {
            PDFTextStripper stripper = new PDFTextStripper();
            String texto = stripper.getText(documento); 
            System.out.println("-------- Texto obtenido: ----------------- ");
            System.out.println(texto);
            String[] lineas = texto.split("\n");
            System.out.println("Number of lines: " + lineas.length);

            for (String linea : lineas) { 
                if (linea.contains("criterio")) { 
                    data.add(linea); 
                } 
            }
           
            //return stripper.getText(documento); 

        } catch (IOException e) { 
            e.printStackTrace();
        } 
        return data; 
    }
}
