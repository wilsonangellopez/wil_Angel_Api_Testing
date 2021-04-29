package com.globant.api.testing.wil.angel.utils;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import com.globant.api.testing.wil.angel.pojo.BankPojo;
import com.globant.api.testing.wil.angel.url.URL;

import io.restassured.response.Response;

public class UtilsGeneric {

	URL url;

	public UtilsGeneric() {
		// TODO Auto-generated constructor stub
	}


	public void getWait() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/***
	 * Method to find if the endpoint has elements
	 * @return it returns a boolean
	 */
	public boolean endPointHasData(){

		Response response;
		response = given().contentType("application/json").when().get(url.getUrlPost());

		List<Object> numeros = new ArrayList();
		System.out.println("cuantos registros tenemos: " + response.jsonPath().getList("id").size() );

		return (response.jsonPath().getList("id").size()>0)?true:false;

	}

	/***
	 * Method to count elements in the endpoint 
	 * @return it returns the number of elements
	 */
	public int getQuantityOfElements(){

		getWait();
		Response response;

		response = given().contentType("application/json").when().get(url.getUrlPost());
		System.out.println("Metodo getQuantityOfElements - Num. registros: " + response.jsonPath().getList("id").size());

		return response.jsonPath().getList("id").size();

	}

	/***
	 * Method to verify if the email exist in the endpoint 
	 * @return it returns boolean 
	 */
	public boolean emailCheck(String email, Response response){

		List<Object> listEmails = new ArrayList();

		for (int i = 1; i < getQuantityOfElements(); i++) {
			listEmails = response.jsonPath().getList("email");
			System.out.println("LISTA DE EMAILS" + listEmails);
		}
		return listEmails.contains(email)?true:false;

	}


	/***
	 * Method to get the last email exist in the endpoint 
	 * @return it returns the email
	 */
	public String findTheLastEmail(Response response){

		List<String> strList = response.jsonPath().getList("email");
		return  strList.get(strList.size()-1).toString();

	}



	/***
	 * Method to get the last id exist in the endpoint 
	 * @return it returns the id
	 */
	public String findTheLastElementCreated(Response response){

		List<String> strList = response.jsonPath().getList("id");
		return  strList.get(strList.size()-1).toString();

	}


	/***
	 * Method to get the last email exist in the endpoint 
	 * @return it returns the email
	 
	public boolean findAccountXXX(String id, Response response){

		List<Object> listEmails = new ArrayList();

		for (int i = 1; i < getQuantityOfElements(); i++) {
			listEmails = response.jsonPath().getList("id");
			System.out.println(listEmails);
		}
		return listEmails.contains(id)?true:false;

	}*/


}
