package com.miniProject;

public class PhonePay implements IPayment {

	private String QRcode;
	private String name;

	@Override
	public boolean paymentVerification() {
		String Mode=QRcode.substring(QRcode.indexOf("#")+1);

		return Mode.equals("PhonePay");
	}

	public void setQRcode(String qRcode) {
		QRcode = qRcode;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PhonePay [QRcode=" + QRcode + ", name=" + name + "]";
	}

}
