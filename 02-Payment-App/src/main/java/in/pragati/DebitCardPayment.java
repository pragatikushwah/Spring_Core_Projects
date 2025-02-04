package in.pragati;

public class DebitCardPayment implements IPayment {

	@Override
	public boolean paybill(double amt) {
		System.out.println("DebitCardPayment processing");
		return true;
	

	}

}
