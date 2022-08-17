package com.practica.entity;

import javax.persistence.Id;

public class Venta {

	@Id
	private Integer idVenta;
	private String DetalleVenta;
	private Integer idProducto;
	private String nombreProducto;
	private Double precioUnitario;
	private Integer numeroExistencia;
	private String descripcion;
	private Integer idCategoria;
	
	public Venta(Integer idVenta, String detalleVenta, Integer idProducto, String nombreProducto, Double precioUnitario,
			Integer numeroExistencia, String descripcion, Integer idCategoria) {
		super();
		this.idVenta = idVenta;
		DetalleVenta = detalleVenta;
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precioUnitario = precioUnitario;
		this.numeroExistencia = numeroExistencia;
		this.descripcion = descripcion;
		this.idCategoria = idCategoria;
	}

	public Integer getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	public String getDetalleVenta() {
		return DetalleVenta;
	}

	public void setDetalleVenta(String detalleVenta) {
		DetalleVenta = detalleVenta;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public Integer getNumeroExistencia() {
		return numeroExistencia;
	}

	public void setNumeroExistencia(Integer numeroExistencia) {
		this.numeroExistencia = numeroExistencia;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Venta() {}
	
	
}
