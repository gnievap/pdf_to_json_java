/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utt.pdfjson;

import com.google.gson.Gson; 
import java.util.HashMap; 
import java.util.Map;

/**
 *
 * @author gabyn
 */
public class JsonConverter {
    public static String convertirTextoAJson(String texto) { 
        Map<String, String> data = new HashMap<>();
        data.put("contenido", texto); 
        Gson gson = new Gson(); 
        return gson.toJson(data);
    }
}
