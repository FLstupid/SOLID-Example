package net.LiskovSubstitution;

public abstract class Shape {
	private int socanh;
	double[] dodai;
	
	public double getSocanh() {
		return socanh;
	}
	public void setSocanh(int socanh) {
		this.socanh = socanh;
		this.dodai = new double[socanh];
	}
	
	public void addSide(double side) {
		
	};
	
	public void addSide(double height, double width) {
		
	};
	
	public double calArea() {
		return 0;
	}
}

