package com.local.microservices.NAGPOrderService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NagpOrderServiceApplication {

	private static SimpleDateFormat df=new SimpleDateFormat("dd-MMM-yyyy");
	
	public static void main(String[] args) {
		SpringApplication.run(NagpOrderServiceApplication.class, args);
	}
	
@GetMapping("/orders/{userId}")
public List<Order> getOrderForUser(@PathVariable Long userId) throws ParseException
{
	List<Order> orders=new ArrayList<>();
	orders.add(new Order(1l, 250l, df.parse("14-Apr-2020")));
	orders.add(new Order(2l, 450l, df.parse("15-Apr-2020")));
	return orders;
}

}
