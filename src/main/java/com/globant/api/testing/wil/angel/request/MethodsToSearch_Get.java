package com.globant.api.testing.wil.angel.request;

import static io.restassured.RestAssured.given;

import com.globant.api.testing.wil.angel.url.URL;
import com.globant.api.testing.wil.angel.utils.UtilsGeneric;

import io.restassured.response.Response;

public class MethodsToSearch_Get extends UtilsGeneric{

	URL url;

	public MethodsToSearch_Get() {
	}

	/***
	 * Method to call email validations 
	 * @return it returns a boolean if the email exist or not
	 */
	public boolean emailExistInEndPoint(String email, Response response) {
		return emailCheck(email, response);
	}


	/***
	 * Method to get the response from the api call
	 * @return it returns the response
	 */
	public Response getRequest(){
		Response response;
		response = given().contentType("application/json").when().get(url.getUrlPost());
		return response;
	}

	


}
