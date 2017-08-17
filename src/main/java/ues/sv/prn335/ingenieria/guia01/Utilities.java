/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.sv.prn335.ingenieria.guia01;

/**
 *
 * @author PC15
 */
public class Utilities {
    
     public String getResume(String texto){
        String resultado="";
        for (int i = 0; i < 30; i++) {
            resultado=resultado+texto.charAt(i);
        }
        return resultado;
    }
     public String capitalizar(String texto){
         char[] cadena=texto.toCharArray();
         
         return texto;
     }
}
