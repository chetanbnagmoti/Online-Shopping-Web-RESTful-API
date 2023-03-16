package org.fi.finalapp.services;


import org.fi.finalapp.dto.ATMCardDTO;


public interface ATMCardServices {

	public ATMCardDTO authenticateATMCardUser(int cardNO,String expiryDate);

	public boolean updateATMCardEntity(float balance,int cardNO);

	public boolean updateATMCardEntityByCardNo(float balance,int cardNO);

	public String addNew(ATMCardDTO objATMCardDTO);

	public String blockCard(int cardNO);
}
