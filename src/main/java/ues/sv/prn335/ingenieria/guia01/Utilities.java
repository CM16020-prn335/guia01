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
     * @return String resultado
     */
     public String getResume(String texto){
        String resultado="";
        for (int i = 0; i < 30; i++) {
            resultado=resultado+texto.charAt(i);
        }
        return resultado;
    }
     /**
      * El metodo recive una cadena de texto y capitaliza cada palabra de dicha cadena.
      * @param texto
      * @return String texto
      */
     public String capitalizar(String texto){
         char[] cadena=texto.toCharArray();
         int size=cadena.length;
         texto="";
         cadena[0]=Character.toUpperCase(cadena[0]);
         
         for (int o = 0; o < 32; o++) {
            for (int i = 0; i < cadena.length; i++) {
                if (cadena[i]==' ' && cadena[i+1]==' '){
                    System.out.println(size);
                    for (int j = i; j < size-2; j++) {
                        cadena[j+1]=cadena[j+2];
                    }
                 size--; 
                }
                 
            }
         }
         
         for (int i = 0; i < cadena.length; i++) {
             if(cadena[i]==' '){
             cadena[i+1]=Character.toUpperCase(cadena[i+1]);
             }
         }
             for (int j = 0; j < cadena.length; j++) {
                 texto+=cadena[j];
             }
         
         return texto;
     }
     /**
      * El metodo cuenta el numero de coincidencia de palabras entre la frase y el texto
      * @param frase
      * @param texto
      * @return int coincidencias
      */
     public int contarCoincidencias(String frase, String texto){
         int coincidencia=0, posicion=0;
         
         posicion=texto.indexOf(frase);
         while (posicion != -1) {
            coincidencia++;
            posicion=texto.indexOf(frase, posicion+1 );
            
             
         }
         return coincidencia;
     }
}
