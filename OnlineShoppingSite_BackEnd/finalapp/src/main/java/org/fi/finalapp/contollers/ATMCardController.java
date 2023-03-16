package org.fi.finalapp.contollers;

import org.fi.finalapp.dto.ATMCardDTO;
import org.fi.finalapp.services.ATMCardServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Card")
public class ATMCardController {

	@Autowired
	ATMCardServices ATMCardServices;

	@PostMapping("authenticateATMCardUser")
	public ATMCardDTO authenticateATMCardUser(@RequestParam("cardNO") int cardNO,
			@RequestParam("expiryDate") String expiryDate) {
		return ATMCardServices.authenticateATMCardUser(cardNO, expiryDate);

	}

	@PutMapping("/updateATMCardEntity")
	public boolean updateATMCardEntity(@RequestParam("balance") float balance, @RequestParam("cardNO") int cardNO) {
		return ATMCardServices.updateATMCardEntity(balance, cardNO);

	}
	
	@PostMapping("/updateATMCardEntity/{cardNO}")
	public boolean updateATMCardEntityByCardNo(@RequestParam("balance") float balance, @PathVariable("cardNO") int cardNO) {
		return ATMCardServices.updateATMCardEntityByCardNo(balance, cardNO);

	}
	
	@PostMapping("/newCardUser")
	public String addNew(@RequestBody ATMCardDTO objATMCardDTO) {
		return ATMCardServices.addNew(objATMCardDTO);
	}
	

	@GetMapping("/blockCard")
	public String blockCard(@RequestParam("cardNO") int cardNO) {
		
		return ATMCardServices.blockCard(cardNO);
	}
	
}
