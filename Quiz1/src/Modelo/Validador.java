/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Scarlett
 */
public class Validador {
    
    public final static String VALORES= "^\\d{1,3}|\\d{1,3}(,?\\d{3}(\\+|\\*|\\/|\\-)\\d{1,3}$";
    
    
    public boolean validarValor(String valores){
        Pattern pat = Pattern.compile(VALORES, Pattern.CASE_INSENSITIVE);
        Matcher mat = pat.matcher(valores);
        return mat.find();
    }
    
    
    
}
