package com.ufv.Practica1;
import java.util.Scanner;
import java.io.BufferedReader;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void clearScreen() {   
	    System.out.println("\n\n\n\n\n\n");  
	} 
	public static void menuPrincipal() {
		
		clearScreen();
		System.out.println("**************************");
		System.out.println("1. Ver datos guardados");
		System.out.println("2. Introducir nuevos datos");
		System.out.println("3. Guardar y Salir");
		System.out.println("Escribe una de las opciones");
		clearScreen();
	}
	
	
	public static void menuVerAlmacen() {
		
		clearScreen();
		System.out.println("**************************");
		System.out.println("1. Ver Clientes");
		System.out.println("2. Ver Pedidos");
		System.out.println("3. Ver Productos");
		System.out.println("4. Ver Todo");
		System.out.println("5. Volver");
		
		clearScreen();
		

		
	}
	
	public static void menuNuevosDatos() {
		
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
    	int option;
    	
		clearScreen();
		System.out.println("**************************");
		System.out.println("1. Añadir Cliente");
		System.out.println("2. Añadir Pedido");
		System.out.println("3. Añadir Producto");
		System.out.println("4. Volver");

		clearScreen();
		
		while(!salir) {
    		menuPrincipal();
    		option = sn.nextInt();
    		
    		switch(option) {
    		case 1:
    			menuVerAlmacen();
    			break;
    		case 2:
    			menuNuevosDatos();
    			break;
    		case 3:
    			salir = true;
    			break;
    		case 4:
    			salir = true;
    			break;
    		}
		}
	}
	
	
	
    public static void main( String[] args )
    {
    	Scanner sn = new Scanner(System.in);
    	boolean salir = false;
    	int option;
    	
    	while(!salir) {
    		menuPrincipal();
    		option = sn.nextInt();
    		
    		switch(option) {
    		case 1:
    			menuVerAlmacen();
    			break;
    		case 2:
    			menuNuevosDatos();
    			break;
    		case 3:
    			sn.close();
    			salir = true;
    			break;
    			
    		}
    		
    		
    	}
    	
    }
}
