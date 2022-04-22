package net.LiskovSubstitution;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape hcn = new HCN();
		hcn.addSide(2,3);
		System.out.print(hcn.calArea() + "\n");
		
		Shape hv = new HV();
		hv.addSide(5);
		System.out.print(hv.calArea() + "\n");
	}
}

