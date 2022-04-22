package net.LiskovSubstitution;

public class HCN extends Shape {
	public HCN() {
		super.setSocanh(2);
	}
	
	@Override
	public void addSide(double height, double width) {
		super.dodai[0] = height;
		super.dodai[1] = width;
	}
	
	@Override
	public double calArea() {
		return super.dodai[0] * super.dodai[1];
	}
}

