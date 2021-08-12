package com.jsp.tests;

import org.junit.Assert;
import org.junit.Test;

import com.jsp.model.UsuarioBean;

public class TestDeveValidarMetodoLogin {
	
	@Test
	public void senhaIguais() {
	UsuarioBean us = new UsuarioBean("Jose", "aecioprado", "aecioprado@gmail.com", "admin", "admin2");
	Assert.assertTrue(us.validaSenha(us.getSenha(), us.getConfirmaSenha()));
	
	}
}
