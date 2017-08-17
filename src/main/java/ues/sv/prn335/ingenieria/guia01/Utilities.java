/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.sv.prn335.ingenieria.guia01;

public class Utilities {
    /**
     * El metodo getResume recive una cadena de texto y devuelve los primeros 30 caracteres de esta.
     * @param texto
     * @return resultado
     */
     public String getResume(String texto){
        String resultado="";
        for (int i = 0; i < 30; i++) {
            resultado=resultado+texto.charAt(i);
        }
        return resultado;
    }
     public String capitalizar(String texto){
         char[] cadena=texto.toCharArray();
         texto="";
         cadena[0]=Character.toUpperCase(cadena[0]);
         
         for (int i = 0; i < cadena.length; i++) {
             if(cadena[i]==' '){
             cadena[i]=Character.toUpperCase(cadena[i]);
             }
         }
             for (int j = 0; j < cadena.length; j++) {
                 texto+=cadena[j];
             }
         
         return texto;
     }
}
