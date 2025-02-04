package in.pragati.bean;

public class RestuarantServices {
	private IPayment payment;

	public RestuarantServices() {
		System.out.println("RestuarantServices constructor..");
	}

	public RestuarantServices(IPayment payment) {
		this.payment = payment;
	}

	public void setPayment(IPayment payment) {
		this.payment = payment;
	}

	public void collectPayment(double amt) {
		boolean status = payment.payBill(amt);

		if (status)
			System.out.println("payment done ..!");
		else
			System.out.println("payment failed  :( try again");

	}


}
