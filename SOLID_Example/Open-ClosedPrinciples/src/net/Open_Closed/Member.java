package net.Open_Closed;

public class Member extends Customer {
	private int point;
	
	public int promotionFee (int fee) {
		return fee * 10/100;
	}
	
	public void showPoint() {
		System.out.print(this.point);
	}
}

