package org.fi.finalapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cards_0013")
public class ATMCardEntity {

	@Id
	@Column(name="cardno")
	int cardNO;
	
	@Column(name="expirydate")
	String expiryDate;
	
	@Column(name="balance")
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
