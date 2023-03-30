package ejerciciosLogicaProgramacion;

import java.util.Scanner;

public class MinutosFaltantes {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
	    String dia = entrada.nextLine();

	    int numDia = 0;

	    switch(dia) {
	      case "lunes":
	    	  numDia = 0;
	        break;
	      case "martes":
	    	  numDia = 1;
	        break;
	      case "miércoles":
	      case "miercoles":
	    	  numDia = 2;
	        break;
	      case "jueves":
	    	  numDia = 3;
	        break;
	      case "viernes":
	    	  numDia = 4;
	        break;
	      default:
	        System.out.print("El día introducido no es correcto.");
	    }
	    
	    System.out.println("Introduzca la hora (hora y minutos) formato 24hrs");
	    
	    System.out.print("Hora: ");
	    int horas = entrada.nextInt();
	    
	    System.out.print("Minutos: ");
	    int minutos = entrada.nextInt();
	    
	    int minutosTotales = (4 * 24 * 60) + (15 * 60);
	    int minutosActuales = (numDia * 24 * 60) + (horas * 60) + minutos;
	    
	    System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");

	}

}
