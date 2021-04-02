package died.lab01.problema01;

public class App {
	public static void main (String[] args) {
		//Creación de puntos
		Punto P1 = new Punto (0f,2f);
		Punto P2 = new Punto (1f,3f);
		Punto P3 = new Punto (1f,1f);
		Punto P4 = new Punto (0f,0f);
		
		//Creacion de rectas
		Recta R1 = new Recta (P1,P2);
		Recta R2 = new Recta (P3,P4);
		
		//Salida en pantalla
		System.out.println("La pendiente de la recta R1 es: "+ R1.pendiente());
		System.out.println("Recta R1 es igual a recta R2: "+ R1.equals(R2));
		System.out.println("Recta R1 es paralela a recta R2: "+ R1.paralelas(R2));
	}
}
