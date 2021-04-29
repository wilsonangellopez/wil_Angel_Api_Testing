/**
 * 
 */
package com.globant.api.testing.wil.angel.utils;

import java.awt.List;
import java.util.ArrayList;

import com.github.javafaker.Faker;
import com.globant.api.testing.wil.angel.pojo.BankPojo;


/**
 * @author wilson.angel
 *
 */
public class DataGenerator {
	
	Faker faker = new Faker();
	
	 /***
     * Method to return a Object with data created using faker Lib
     * @return obj.BankInfo
     */
	public BankPojo dataGenerator() {
		
		BankPojo bankPojo = new BankPojo();
		
		bankPojo.setName(faker.name().firstName());
		bankPojo.setLast_Name(faker.name().lastName());
		bankPojo.setAccount_Number(faker.number().toString());
		bankPojo.setAmount(faker.number().digit());
		bankPojo.setTransaction_type(faker.random().nextInt(0, 3).toString());
		bankPojo.setEmail(faker.internet().emailAddress());
		bankPojo.setActive(faker.random().nextBoolean().toString());
		bankPojo.setCountry(faker.address().country());
		bankPojo.setTelephone(faker.phoneNumber().cellPhone());
		
		System.out.println("<<dato generado:>> id: " + bankPojo.getId()+ "- nombre: " + bankPojo.getName());
		return bankPojo;
		
	}

	 /***
     * Method to return a bank pojo list with data created using faker Lib
     * @return ArrayList.BankData
     */
    public ArrayList<BankPojo> generateData(int quantity) {

        ArrayList<BankPojo> bankData = new ArrayList<BankPojo>();

        for (int i = 0; i < quantity ; i++) {
        	
        	bankData.add(i,dataGenerator());
            System.out.println("BankInfo [" + i + "]" + bankData);
        }
        
        
        return bankData;
    }


}
