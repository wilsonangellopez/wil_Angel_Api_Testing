package como.globant.api.testing.wil.angel.API;

import com.globant.api.testing.wil.angel.request.MethodsToSearch_Get;

import io.restassured.response.Response;

public class BankAPI_Get extends MethodsToSearch_Get {

	public BankAPI_Get() {
	}

	public boolean emailExistInEndPoint(String email) {
		return emailCheck(email, getRequest())?true:false;
	}

	public int getTheLastEmailInEndPoint() {

		
		return Integer.parseInt(findTheLastElementCreated(getRequest()));
		
		
	}

}
