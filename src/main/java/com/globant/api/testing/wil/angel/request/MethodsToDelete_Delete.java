package com.globant.api.testing.wil.angel.request;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import com.globant.api.testing.wil.angel.url.URL;
import com.globant.api.testing.wil.angel.utils.UtilsGeneric;

import io.restassured.response.Response;

public class MethodsToDelete_Delete extends UtilsGeneric {

	URL url;
	Response response;

	public MethodsToDelete_Delete() {
		// TODO Auto-generated constructor stub
	}


	/***
	 * Method to delete all the information stored by the API calls
	 */
	public void deleteElements(){

		for(int id=0; id<getQuantityOfElements()+20; id++){

			response = given().contentType("application/json").when().delete(url.getUrlDelte()+id);
			getWait();

		}
	}




}
