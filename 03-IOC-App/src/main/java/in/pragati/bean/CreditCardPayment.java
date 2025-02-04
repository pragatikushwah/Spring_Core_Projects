package in.pragati.bean;

public class CreditCardPayment implements IPayment {
	public CreditCardPayment() {
		System.out.println("credit card constructor");
	}

	@Override
	public boolean payBill(double amt) {
		// TODO Auto-generated method stub
		System.out.println("CreditCard payment proccessing ....");
		return true;
	}

}


