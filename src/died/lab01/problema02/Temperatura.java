package died.lab01.problema02;

public class Temperatura {
	private double grados;
	private Escala escala;
	
	public Temperatura() {
		this.grados =0;
		this.escala = Escala.CELCIUS;
	}
	
	public Temperatura(double grados,Escala newEscala) {
		this.grados = grados;
		this.escala = newEscala;
	}
	
	public String toString() {
		String retornoGrados = this.grados+"";
		if (this.escala == Escala.CELCIUS) {
			return retornoGrados.concat(" °C");
		}
		else {
			return retornoGrados.concat(" °F");
		}
	}
	
	public double asCelcius() {
		if (this.escala == Escala.CELCIUS) {
			return this.grados;
		}
		
		else {
			double gradosCelcius = ((this.grados - 32.0) * (5.0/9.0));
			return gradosCelcius;
		}
	}
	
	public double asFahrenheit() {
		if (this.escala == Escala.FAHRENHEIT) {
			return this.grados;
		}
		
		else {
			
			double gradosFahrenheit = ((9.0/5.0) * this.grados)+32.0;
			return gradosFahrenheit;
		}
	}
	
	public void aumentar(Temperatura temp) {
		if (this.escala == temp.escala) {
			if (temp.grados > 0) {
				this.grados += temp.grados;
			}
			
			else {
				System.out.println("La temperatura ingresada es menor o igual a 0.0");
			}
		}
		
		else {
			if (this.escala == Escala.CELCIUS) {
				this.grados += temp.asCelcius();
			}
			
			else {
				this.grados += temp.asFahrenheit();
			}
		}
	}
	
	public void disminuir(Temperatura temp) {
		if (this.escala == temp.escala) {
			if (temp.grados > 0) {
				this.grados -= temp.grados;
			}
			
			else {
				System.out.println("La temperatura ingresada es menor o igual a 0.0");
			}
		}
		
		else {
			if (this.escala == Escala.CELCIUS) {
				this.grados -= temp.asCelcius();
			}
			
			else {
				this.grados -= temp.asFahrenheit();
			}
		}
	}
}
