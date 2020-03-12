package com.ufv.Practica1;

public class Cliente {
	
	private String  Nombre;
	private String 	Apellidos;
	private String 	Email;
	private int  Telefono;
	private String[]  Direccion = new String [4];
	
	public Cliente(String nombre, String apellidos, String email, int telefono, String[] direccion) {
		super();
		Nombre = nombre;
		Apellidos = apellidos;
		Email = email;
		Telefono = telefono;
		Direccion = direccion;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getTelefono() {
		return Telefono;
	}
	public void setTelefono(int telefono) {
		Telefono = telefono;
	}
	public String[] getDireccion() {
		return Direccion;
	}
	public void setDireccion(String[] direccion) {
		Direccion = direccion;
	}
	
	
	
	
	
	

}