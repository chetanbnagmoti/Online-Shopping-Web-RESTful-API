package org.fi.finalapp.services;



import org.fi.finalapp.dto.ATMCardDTO;
import org.fi.finalapp.entity.ATMCardEntity;
import org.fi.finalapp.repository.ATMCardRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ATMCardServiceImpl implements ATMCardServices {

	@Autowired
	ATMCardRepository repositoryATMCard;
	
	@Override
	public ATMCardDTO authenticateATMCardUser(int cardNO, String expiryDate) {
		ATMCardEntity user = repositoryATMCard.authenticateATMCardUser(cardNO, expiryDate);
		ATMCardDTO dto = new ATMCardDTO();
		BeanUtils.copyProperties(user, dto);
		dto.setExpiryDate("******");
		return dto;
	}

	@Override
	public boolean updateATMCardEntity(float balance, int cardNO) {
		try {
			repositoryATMCard.updateATMCardEntity(balance, cardNO);
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateATMCardEntityByCardNo(float balance, int cardNO) {
		try {
			repositoryATMCard.updateATMCardEntity(balance, cardNO);
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}
	}

	@Override
	public String addNew(ATMCardDTO objATMCardDTO) {
		ATMCardEntity entityATMCardEntity = new ATMCardEntity();
		// Introspection
		
		BeanUtils.copyProperties(objATMCardDTO, entityATMCardEntity);
		entityATMCardEntity.setBalance(000);
		 repositoryATMCard.save(entityATMCardEntity);
		 
		return "Requred Insert";
	}

	@Override
	public String blockCard(int cardNO) {
		repositoryATMCard.deleteById(cardNO);
		return "Delete Card";
	}

}
