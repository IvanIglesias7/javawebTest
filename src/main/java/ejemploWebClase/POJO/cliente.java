package ejemploWebClase.POJO;

public class cliente {

	private String nombre;
	private String apellido;
	private String apellido2;
	private String numerotlf;
	private String direccion;
	
	
	public cliente(String nombre, String apellido, String apellido2, String numerotlf, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.apellido2 = apellido2;
		this.numerotlf = numerotlf;
		this.direccion = direccion;
	}
	
	public cliente() {}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getApellido2() {
		return apellido2;
	}


	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	public String getNumerotlf() {
		return numerotlf;
	}


	public void setNumerotlf(String numerotlf) {
		this.numerotlf = numerotlf;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
