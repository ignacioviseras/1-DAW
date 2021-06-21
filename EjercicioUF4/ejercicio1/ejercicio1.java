package ejercicio1;

import java.util.Random;

public class ejercicio1 {
	
	public static void main(String[] args) {
		
		double subida;
		int ntrabajador = 1, nt = 1;
		double[] sueldo = new double[10];
		double[] comision = new double[10];
		
		Random numAleatorio = new Random();//llenamos el array de los sueldos y las comisione
        for (int i=0; i<sueldo.length; i++){
            sueldo [i]=numAleatorio.nextInt(46000-900);//generamos numeros aleatorios dentro de ese margen de datos
        }
        for (int i=0; i<comision.length; i++){
              comision [i]=numAleatorio.nextInt(11000-0);//generamos numeros aleatorios dentro de ese margen de datos
        }
	        for(int i=0; i<sueldo.length;i++) {//lo recorremos para mostrarlo
	        	for(int y=0; y<comision.length;y++) {
	        	}
	    		System.out.println("Trabajador "+ ntrabajador +" sueldo de: "+ sueldo[i] +"€ comision de: " + comision[i] +"€");
	    		ntrabajador++;
	        }
        System.out.println("");
        //empieza subidas salarios
	        for(int i=0; i<sueldo.length;i++) {//lo recorremos para mostrarlo
	        	for(int y=0; y<comision.length;y++) {
	        	}
	        	if(comision[i]<=0) {
	    			if(sueldo[i]<15000) {//se empeza a poner una serie de if para ir clasificando los salarios tal y como se nos pide
	    				subida = sueldo[i] * 0.10;//cuando se encuentra uno se le aplica la subida que le corresponde
	    				System.out.println("Al trabajador " + nt 
	    						+ " se le aplico una subida del 10%, eso supone que se le sumo "+(String.format("%.2f", subida))+//con esto se hace que salga el formato que queremos 0.00
	    						"€ ahora su sueldo es de "+ (subida + sueldo[i])+"€");//la salida que es obtener el sueldo y se le suma la salida ademas de añadirle el simbolo de €
	    			}
	    			if(sueldo[i]>=15000 && sueldo[i] <= 30000) {
	    				subida = sueldo[i] * 0.08;
	    				System.out.println("Al trabajador " + nt 
	    						+ " se le aplico una subida del 8%, eso supone que se le sumo "+(String.format("%.2f", subida))+
	    						"€ ahora su sueldo es de "+ (subida + sueldo[i])+"€");
	    			}
	    			if(sueldo[i] >= 30000 && sueldo[i] <= 45000) {
	    				subida = sueldo[i] * 0.04;
	    				System.out.println("Al trabajador " + nt 
	    						+ " se le aplico una subida del 4%, eso supone que se le sumo "+(String.format("%.2f", subida))+
	    						"€ ahora su sueldo es de "+ (subida + sueldo[i])+"€");
	    			}
	    		}else {
	    			if(comision[i]<=2000) {
	    				subida = sueldo[i] * 0.12;
	    				System.out.println("Al trabajador " + nt 
	    						+ " se le aplico una subida del 12%, eso supone que se le sumo "+(String.format("%.2f", subida))+
	    						"€ ahora su sueldo es de "+ (subida + sueldo[i])+"€");
	    			}
	    			if(comision[i]>2000 && comision[i]<=10000) {
	    				subida = sueldo[i] * 0.06;
	    				System.out.println("Al trabajador " + nt 
	    						+ " se le aplico una subida del 6%, eso supone que se le sumo "+(String.format("%.2f", subida))+
	    						"€ ahora su sueldo es de "+ (subida + sueldo[i])+"€");
	    			}
	    		}
	        	nt++;//sumamos uno al contador de trabajadores para la salida de los salarios
	        }
        }
	}