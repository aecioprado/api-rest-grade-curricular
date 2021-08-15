package com.jsp.tests;

import org.junit.Test;

import com.jsp.util.SingleConnectionDb;

public class TestBancoJdbc {
		
	@Test
	public void initBanco() {
		
		SingleConnectionDb.getConnection();
		System.out.println("funcionou.");
	}

}
