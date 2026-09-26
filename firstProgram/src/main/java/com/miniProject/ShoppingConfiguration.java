package com.miniProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
	@PropertySource("classpath:com/miniProject/OnlinePayment.properties"),
	@PropertySource("classpath:com/miniProject/ICICI.properties"),
	@PropertySource("classpath:com/miniProject/SBI.properties"),
})
@ComponentScan(basePackages = "com.miniProject")
public class ShoppingConfiguration {
	
	@Autowired
	Environment environment;

	@Bean
	
	public PhonePay phonepay() {
		PhonePay phonepay = new PhonePay();
		phonepay.setQRcode(environment.getProperty("phonePayQR"));
		phonepay.setName(environment.getProperty("name"));
		return phonepay;
	}

	@Bean
	@Primary
	public Paytm paytm() {
		Paytm paytm = new Paytm();
		paytm.setQRcode(environment.getProperty("paytmQR"));
		paytm.setName(environment.getProperty("name"));
		return paytm;
	}

	@Bean
	public Gpay gpay() {
		Gpay gpay = new Gpay();
		gpay.setQRcode(environment.getProperty("gpayQR"));
		gpay.setName(environment.getProperty("name"));
		return gpay;
	}

	@Bean
	public Card card() {
		Card card = new Card();
		card.setCardName(environment.getProperty("firstCard"));
		card.setCardNumber(environment.getProperty("firstcardNumber"));
		return card;
	}
}
