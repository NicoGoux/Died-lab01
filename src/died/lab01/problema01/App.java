package died.lab01.problema01;

public class App {
	public static void main (String[] args) {
		//Creación de puntos
		Punto P1 = new Punto (2f,2f);
		Punto P2 = new Punto (1f,0f);
		Punto P3 = new Punto (3f,3f);
		
		//Creacion de rectas
		Recta R1 = new Recta (P1,P2);
		Recta R2 = new Recta (P1,P3);
		
		//Salida en pantalla
		System.out.println("La pendiente de la recta R1 es: "+ R1.pendiente());
		System.out.println("Recta R1 es igual a recta R2: "+ R1.equals(R2));
	}
}
