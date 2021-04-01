package died.lab01.problema01;

public class Recta {
	
	private Punto p1;
	private Punto p2;
	
	public Recta (Punto puntoPaso1, Punto puntoPaso2) {
		this.p1 = puntoPaso1;
		this.p2 = puntoPaso2;
	}
	
	public Recta () {
		p1 = new Punto (0,0);
		p2 = new Punto (1,1);
	}
	
	public float pendiente() {
		float pendienteRecta;
		pendienteRecta = ((this.p1).getY()-(this.p2).getY())/((this.p1).getX()-(this.p2).getX());
		return pendienteRecta;
	}
	
	public boolean paralelas (Recta otraRecta) {
		if (otraRecta.pendiente() == this.pendiente() && this.equals(otraRecta)==false) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public boolean equals(Object otraRecta) {
		if (otraRecta instanceof Recta) {
			if (((Recta) otraRecta).pendiente() == this.pendiente()) {
				if (((Recta) otraRecta).p1 != this.p1) {
					
					Recta raux = new Recta (((Recta) otraRecta).p1,this.p1);
					
					if (raux.pendiente()==this.pendiente()) {
						return true;
					}
					
					else {
						return false;
					}
				}
				
				else {
					Recta raux = new Recta (((Recta) otraRecta).p1, this.p2);
					
					if (raux.pendiente()==this.pendiente()) {
						return true;
					}
					
					else {
						return false;
					}
				}
			}
			
			else {
				return false;
			}
		}
		
		else {
			return false;
		}
	}
	
	public boolean compararNuevaRecta (Punto p) {
		Recta r1 = new Recta (p,this.p2);
		if (r1.pendiente()==this.pendiente()) {
			return true;
		}
		else {
			return false;
		}
	}
}
