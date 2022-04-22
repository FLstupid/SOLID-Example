package net.Open_Closed;

public class Customer {
	private String name;
	private int type_customer;

	public int promotionFee(int fee, int typeCustomer) {
		// TODO Auto-generated method stub
		if (typeCustomer == 1)
			return fee * 10/100;
		else if (typeCustomer == 2)
			return fee * 20/100;
		else
			return fee * 5/100;
	}

	public int getType_customer() {
		return type_customer;
	}

	public void setType_member(int type_customer) {
		this.type_customer = type_customer;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

