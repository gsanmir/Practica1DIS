package com.ufv.Practica1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
	public static void clearScreen() {   
	    System.out.println("\n\n\n\n\n\n");  
	} 
	
	/*Creamos un array por cada clase para ir rellenarlo con los datos */
	
	
	
	
	public static void menuPrincipal() {
		
		//clearScreen();
		System.out.println("**************************");
		System.out.println("1. Ver datos guardados");
		System.out.println("2. Introducir nuevos datos");
		System.out.println("3. Guardar y Salir");
		System.out.print("Escribe una de las opciones: ");
		//clearScreen();
	}
	
	
	public static void menuVerAlmacen() {
		
		//clearScreen();
		System.out.println("**************************");
		System.out.println("1. Ver Clientes");
		System.out.println("2. Ver Pedidos");
		System.out.println("3. Ver Productos");
		System.out.println("4. Ver Todo");
		System.out.println("5. Volver");
		
		//clearScreen();
		

		
	}
	
	public static void menuNuevosDatos() throws IOException {
		ArrayList<Producto> producto = new ArrayList<Producto>();
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
		ArrayList<Pedidos> pedidos = new ArrayList<Pedidos>();
		
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
    	int option;
    	
    	
		
		
		while(!salir) {
			//clearScreen();
			System.out.println("**************************");
			System.out.println("1. Añadir Cliente");
			System.out.println("2. Añadir Pedido");
			System.out.println("3. Añadir Producto");
			System.out.println("4. Volver");
			System.out.print("Selecciona la opcion: ");
			//clearScreen();
    		//menuPrincipal();
    		option = sn.nextInt();
    		
    		switch(option) {
    		case 1:
    			Cliente client = AniadirCliente();
    			cliente.add(client);
    			
    			break;
    		case 2:
    			Producto product = AniadirProducto();
    			producto.add(product);
    			
    			break;
    		case 3:
    			Pedidos ped = AniadirPedidos();
    			pedidos.add(ped);
    			
    			break;
    		case 4:
    			salir = true;
    			break;
    		}
		}
	}
	
	
	
    
	private static Cliente AniadirCliente() throws IOException {
		// TODO Auto-generated method stub
    	java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	
    	
    	String Nombre = null;
		String Apellidos = null;
		String Email = null;
		int Telefono = 0;
		String[] Direccion = new String[4];
    	
    	System.out.println("Introducir datos de cliente");
    	System.out.println("Introduzca el nombre: ");
    	Nombre = in.readLine();
    	System.out.print("Introduzca los Apellidos: ");
    	Apellidos = in.readLine();
    	System.out.print("Introduzca el Email: ");
    	Email= in.readLine();
    	System.out.print("Introduzca el Telefono: ");
    	Telefono = Integer.parseInt(in.readLine());
    	System.out.println("Introduzca la direccion: ");
    	System.out.print("Introduzca la calle: ");
    	Direccion[0] = in.readLine();
    	System.out.print("Introduzca la poblacion: ");
    	Direccion[1] = in.readLine();;
    	System.out.print("Introduzca el codigo Postal: ");
    	Direccion[2] = in.readLine();
    	System.out.print("Introduzca el Pais: ");
    	Direccion[3] = in.readLine();
    	
    	System.out.println("Aniadido el Cliente Correctamente");
    	Cliente client = new Cliente(Nombre,Apellidos,Email,Telefono,Direccion);
    	
    	return client;
	}

    private static Producto AniadirProducto() throws IOException {
    	java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	String codigo;
    	String nombre;
    	String descripcion;
    	int stock;
    	int[] localizacion = new int[3];
    	int pendientes;
    	
    	System.out.println("Introducir datos de Producto");
    	System.out.print("Introduzca el codigo: ");
    	codigo = in.readLine();
    	System.out.print("Introduzca el nombre : ");
    	nombre = in.readLine();
    	System.out.print("Introduzca la descripcion: ");
    	descripcion= in.readLine();
    	System.out.print("Introduzca el Stock: ");
    	stock = Integer.parseInt(in.readLine());
    	System.out.println("Introduzca la Localizacion: ");
    	System.out.print("Pasillo: ");
    	localizacion[0] =Integer.parseInt(in.readLine());;
    	System.out.print("Estanteria: ");
    	localizacion[1] = Integer.parseInt(in.readLine());;
    	System.out.print("Balda: ");
    	localizacion[2] = Integer.parseInt(in.readLine());;
    	System.out.print("Pendientes: ");
    	pendientes = Integer.parseInt(in.readLine());
    	System.out.println("Aniadido el Producto Correctamente");
    	
    	Producto product = new Producto(codigo,nombre,descripcion,stock,localizacion,pendientes);
    	
    	return product;
    }
    private static Pedidos AniadirPedidos() throws IOException {
    	java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	String Productos;
        String Cantidad;
    	String DireccionEntrega[]=  new String[3];
        String Destinatario;
    	String FechaEntrega;
    	
    	System.out.println("Datos de Pedidos");
    	System.out.print("Producto: ");
    	Productos = in.readLine();
    	System.out.print("Cantidad : ");
    	Cantidad = in.readLine();
    	System.out.print("Direccion Entrega: ");
    	System.out.print("Poblacion: ");
    	DireccionEntrega[0] =in.readLine();
    	System.out.print("Calle: ");
    	DireccionEntrega[1] =in.readLine();
    	System.out.print("Piso: ");
    	DireccionEntrega[2] =in.readLine();
    	System.out.print("Destinatario: ");
    	Destinatario= in.readLine();
    	System.out.print("Fecha Entrega: ");
    	FechaEntrega = in.readLine();
    	
    	System.out.println("Pedido Correcto");
    	
    	Pedidos ped = new Pedidos(Productos,Cantidad,DireccionEntrega,Destinatario,FechaEntrega);
    	
    	return ped;
    }
	public static void main( String[] args ) throws IOException
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
