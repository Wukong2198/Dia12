package com.practica.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProducto;
	private String nombreProducto;
	private Double precioUnitario;
	private Integer numeroExistencia;
	private String descripcion;
	private Integer idCategoria;
	
	//@ManyToMany
	//@JoinTable(name = "producto_categoria",
		//	joinColumns=@JoinColumn(name="idProducto"),
			//inverseJoinColumns=@JoinColumn(name="idCategoria"))
	//private Set<Categoria> categoria;
	
	
	public Producto() {}
	
	public Producto(Long idProducto, String nombreProducto, Double precioUnitario, Integer numeroExistencia,
			String descripcion, Integer idCategoria, Set<Categoria> categoria) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precioUnitario = precioUnitario;
		this.numeroExistencia = numeroExistencia;
		this.descripcion = descripcion;
		this.idCategoria = idCategoria;
		//this.categoria = categoria;
	}
	
	public Long getIdProducto() { return idProducto; }
	//public Integer getIdProducto() {
		//return idProducto;
	//}
	public void setIdProducto(Long idProducto) {
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
	//public Set<Categoria> getCategoria() {
		//return categoria;
	//}
	//public void setCategoria(Set<Categoria> categoria) {
		//this.categoria = categoria;
	//}
	
	
	
	
}
