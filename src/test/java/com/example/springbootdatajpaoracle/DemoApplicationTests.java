package com.example.springbootdatajpaoracle;

import com.example.springbootdatajpaoracle.domain.Customer;
import com.example.springbootdatajpaoracle.repository.CustomerRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	DataSource dataSource;

	@Test
	public void contextLoads() throws SQLException {
		Assert.assertNotNull(dataSource.getConnection());
	}

	@Test
	@Transactional//Automatically rollback once transaction will complete.
	public void testCustomer()
	{   Customer customer=new Customer("raja","reddy");
		customerRepository.save(customer);
	}
}
