package com.globant.api.testing.wil.angel.pojo;

public class BankPojo {
	
	private int id;
    private String name;
    private String last_Name;
    private String account_Number;
    private String amount;
    private String transaction_type;
    private String email;
    private String active;
    private String country;
    private String telephone;

	public BankPojo() {
	
	}

	/**
	 * @param id
	 * @param name
	 * @param last_Name
	 * @param account_Number
	 * @param amount
	 * @param transaction_type
	 * @param email
	 * @param active
	 * @param country
	 * @param telephone
	 */
	public BankPojo(int id, String name, String last_Name, String account_Number, String amount,
			String transaction_type, String email, String active, String country, String telephone) {
		super();
		this.id = id;
		this.name = name;
		this.last_Name = last_Name;
		this.account_Number = account_Number;
		this.amount = amount;
		this.transaction_type = transaction_type;
		this.email = email;
		this.active = active;
		this.country = country;
		this.telephone = telephone;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getAccount_Number() {
		return account_Number;
	}

	public void setAccount_Number(String account_Number) {
		this.account_Number = account_Number;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}




}
