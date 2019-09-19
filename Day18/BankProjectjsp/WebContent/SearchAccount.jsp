<%@page import="java.io.OutputStream"%>
<%@page import="com.hcl.bankjsp.AccountBal"%>
<%@page import="com.hcl.bankjsp.Accounts"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="b1" class="com.hcl.bankjsp.SearchAccount"></jsp:useBean>
<jsp:setProperty property="accno" name="b1"/>
<% 
    Accounts objAccounts = b1.searchAccount();
	if (objAccounts != null) {
			out.println("<br/>First Name    :" + objAccounts.getFirstName() + "<br/>");
		    out.println("Last name     :" + objAccounts.getLastName()+ "<br/>");
		    out.println("City          :" + objAccounts.getCity()+ "<br/>");
		    out.println("State         :" + objAccounts.getState()+ "<br/>");
		    out.println("Amount        :" + objAccounts.getAmount()+ "<br/>");
		    out.println("CheqFacil     :" + objAccounts.getCheqFacil()+ "<br/>");
		    out.println("Account Type  :" + objAccounts.getAccountType()+ "<br/>");
		}	
%>
</body>
</html>