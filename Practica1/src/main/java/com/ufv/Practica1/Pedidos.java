package com.ufv.Practica1;

public class Pedidos {

	private String Productos;
	private String Cantidad;
	private String DireccionEntrega[];
	private String Destinatario;
	private String FechaEntrega;
	public Pedidos(String productos, String cantidad, String[] direccionEntrega, String destinatario,
			String fechaEntrega) {
		super();
		Productos = productos;
		Cantidad = cantidad;
		DireccionEntrega = direccionEntrega;
		Destinatario = destinatario;
		FechaEntrega = fechaEntrega;
	}
	public String getProductos() {
		return Productos;
	}
	public void setProductos(String productos) {
		Productos = productos;
	}
	public String getCantidad() {
		return Cantidad;
	}
	public void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}
	public String[] getDireccionEntrega() {
		return DireccionEntrega;
	}
	public void setDireccionEntrega(String[] direccionEntrega) {
		DireccionEntrega = direccionEntrega;
	}
	public String getDestinatario() {
		return Destinatario;
	}
	public void setDestinatario(String destinatario) {
		Destinatario = destinatario;
	}
	public String getFechaEntrega() {
		return FechaEntrega;
	}
	public void setFechaEntrega(String fechaEntrega) {
		FechaEntrega = fechaEntrega;
	}
	
}
