
public class UserService{
	
	public void printUserName(Integer id) {
		//id=100
		UserDao dao=new UserDao();
		String username=dao.getUserNameById(id);
		System.out.println("username :"+username);
		
	}

}

// if any changes in the dao class will effect UserService class
//to over come with this problem we need to develop our class
//with strategy design pattern 