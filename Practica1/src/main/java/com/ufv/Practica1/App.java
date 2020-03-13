package com.ufv.Practica1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Necesario para leer el xml
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

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
	
	
	public static void menuVisualizarAlmacen(ArrayList<Producto> producto, ArrayList<Cliente> cliente, ArrayList<Pedidos> pedidos) throws IOException {
		
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
int option;
    	
		while(!salir) {
			//clearScreen();
			System.out.println("**************************");
			System.out.println("1. Ver Clientes");
			System.out.println("2. Ver Productos");
			System.out.println("3. Ver Pedidos");
			System.out.println("4. Volver");
			System.out.print("Selecciona la opcion: ");
			//clearScreen();
    		//menuPrincipal();
    		option = sn.nextInt();
    		
    		switch(option) {
    		case 1:
    			
    			try {
    	            // Creo una instancia de DocumentBuilderFactory
    	            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    	            // Creo un documentBuilder
    	            DocumentBuilder builder = factory.newDocumentBuilder();
    	 
    	            // Obtengo el documento, a partir del XML
    	            Document documento = builder.parse(new File("xmlFile.xml"));
    	 
    	            // Cojo todas las etiquetas cliente del documento
    	            NodeList listaClientes = documento.getElementsByTagName("Cliente");
    	            
    	            // Recorro las etiquetas
    	            for (int i = 0; i < listaClientes.getLength(); i++) {
    	                // Cojo el nodo actual
    	                Node nodo = listaClientes.item(i);
    	                // Compruebo si el nodo es un elemento
    	                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
    	                    // Lo transformo a Element
    	                    Element e = (Element) nodo;
    	                    // Obtengo sus hijos
    	                    NodeList hijos = e.getChildNodes();
    	                    // Recorro sus hijos
    	                    for (int j = 0; j < hijos.getLength(); j++) {
    	                        // Obtengo al hijo actual
    	                        Node hijo = hijos.item(j);
    	                        // Compruebo si es un nodo
    	                        if (hijo.getNodeType() == Node.ELEMENT_NODE) {
    	                            // Muestro el contenido
    	                            System.out.println(hijo.getNodeName() + ": " + hijo.getTextContent());
    	                        }
    	 
    	                    }
    	                    System.out.println("");
    	                }
    	 
    	            }
    	 
    	        } catch (ParserConfigurationException | SAXException | IOException ex) {
    	            System.out.println(ex.getMessage());
    	        }
    			
    			break;
    		case 2:
    			
    			try {
    	            // Creo una instancia de DocumentBuilderFactory
    	            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    	            // Creo un documentBuilder
    	            DocumentBuilder builder = factory.newDocumentBuilder();
    	 
    	            // Obtengo el documento, a partir del XML
    	            Document documento = builder.parse(new File("xmlFile.xml"));
    	 
    	            // Cojo todas las etiquetas Producto del documento
    	            NodeList listaProducto = documento.getElementsByTagName("Producto");
    	            
    	            // Recorro las etiquetas
    	            for (int i = 0; i < listaProducto.getLength(); i++) {
    	                // Cojo el nodo actual
    	                Node nodo = listaProducto.item(i);
    	                // Compruebo si el nodo es un elemento
    	                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
    	                    // Lo transformo a Element
    	                    Element e = (Element) nodo;
    	                    // Obtengo sus hijos
    	                    NodeList hijos = e.getChildNodes();
    	                    // Recorro sus hijos
    	                    for (int j = 0; j < hijos.getLength(); j++) {
    	                        // Obtengo al hijo actual
    	                        Node hijo = hijos.item(j);
    	                        // Compruebo si es un nodo
    	                        if (hijo.getNodeType() == Node.ELEMENT_NODE) {
    	                            // Muestro el contenido
    	                            System.out.println(hijo.getNodeName() + ": " + hijo.getTextContent());
    	                        }
    	 
    	                    }
    	                    System.out.println("");
    	                }
    	 
    	            }
    	 
    	        } catch (ParserConfigurationException | SAXException | IOException ex) {
    	            System.out.println(ex.getMessage());
    	        }
    			
    			break;
    		case 3:
    			
    			try {
    	            // Creo una instancia de DocumentBuilderFactory
    	            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    	            // Creo un documentBuilder
    	            DocumentBuilder builder = factory.newDocumentBuilder();
    	 
    	            // Obtengo el documento, a partir del XML
    	            Document documento = builder.parse(new File("xmlFile.xml"));
    	 
    	            // Cojo todas las etiquetas Pedido del documento
    	            NodeList listaPedido = documento.getElementsByTagName("Pedido");
    	            
    	            // Recorro las etiquetas
    	            for (int i = 0; i < listaPedido.getLength(); i++) {
    	                // Cojo el nodo actual
    	                Node nodo = listaPedido.item(i);
    	                // Compruebo si el nodo es un elemento
    	                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
    	                    // Lo transformo a Element
    	                    Element e = (Element) nodo;
    	                    // Obtengo sus hijos
    	                    NodeList hijos = e.getChildNodes();
    	                    // Recorro sus hijos
    	                    for (int j = 0; j < hijos.getLength(); j++) {
    	                        // Obtengo al hijo actual
    	                        Node hijo = hijos.item(j);
    	                        // Compruebo si es un nodo
    	                        if (hijo.getNodeType() == Node.ELEMENT_NODE) {
    	                            // Muestro el contenido
    	                            System.out.println(hijo.getNodeName() + ": " + hijo.getTextContent());
    	                        }
    	 
    	                    }
    	                    System.out.println("");
    	                }
    	 
    	            }
    	 
    	        } catch (ParserConfigurationException | SAXException | IOException ex) {
    	            System.out.println(ex.getMessage());
    	        }
    			
    			break;
    		case 4:
    			salir = true;
    			break;
    		}
		}
    	
    }
		
	
	public static void menuNuevosDatos(ArrayList<Producto> producto, ArrayList<Cliente> cliente, ArrayList<Pedidos> pedidos) throws IOException {
	
		
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
    	int option;
    	
		while(!salir) {
			//clearScreen();
			System.out.println("**************************");
			System.out.println("1. Añadir Cliente");
			System.out.println("2. Añadir Producto");
			System.out.println("3. Añadir Pedido");
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
		String[] Direccion = new String[5];
    	
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
    	System.out.print("Introduzca el numero: ");
    	Direccion[1] = in.readLine();
    	System.out.print("Introduzca la poblacion: ");
    	Direccion[2] = in.readLine();;
    	System.out.print("Introduzca el codigo Postal: ");
    	Direccion[3] = in.readLine();
    	System.out.print("Introduzca el Pais: ");
    	Direccion[4] = in.readLine();
    	
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
    	String DireccionEntrega[]=  new String[5];
        String Destinatario;
    	String FechaEntrega;
    	
    	System.out.println("Datos de Pedidos");
    	System.out.print("Producto: ");
    	Productos = in.readLine();
    	System.out.print("Cantidad : ");
    	Cantidad = in.readLine();
    	System.out.println("Direccion Entrega: ");
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
    
    public static void writeToFile(String xml, String fileName) throws IOException {
	    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
	    try {
			writer.write(xml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			writer.close();
		}
	}
    
    public static void guardar(ArrayList<Producto> producto, ArrayList<Cliente> cliente, ArrayList<Pedidos> pedidos) {
    	String header = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
		String root = "<Almacen>\n";
		String xml = "";
		String Client = "";
		String Product = "";
		String Pedidi = "";
		if(cliente.size()>0) {
			String CLientOpen= "\t<Clientes>\n";
			Client += CLientOpen;
			for (Cliente a: cliente) {
				Client += a;
				//System.out.println(xml);
			}
			String CLientClose= "\t</Clientes>\n";
			Client += CLientClose;
		}
		
		if(producto.size()>0) {
			String ProdOpen= "\t<Productos>\n";
			Product += ProdOpen;
			for (Producto b: producto) {
				Product += b;
				//System.out.println(xml);
			}
			String ProductClose= "\t</Productos>\n";
			Product += ProductClose;
		}
		
		if(pedidos.size()>0) {
			String PedOpen= "\t<Pedidos>\n";
			Pedidi+= PedOpen;
			for (Pedidos c: pedidos) {
				Pedidi += c;
				//System.out.println(xml);
			}
			String PedClose= "\t</Pedidos>\n";
			Pedidi += PedClose;
		}
		
		
	
		String closeRoot = "</Almacen>\n";
		xml += header + root + Client + Product + Pedidi + closeRoot ;
		System.out.println(xml);
		try {
			writeToFile(xml, "xmlFile.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
    
	public static void main( String[] args ) throws IOException
    {	
		ArrayList<Producto> producto = new ArrayList<Producto>();
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
		ArrayList<Pedidos> pedidos = new ArrayList<Pedidos>();
    	Scanner sn = new Scanner(System.in);
    	boolean salir = false;
    	int option;
    	
    	while(!salir) {
    		menuPrincipal();
    		option = sn.nextInt();
    		
    		switch(option) {
    		case 1:
    			menuVisualizarAlmacen(producto,cliente,pedidos);
    			break;
    		case 2:
    			menuNuevosDatos(producto,cliente,pedidos);
    			break;
    		case 3:
    			guardar(producto, cliente, pedidos);
    			sn.close();
    			salir = true;
    			break;
    			
    		}
    		
    		
    	}
    	
    }
}
