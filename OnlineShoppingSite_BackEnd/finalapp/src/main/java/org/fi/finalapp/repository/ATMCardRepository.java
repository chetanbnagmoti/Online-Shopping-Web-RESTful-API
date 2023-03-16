package org.fi.finalapp.repository;



import org.fi.finalapp.entity.ATMCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ATMCardRepository extends JpaRepository<ATMCardEntity, Integer> {

	
	//JPA-QL (HQL):-
	@Query(value="select objCard from ATMCardEntity objCard where objCard.cardNO=:cardNO and objCard.expiryDate=:expiryDate")
	public ATMCardEntity authenticateATMCardUser(@Param("cardNO")int cardNO,@Param("expiryDate")String expiryDate);
	
	//JPA-QL(HQL):-
	@Transactional
	@Modifying
	@Query(value="update ATMCardEntity  set balance=:balance where cardNO=:cardNO")
	public void  updateATMCardEntity(@Param("balance")float balance,@Param("cardNO")int cardNO);
}
