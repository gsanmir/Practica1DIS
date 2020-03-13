package com.ufv.Practica1;


public class Producto {

	private String codigo;
	private String nombre;
	private String descripcion;
	private int stock;
	private int[] localizacion = new int[3];
	private int pendientes;
	
	@Override
	public String toString() {//metodo para poner cada elemnto del arraylist en formato xml
		return "\t\t<Producto>\n\t\t\t<Codigo>"+ codigo +"</Codigo>\n\t\t\t<Nombre>"+ nombre +"</Nombre>\n\t\t\t<Descripcion>"+ descripcion +"</Descripcion>\n\t\t\t<Stock>"+ stock +"</Stock>\n\t\t\t<Localizacion>\n\t\t\t\t<Pasillo>" + localizacion[0] +"</Pasillo>\n\t\t\t\t<Estanteria>"+ localizacion[1]+"</Estanteria>\n\t\t\t\t<Estante>"+ localizacion[2] + "</Estante>\n\t\t\t</Localizacion>\n\t\t\t<Pendientes>" + pendientes + "</Pendientes>\n\t\t</Producto>\n";
	}
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	
	// Constructor
	public Producto(String codigo, String nombre, String descripcion, int stock, int[] localizacion, int pendientes) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.stock = stock;
		this.localizacion = localizacion;

	}
	
	// Getter y setters 
	//Las etiquetaremos con atributos xml
	

	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public int[] getLocalizacion() {
		return localizacion;
	}


	public void setLocalizacion(int[] localizacion) {

		this.localizacion = localizacion;
	}


	public int getPendientes() {
		return pendientes;
	}


	public void setPendientes(int pendientes) {
		this.pendientes = pendientes;
	}




}