package com.ufv.Practica1;


public class Producto {

	private String codigo;
	private String nombre;
	private String descripcion;
	private int stock;
	private int[] localizacion = new int[3];
	private int pendientes;
	
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


	public void setLocalización(int[] localizacion) {
		this.localizacion = localizacion;
	}


	public int getPendientes() {
		return pendientes;
	}


	public void setPendientes(int pendientes) {
		this.pendientes = pendientes;
	}




}