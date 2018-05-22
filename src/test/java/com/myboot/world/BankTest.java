package com.myboot.world;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


/**
 * Created by github.com/ufo2mstar for Project:myboottry on 05/21/2018.
 */
class BankTest {
	private Bank bank;
	
	@BeforeEach
	void setUp() {
		bank = new Bank();
	}
	
	@Test
	void test_init(){
		System.out.println(bank);
		assertThat(bank.clients,is(not(nullValue())));
		assertThat(bank.clients.size(),is(0));
	}
}