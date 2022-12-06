package ar.com.codoacodo.inteface.domain;

public class Articulo {
	private Long id;
	private String titulo;
	private String autor;
	private Float precio;
	private String img;
	
	
	
	public Articulo(String titulo, String autor, Float precio, String img) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.img = img;
	}



	public Articulo(Long id, String titulo, String autor, Float precio, String img) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.img = img;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public Float getPrecio() {
		return precio;
	}



	public void setPrecio(Float precio) {
		this.precio = precio;
	}



	public String getImg() {
		return img;
	}



	public void setImg(String img) {
		this.img = img;
	}
	
	public void detalle() {
		//mostar por consola los datos
		System.out.println("Imagen: " + img);
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor:" + autor);
		System.out.println("Precio:" + precio);
	}
	
	public String toString() {
		return "Articulo [id=" + id + ", img=" + img + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio
				+ "]";
	}
	
}
