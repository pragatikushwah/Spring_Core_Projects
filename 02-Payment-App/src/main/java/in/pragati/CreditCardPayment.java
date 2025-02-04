package in.pragati;

public class CreditCardPayment implements IPayment {

	@Override
	public boolean paybill(double amt) {
		System.out.println("CreditCardPayment processing ");
		return true;
		

	}

}
