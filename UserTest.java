package kadai6to2;

import org.junit.jupiter.api.Test;

public class UserTest {
	
	@Test public void UserHandTest() {
		User u = new User();
		u.Hand(0);
	}
	
	@Test public void UserHandOverNumber() {
		try {
			User u = new User();
			u.Hand(5);
		}catch(IllegalArgumentException e) {
			System.out.println("グー、チョキ、パー、いずれにも該当しません。中断します");
		}
	}
}
