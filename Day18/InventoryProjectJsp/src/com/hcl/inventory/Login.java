package com.hcl.inventory;

public class Login {
  private String userName;
  private String passWord;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}

  public boolean doLogin() {
	  return InventryBal.doLoginBal(userName, passWord);
  }
}