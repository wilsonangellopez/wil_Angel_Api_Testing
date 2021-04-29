package como.globant.api.testing.wil.angel.API;

import com.globant.api.testing.wil.angel.pojo.BankPojo;
import com.globant.api.testing.wil.angel.request.MethodsToCreate_Post;

public class BankAPI_Post extends MethodsToCreate_Post  {

	public BankAPI_Post() {
		// TODO Auto-generated constructor stub
	}
	
	 /***
     * Method to create bank transactions
     */
    public void creatingData(int quantity){
    	
        sendData(quantity);
    }

    /***
     * Method to create bank transactions
     * @return the last element created
     */
    public BankPojo creatingDataAndBackInfo(int quantity){
    	
        return sendDataAndReturn(quantity);
    }
    
}
