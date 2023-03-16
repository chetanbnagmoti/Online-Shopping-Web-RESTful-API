package org.fi.finalapp.dto;

public class ATMCardDTO {

	
	int cardNO;
	String expiryDate;
	float balance;
	
	public int getCardNO() {
		return cardNO;
	}
	public void setCardNO(int cardNO) {
		this.cardNO = cardNO;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
}
