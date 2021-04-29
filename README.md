# wil_Angel_Api_Testing
Final project API Testing
Author: Wilson Angel
This project is about testing an API, related to a bank transaction.
The URL for the project is:
	"https://6084933e9b2bed00170411fa.mockapi.io/BankInfo"

The test carried out in the proyect are the followings:
@Test 1 > Verify the Endpoint is empty (If it has any data use the DELETE request to clean and
leave it empty)
@Test 2 > Delete the data from end point and then Initialize the POJO with 20 random data (Use the minimal Requirements). Also, make
a code verification for avoiding duplicate email accounts. Finally, send the POST request with the
POJO.
@Test 3 > (Negative Test) make the GET request and make sure the email you are about to send
in a POST won’t be sent since the email already exists. Let that know in a log message.
@Test 4 > Add a test to update an existing AccountNumber, but first create a data
