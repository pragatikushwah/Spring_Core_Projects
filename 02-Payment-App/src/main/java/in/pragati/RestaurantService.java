package in.pragati;

public class RestaurantService {
	IPayment payment;

	public RestaurantService() {
		System.out.println("RestaurantService constructor");
	}

	public RestaurantService(IPayment payment) {
		super();
		this.payment = payment;
	}

	public void setPayment(IPayment payment) {
		this.payment = payment;
	}

	public void collectBill(double amt) {
		boolean status = payment.paybill(amt);
		if (status) {
			System.out.println("payment success");
		} else {
			System.out.println("payment not completed");
		}

	}

}
