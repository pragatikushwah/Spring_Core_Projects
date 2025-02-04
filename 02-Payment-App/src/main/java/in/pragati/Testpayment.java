package in.pragati;

public class Testpayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RestaurantService service=new RestaurantService();
		//service.payment=new DebitCardPayment();//Fi
		RestaurantService service=new RestaurantService(new CreditCardPayment());
		//CI
		service.setPayment(new DebitCardPayment());//SI
		service.collectBill(1300);

	}

}
//" java.lang.NullPointerException: Cannot , need to initialize payment variable