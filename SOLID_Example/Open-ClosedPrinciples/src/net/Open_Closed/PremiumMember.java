package net.Open_Closed;

public class PremiumMember extends Customer {
	private String Visa;
	
	public int promotionFee (int fee) {
		return fee * 20/100;
	}
	
	public void showVisa() {
		System.out.print(this.Visa);
	}	
}

