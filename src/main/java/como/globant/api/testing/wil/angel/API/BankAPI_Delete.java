package como.globant.api.testing.wil.angel.API;

import com.globant.api.testing.wil.angel.request.MethodsToDelete_Delete;

public class BankAPI_Delete extends MethodsToDelete_Delete {

	public BankAPI_Delete() {
		// TODO Auto-generated constructor stub
	}


	/***
	 * Method to delete data stored in endPoint
	 */
	public void deletingDataFromEndPoint(){

		if(endPointHasData()) {
			deleteElements();
		}

	}

}
