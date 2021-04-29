package com.globant.api.testing.wil.angel.request;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.javafaker.Faker;
import com.globant.api.testing.wil.angel.pojo.BankPojo;
import com.globant.api.testing.wil.angel.url.URL;
import com.globant.api.testing.wil.angel.utils.DataGenerator;
import com.globant.api.testing.wil.angel.utils.UtilsGeneric;

import io.restassured.response.Response;

public class MethodsToCreate_Post extends UtilsGeneric {

	URL url = new URL();


	public MethodsToCreate_Post() {

	}

	/***
	 * Method to make the post with the data generated 
	 */
	public void sendData(int quantity) {


		DataGenerator dataGenerator = new DataGenerator();
		ArrayList<BankPojo> bankListTransInfo =  dataGenerator.generateData(quantity);

		Map<String, String> bodyGenerated = new HashMap<String, String>();


		for (int i = 0; i < quantity; i++) {

			System.out.println("bankListTransInfo.get(i).getName() " + bankListTransInfo.get(i).getName());

			bodyGenerated.put("name", bankListTransInfo.get(i).getName());
			bodyGenerated.put("lastName", bankListTransInfo.get(i).getLast_Name());
			bodyGenerated.put("accountNumber", bankListTransInfo.get(i).getAccount_Number());
			bodyGenerated.put("amount", bankListTransInfo.get(i).getAmount());
			bodyGenerated.put("transactionType", bankListTransInfo.get(i).getTransaction_type());
			bodyGenerated.put("email", bankListTransInfo.get(i).getEmail());
			bodyGenerated.put("active", bankListTransInfo.get(i).getAmount());
			bodyGenerated.put("country", bankListTransInfo.get(i).getCountry());
			bodyGenerated.put("telephone", bankListTransInfo.get(i).getTelephone());

			Response response;
			response = given().contentType("application/json").body(bodyGenerated).when().post(url.getUrlPost().toString());

			response.then().extract().response();
			response.then().statusCode(201);

			getWait();
		}
	}
	
	
	

	/***
	 * Method to make the post  with the data generated
	 * @return  the last element created
	 */
	public BankPojo sendDataAndReturn(int quantity) {


		DataGenerator dataGenerator = new DataGenerator();
		ArrayList<BankPojo> bankListTransInfo =  dataGenerator.generateData(quantity);

		Map<String, String> bodyGenerated = new HashMap<String, String>();


		for (int i = 0; i < quantity; i++) {

			System.out.println("bankListTransInfo.get(i).getName() " + bankListTransInfo.get(i).getName());

			bodyGenerated.put("name", bankListTransInfo.get(i).getName());
			bodyGenerated.put("lastName", bankListTransInfo.get(i).getLast_Name());
			bodyGenerated.put("accountNumber", bankListTransInfo.get(i).getAccount_Number());
			bodyGenerated.put("amount", bankListTransInfo.get(i).getAmount());
			bodyGenerated.put("transactionType", bankListTransInfo.get(i).getTransaction_type());
			bodyGenerated.put("email", bankListTransInfo.get(i).getEmail());
			bodyGenerated.put("active", bankListTransInfo.get(i).getAmount());
			bodyGenerated.put("country", bankListTransInfo.get(i).getCountry());
			bodyGenerated.put("telephone", bankListTransInfo.get(i).getTelephone());
			
			Response response;
			response = given().contentType("application/json").body(bodyGenerated).when().post(url.getUrlPost().toString());

			response.then().extract().response();
			response.then().statusCode(201);

			getWait();
		}
		
		return bankListTransInfo.get(bankListTransInfo.size()-1);
	}
	
	


}
