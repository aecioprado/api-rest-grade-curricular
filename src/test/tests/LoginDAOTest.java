package tests;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

import com.jsp.dao.LoginDAO;

public class LoginDAOTest {

	@Test
	public void testLoginDAO() {
		
		LoginDAO login = new LoginDAO();
		Assert.assertNotNull(login);
		System.out.println("ok");
	}

	@Test
	public void testValidarAutenticacao() {
		fail("Not yet implemented");
	}

}
