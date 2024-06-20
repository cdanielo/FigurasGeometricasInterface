
public class Main {
	public static void main(String[] args) {
		Triangulo bermudas = new Triangulo("Bermudas",20,10,15);
		Triangulo t = new Triangulo("TrianguloTE",250,175,145);
		Cuadrado bob = new Cuadrado("Bob Esponja",80);
		Rectangulo jhon = new Rectangulo("Elton Jhon", 78, 49);
		Rombo Aldous = new Rombo("Adous Huxley", 25,26,15); 
		Romboide jose = new Romboide ("Jose Saramago", 78,46);
		Trapecio miguel = new Trapecio ("Miguel Bose", 10,11,12,13,14,15,25);
	
		imprimirCalculo(bermudas);
		imprimirCalculo(t);
		imprimirCalculo(bob);
		imprimirCalculo(jhon);
		imprimirCalculo(Aldous);
		imprimirCalculo(jose);
		imprimirCalculo(miguel);
	}// main
	
	public static void imprimirCalculo (FiguraGeometrica f) {
		System.out.println(f);
		System.out.println("+===================================");
		System.out.println(" El area del ["+ f.getNombre() + "] es : " + f.calcularArea());
		System.out.println(" El perimeto de [" + f.getNombre() + "] es : " + f.calcularPerimetro());
		System.out.println("+===================================");
	}//imprimirCalculo
	
}//classMain
