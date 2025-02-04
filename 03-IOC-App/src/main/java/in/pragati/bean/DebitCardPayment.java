package in.pragati.bean;

public class DebitCardPayment implements IPayment {
	public DebitCardPayment() {
		System.out.println(" debit card constructor");
	}

	@Override
	public boolean payBill(double amt) {
		// TODO Auto-generated method stub
		System.out.println(" debitCard payment proccessing ....");
		return true;
	}

}