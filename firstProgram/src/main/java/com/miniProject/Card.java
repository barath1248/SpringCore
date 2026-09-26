package com.miniProject;

public class Card implements IPayment {
	private String cardName;
	private String cardNumber;

	@Override
	public boolean paymentVerification() {
		
		return ((cardName.equals("ICICI")|| cardName.equals("SBI")) && cardNumber.length()==13);
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public String toString() {
		return "Card [CardName=" + cardName + ", cardNumber=" + cardNumber + "]";
	}

}
