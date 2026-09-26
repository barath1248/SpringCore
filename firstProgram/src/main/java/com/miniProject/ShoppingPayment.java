package com.miniProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("pay")

public class ShoppingPayment {

	IPayment paymentMode;
	
	public void payment() {
		if(paymentMode.paymentVerification()) {
			System.out.println("payment is done through "+ paymentType());
		}
		else {
			System.out.println("Please choose valid paymentMode");
		}
	}
    
	@Autowired
	public void setPaymentMode(IPayment paymentMode) {
		this.paymentMode = paymentMode;
	}
	
	public String paymentType(){
		
		    if(paymentMode instanceof PhonePay) {
	            return "PhonePay";
	        }
	        else if (paymentMode instanceof Paytm) {
	            return "Paytm";
	        }
	        else if (paymentMode instanceof Gpay) {
	            return "Gpay";
	        }
	        else {
	            return "Card";
	        }
	}

}
