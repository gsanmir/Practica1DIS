package com.ufv.Practica1;

public class Cliente {
	
	private String  Nombre;
	private String 	Apellidos;
	private String 	Email;
	private int  Telefono;
	private String[]  Direccion = new String [5];
	@Override
	public String toString() {
		return "\t\t<Cliente>\n\t\t\t<Nombre>"+ Nombre +"</Nombre>\n\t\t\t<Apellidos>"+ Apellidos +"</Apellidos>\n\t\t\t<Email>"+ Email+"</Email>\n\t\t\t<Telefono>"+ Telefono +"</Telefono>\n\t\t\t<Direccion>\n\t\t\t\t<Calle>" + Direccion[0] + "</Calle>\n\t\t\t\t<Numero>"+Direccion[1]+"</Numero>\n\t\t\t\t<Codigo_Postal>"+ Direccion[2] + "</Codigo_Postal>\n\t\t\t\t<Poblacion>" + Direccion[3] + "</Poblacion>\n\t\t\t\t<Pais>" + Direccion[4] + "</Pais>\n\t\t\t</Direccion>\n\t\t</Cliente>\n";
	}
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