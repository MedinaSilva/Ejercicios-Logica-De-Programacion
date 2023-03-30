package ejerciciosLogicaProgramacion;

import java.util.HashMap;
import java.util.Scanner;

public class SpaEng {
	public static void main(String[] args) {
		 HashMap<String, String> diccionario = new HashMap<String, String>();
		    Scanner entrada = new Scanner (System.in);
		    
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
		    
		    System.out.println("Introduce una palabra en español para traducirla.");
		    String palabra = entrada.next();
		    
		    if (diccionario.containsKey(palabra)) {
		      System.out.print("La palabra " + palabra + " en inglés es: ");
		      System.out.println(diccionario.get(palabra)+".");
		      } else {
		      System.out.print("La palabra introducida no existe en el diccionario.");
		      } 

	}



}
