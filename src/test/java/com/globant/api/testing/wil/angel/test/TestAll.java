package com.globant.api.testing.wil.angel.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import como.globant.api.testing.wil.angel.API.BankAPI_Delete;
import como.globant.api.testing.wil.angel.API.BankAPI_Get;
import como.globant.api.testing.wil.angel.API.BankAPI_Post;
import como.globant.api.testing.wil.angel.API.BankAPI_Put;

public class TestAll {

	BankAPI_Post API_Post = new BankAPI_Post();
	BankAPI_Delete API_Delete = new BankAPI_Delete();
	BankAPI_Get API_Get = new BankAPI_Get(); 
	BankAPI_Put API_Put = new BankAPI_Put();

	Assertion myAssert = new Assertion();

	@Test(priority=2)
	public void test1() {

		API_Delete.deletingDataFromEndPoint();
		Assert.assertEquals(0, API_Delete.getQuantityOfElements());
	}

	@Test(dataProvider="data", priority=1)
	public void test2(int quantity) {

		API_Delete.deletingDataFromEndPoint();
		API_Post.creatingData(quantity);
		Assert.assertEquals(quantity, API_Post.getQuantityOfElements());

	}


	@Parameters({"email"})	
	@Test()
	public void test3(String email) {

		myAssert.assertEquals(API_Post.creatingDataAndBackInfo(1).getEmail(), API_Get.getTheLastEmailInEndPoint());
	}


	@Test
	public void test4() {


		API_Post.creatingData(1);
		myAssert.assertTrue(API_Put.updateAccountFromEndPoint(API_Get.getTheLastEmailInEndPoint(), "123123"), "The API can't update the account");


	}



	@DataProvider(name = "data")
	public Object[] testUsers(){
		Object [] data=new Object[2];
		data[0]=20;
		data[1]=1;


		return data;
	}


}
