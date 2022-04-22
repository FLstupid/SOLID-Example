package net.LiskovSubstitution;

public class HV extends Shape {
	public HV() {
		super.setSocanh(1);
	}
	
	@Override
	public void addSide(double side) {
		super.dodai[0] = side;
	}
	
	@Override
	public double calArea() {
		return super.dodai[0] * super.dodai[0];
	}
}

