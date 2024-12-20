/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.utt.pdfjson;

import java.util.List;

/**
 *
 * @author gabyn
 */
public class Pdfjson {

    public static void main(String[] args) {
        String rutaPDF = "fundamentos.pdf"; // Asegúrate de usar una ruta válida
        List<String> textoPDF = PDFReader.leerPDF(rutaPDF);
        System.out.println(textoPDF);
        
        if (textoPDF != null) {
            //String jsonResultado = JsonConverter.convertirTextoAJson(textoPDF);
            System.out.println("------------------------------------");
            // System.out.println("Json: ");
            // System.out.println(jsonResultado);
            for (String text : textoPDF) {
                System.out.println(text);
            }
        } else {
            System.out.println("No se pudo leer el archivo PDF.");
        }
    }
}


