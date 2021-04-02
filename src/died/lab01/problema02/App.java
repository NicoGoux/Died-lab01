package died.lab01.problema02;

public class App {
	public static void main (String[] args) {
		
		//Carga datos
		Temperatura dia1 = new Temperatura(30.0, Escala.CELCIUS);
		Temperatura dia2 = new Temperatura(55.0, Escala.FAHRENHEIT);
		
		//Salida datos
		System.out.println("T1 en C°: "+dia1.asCelcius());							
		System.out.println("T1 en F°: "+dia1.asFahrenheit());
		System.out.println("\n");
		System.out.println("T2 en C°: "+dia2.asCelcius());
		System.out.println("T2 en F°: "+dia2.asFahrenheit());
		
		//Aumento de temperatura Dia 2 y nueva salida de datos
		System.out.println("\n");
		dia2.aumentar(dia1);
		System.out.println("T1+T2 en C°: "+dia2.asCelcius());
		System.out.println("T1+T2 en F°: "+dia2.asFahrenheit());
		
		//Disminucion de temperatura Dia 1 y nueva salida de datos
		System.out.println("\n");
		dia1.disminuir(new Temperatura(10.0, Escala.CELCIUS));
		System.out.println("T1+T2 en C°: "+dia1.asCelcius());							
		System.out.println("T1+T2 en F°: "+dia1.asFahrenheit());
		
	}
}
