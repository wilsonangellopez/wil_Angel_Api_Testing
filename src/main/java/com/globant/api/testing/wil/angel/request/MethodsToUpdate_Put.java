package com.globant.api.testing.wil.angel.request;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import com.globant.api.testing.wil.angel.url.URL;

import io.restassured.response.Response;

public class MethodsToUpdate_Put {
	
	
	URL url;

	public MethodsToUpdate_Put() {
		// TODO Auto-generated constructor stub
	}

	/***
	 * Method to update by id in the endpoint 
	 * @return it returns a boolean
	 */
	public boolean updateAccount(int id, String accountNumber) {
		
		System.out.println("id a cambiar" + id);


		Response response;
		response = given().contentType("application/json").when().get(url.getUrlGet()+id);
		System.out.println(response);

		Map<String, String> user = new HashMap<String, String>();
		user.put("name", response.jsonPath().getString("name"));
		user.put("last_Name", response.jsonPath().getString("last_Name"));
		user.put("accoutn_number", accountNumber);
		user.put("amount", response.jsonPath().getString("amount"));
		user.put("Transaction_type", response.jsonPath().getString("Transaction_type"));
		user.put("email", response.jsonPath().getString("email"));
		user.put("active", response.jsonPath().getString("active"));
		user.put("country", response.jsonPath().getString("country"));
		user.put("telephone", response.jsonPath().getString("telephone"));
		
		response = given().contentType("application/json").body(user).when().put(url.getUrlUpdate()+id);

		//THEN
		response.then().extract().response();
		
		System.out.println("confirmacion cuenta modificada: " + response.jsonPath().getString("accountNumber"));
		
		int statusCode= response.getStatusCode();
		return (statusCode==200)?true:false; 
		
		
	    

		

	}

}
