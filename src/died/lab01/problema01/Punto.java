package died.lab01.problema01;

public class Punto {
	
	float x=0;
	
	float y=0;
	
	public Punto(float coordX, float coordY) {
		this.x = coordX;
		this.y = coordY;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public boolean equals(Object otroPunto) {
		if (otroPunto instanceof Punto && ((Punto) otroPunto).x==this.x && ((Punto) otroPunto).y == this.y) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
