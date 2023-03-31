package ejerciciosLogicaProgramacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;



public class EngSpa {

	public static void main(String[] args) {
		 HashMap<String, String> diccionario = new HashMap<String, String>();
		    Scanner entrada = new Scanner (System.in);
		    
		    ArrayList<String> diccionario2=new ArrayList<String>();
		    ArrayList<String> palabras=new ArrayList<String>();
		    
		    diccionario.put("pato", "duck");
		    diccionario.put("agua", "water");
		    diccionario.put("autobus", "bus");
		    diccionario.put("estrella", "star");
		    diccionario.put("verde", "green");
		    diccionario.put("alboroto", "kerfuffle");
		    diccionario.put("rutas", "routes");
		    diccionario.put("oceano", "ocean");
		    diccionario.put("alegria", "joy");
		    diccionario.put("pelicula", "movie");
		    diccionario.put("tenedor", "fork");
		    diccionario.put("escandalo", "hullabaloo");
		    diccionario.put("volcan", "volcano");
		    diccionario.put("acampar", "camping");
		    diccionario.put("dormir", "sleep");
		    diccionario.put("mantarraya", "stingray");
		    diccionario.put("palomitas", "pop corn");
		    diccionario.put("desconsolado", "woebegnoe");
		    diccionario.put("exito", "succes");
		    
		    

	//Obtiene un conjunto de claves
	diccionario2.addAll(diccionario.keySet());
	//Permite obtener las palabras aleatoriamente
    Collections.shuffle(diccionario2);

    for (int i = 0; i < 5; i++) {
    	// Borra el par clave/valor de la clave que se le pasa como parámetro conforme va iterando
      palabras.add(diccionario2.remove(0)); 
    }
int aciertos=0;
int errores=0;
    for (String x : palabras) {

      String traducir = "";
      System.out.println("Introduzca la traducción de la palabra "+x+": ");
      traducir = entrada.nextLine();
      //Obtener la palabra de diccionario
      if (traducir.contains(diccionario.get(x))) {
        aciertos++;
      } else {
        errores++;
      }
      System.out.println("Tienes " + aciertos + " aciertos y  " + errores + " errores.");
    	}
	}
}
