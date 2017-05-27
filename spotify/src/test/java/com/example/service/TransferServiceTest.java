package com.example.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Account;
import com.example.repository.IAccountRepository;
import com.example.repository.service.TransferService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransferServiceTest {

	@Autowired
	TransferService service;

	@Autowired
	IAccountRepository accountRepository;
	@Test
	public void testTransfer() throws Exception {
		Account c1 = new Account();
		c1.setNumero("001");
		c1.setSaldo(1000d);
		Account c2 = new Account();
		c2.setNumero("002");
		c2.setSaldo(100d);
		accountRepository.save(c1);
		accountRepository.save(c2);

		service.transfer("002", "001", 50);
		
		Account c = accountRepository.get("001");
		Assert.assertEquals(c.getSaldo(), new Double(1050d));

		service.transfer("001", "002", 2000);
		Assert.assertEquals(c.getSaldo(), new Double(1050d));

	}

}
