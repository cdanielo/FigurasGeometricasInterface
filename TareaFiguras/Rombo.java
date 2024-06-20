
public class Rombo implements FiguraGeometrica {
	private String nombre;
	private double diagonalmenor;
	private double diagonalmayor;
	private double lado;
	
	public Rombo(String nombre, double diagonalmenor, double diagonalmayor, double lado) {
		super();
		this.nombre = nombre;
		this.diagonalmenor = diagonalmenor;
		this.diagonalmayor = diagonalmayor;
		this.lado = lado;
	}//Constructor
	
	public double calcularArea() {
		return(diagonalmayor*diagonalmenor)/2;
	}//caluclarArea
	
	public double calcularPerimetro() {
		return(lado*4);
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDiagonalmenor() {
		return diagonalmenor;
	}

	public void setDiagonalmenor(double diagonalmenor) {
		this.diagonalmenor = diagonalmenor;
	}

	public double getDiagonalmayor() {
		return diagonalmayor;
	}

	public void setDiagonalmayor(double diagonalmayor) {
		this.diagonalmayor = diagonalmayor;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}//Get and Set

	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", diagonalmenor=" + diagonalmenor + ", diagonalmayor=" + diagonalmayor
				+ ", lado=" + lado + "]";
	}//toString

}//classRombo
