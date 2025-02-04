package in.pragati.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		// start the ioc , object create
		RestuarantServices rs1 = context.getBean(RestuarantServices.class);
		// get the object from the ioc
		System.out.println(rs1.hashCode());
		rs1.collectPayment(12000);
		// call the target class method using this object

	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		RestuarantServices services= new RestuarantServices(new DebitCardPayment());
//		//CI
//		services.setPayment(new CreditCardPayment());//SI
//		//services.payment=new DebitCardPayment(); // FI
//		services.collectPayment(1500.65);
//	}

}
