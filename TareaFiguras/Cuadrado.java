
public class Cuadrado implements FiguraGeometrica {
	private String nombre;
	private double lado;
	public Cuadrado(String nombre, double lado) {
		super();
		this.nombre = nombre;
		this.lado = lado;
	}//Constructor
	
	public double calcularArea() {
		return(lado*lado);
	}//caluclarArea
	
	public double calcularPerimetro() {
		return(lado+lado+lado+lado);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}//getters and setters
	@Override
	public String toString() {
		return "Cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
	}//toString
	
	
	
	
	
	
	
}//classCuadrado
