package como.globant.api.testing.wil.angel.API;

import com.globant.api.testing.wil.angel.request.MethodsToUpdate_Put;

public class BankAPI_Put extends MethodsToUpdate_Put {

	public BankAPI_Put() {
	}
	
	public boolean updateAccountFromEndPoint(int id, String accountNumber) {
		
		return updateAccount(id, accountNumber);
		
	}

}
