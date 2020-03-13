package com.ufv.Practica1;

public class Pedidos {

	private String Productos;
	private String Cantidad;
	private String DireccionEntrega[] = new String[5];
	private String Destinatario;
	private String FechaEntrega;
	@Override
	public String toString() {//metodo para poner cada elemnto del arraylist en formato xml
		return "\t\t<Pedido>\n\t\t\t<Productos>"+ Productos +"</Productos>\n\t\t\t<Cantidad>"+ Cantidad +"</Cantidad>\n\t\t\t<Direccion>\n\t\t\t\t<Calle>" + DireccionEntrega[0] + "</Calle>\n\t\t\t\t<Numero>"+DireccionEntrega[1]+"</Numero>\n\t\t\t\t<Codigo_Postal>"+ DireccionEntrega[2] + "</Codigo_Postal>\n\t\t\t\t<Poblacion>" + DireccionEntrega[3] + "</Poblacion>\n\t\t\t\t<Pais>" + DireccionEntrega[4] + "</Pais>\n\t\t\t</Direccion>\n\t\t\t<Destinatario>"+Destinatario+"</Destinatario>\n\t\t\t<Fecha_entrega>" + FechaEntrega + "</Fecha_entrega>\n\t\t</Pedido>\n";
	}
	
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
