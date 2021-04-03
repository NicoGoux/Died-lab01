package died.lab01.problema03;

import died.lab01.problema02.*;

public class Registro {
	
	private int indiceMaximo=0;
	
	private String ciudad;
	private Temperatura[] historico;
	
	public Registro() {
		this.ciudad="-";
		this.historico = new Temperatura[30];
	}
	
	public Registro(String ciudadRegistro) {
		this.ciudad = ciudadRegistro;
		this.historico = new Temperatura[30];
	}

	public String getCiudad() {
		return ciudad;
	}
	
	void imprimir() {
		System.out.println("TEMPERATURAS REGISTRADAS EN: "+this.ciudad);
		
		int i = 1;
		for (Temperatura unaTemp : this.historico) {
			if (unaTemp == null) {
				System.out.println("Fin de registro\n");
				break;
			}
			else {
				System.out.println(i+" • "+unaTemp.toString());
			}
			i++;
		}
	}
	
	public void agregar(Temperatura t) {
		for (int i=0; i<this.historico.length;i++) {
			if (this.historico[i] == null) {
				this.historico[i] = t;
				return;
			}
			this.indiceMaximo++;
		}
	}
	
	public double mediaAsCelcius() {
		double totalTempCelcius = 0.0;
		int i = 1;
		for (Temperatura unaTemp : this.historico) {
			if (unaTemp != null) {
				totalTempCelcius+=unaTemp.asCelcius();
				i++;
			}
			else {
				break;
			}
		}
		double mediaCelcius = totalTempCelcius / (double)i;
		
		return mediaCelcius;
	}
	
	public double mediaAsFahrenheit() {
		double totalTempFahrenheit = 0.0;
		int i = 1;
		for (Temperatura unaTemp : this.historico) {
			if (unaTemp != null) {
				totalTempFahrenheit+=unaTemp.asFahrenheit();
				i++;
			}
			else {
				break;
			}
		}
		double mediaFahrenheit = totalTempFahrenheit / (double)i;
		
		return mediaFahrenheit;
	}
	
	public Temperatura temperaturaMaxima() {
		Temperatura maxima = this.historico[0];
		Registro aux = new Registro();
		aux.actualizarRegistroAux(this.historico);
		return aux.esMaximo(maxima);
	}
	
	private Temperatura esMaximo(Temperatura maxAux) {
		if (this.historico==null) {
			return maxAux;
		}
		
		else {
			if (this.historico[0].asCelcius() <= maxAux.asCelcius()) {
				this.actualizarRegistroAux(this.historico);
				return this.esMaximo(maxAux);
			}
			
			else {
				this.actualizarRegistroAux(this.historico);
				return this.esMaximo(this.historico[0]);
			}
		}
	}
	
	private void actualizarRegistroAux(Temperatura[] t) {
		if (t.length==1 || t[0]==null) {
			this.historico=null;
		}
		else {
			Temperatura [] auxArray = new Temperatura[(t.length-1)];
			System.arraycopy(t,1,auxArray,0,auxArray.length);
			this.historico = auxArray;
		}
	}
	
	
}
