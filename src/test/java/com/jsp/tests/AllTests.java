package com.jsp.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestBancoJdbc.class, TestDeveValidarMetodoLogin.class })
public class AllTests {

}
