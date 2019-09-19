package com.hcl.library;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

public class LibraryDao {

	Connection con = null;
	ResultSet rs = null;
	String cmd = "";
	PreparedStatement pst = null;
  
  public String[] loginDao(User user) {
		String cmd = "select username from libusers where username =? and password=?;";
		con = DaoConnection.getConnection();
		
		String[] result = new String[2];
		try {
			pst =  con.prepareStatement(cmd);
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			rs = pst.executeQuery();
			if(rs.next()) {
				result[0]= "Logged In...";
				result[1] = rs.getString("Username") ;
			} else{
				result[0]="Invalid Login Credentials...";
				result[1] = "Error";
			}
		} catch (Exception e) {
		}
		
		return result;	
	}
	
  public List<Book> searchBooksDao(String criteria, String value) {
	    String cmd = "SELECT * FROM books ";
		List<Book> books = new ArrayList<Book>();
		Connection con = DaoConnection.getConnection();
		try {
			pst = con.prepareStatement(cmd);
			if(!(criteria.equals("TotalBooks"))) {
				cmd += "where " + criteria + " = ? ";
				pst = con.prepareStatement(cmd);
				if(criteria.equals("Id")) {
					pst.setInt(1, Integer.parseInt(value));
				}  else {
					pst.setString(1, value);
				}
			}
			rs = pst.executeQuery();
			while (rs.next()) {
				Book book = new Book();
				book.setId(rs.getInt("Id"));
				book.setName(rs.getString("Name"));
				book.setAuthor(rs.getString("Author"));
				book.setDept(rs.getString("Dept"));
				book.setEdition(rs.getString("Edition"));
				book.setNos(rs.getInt("TotalBooks"));
				books.add(book);
			}
			return books;
		} catch (SQLException e) {
		}
		return null;
	}

  public boolean issueBookDao(String name,int Id){
		boolean isIssued = false;
		con = DaoConnection.getConnection();
		cmd = "SELECT COUNT(*) FROM tranbook WHERE Username = ? AND BookId = ?";
		try {
			pst = con.prepareStatement(cmd);
			pst.setString(1, name);
			pst.setInt(2, Id);
			rs = pst.executeQuery();
			if(rs.next() && rs.getInt("Count(*)") == 0) {
				cmd = "insert into tranbook(Username,BookId) values(?,?)";
				pst = con.prepareStatement(cmd);
				pst.setString(1, name);
				pst.setInt(2, Id);
				pst.executeUpdate();

				isIssued = true;
				cmd = "update books set TotalBooks = TotalBooks-1 where Id = ?";
				pst = con.prepareStatement(cmd);
				pst.setInt(1, Id);
				pst.executeUpdate();
			} 
		} catch (SQLException e1) {
		}
		return isIssued;
	}

  public String[][] showIssuedBooksDao(String username) {
		String[][] result;
		con = DaoConnection.getConnection();
		
		try {
			cmd = "SELECT Count(*) FROM tranbook WHERE Username = ?;";
			pst = con.prepareStatement(cmd);
			pst.setString(1, username);
			rs = pst.executeQuery();
			rs.next();
			result = new String[rs.getInt("Count(*)")][2];
			
			cmd = "SELECT * FROM tranbook WHERE Username = ?;";
			pst = con.prepareStatement(cmd);
			pst.setString(1, username);
			rs = pst.executeQuery();
			int i=0;
			while(rs.next()) {
				result[i][0] = String.format("%d", rs.getInt("BookId"));
                result[i][1] = rs.getDate("Fromdate").toString();
                i++;
			}
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

  public String returnBookDao(String username,int id) {
    String result = "";
    con = DaoConnection.getConnection(); 
    cmd = " select Fromdate from tranbook where Bookid = ? and username = ?;";
    try {
		pst = con.prepareStatement(cmd);
		pst.setInt(1,id);
		pst.setString(2, username);
		rs = pst.executeQuery();
		rs.next();
		Date fromdate = rs.getDate("Fromdate");
		cmd = " delete from tranbook where Bookid = ? and username = ?;";
		pst = con.prepareStatement(cmd);
		pst.setInt(1,id);
		pst.setString(2, username);
		pst.executeUpdate();
	    cmd = "insert into transreturn values(?,?,?,default);";
	    pst = con.prepareStatement(cmd);
		pst.setInt(2,id);
		pst.setString(1, username);
		pst.setDate(3, fromdate);
		pst.executeUpdate();
		cmd = "update books set TotalBooks = TotalBooks + 1 where Id = ?;";
        pst = con.prepareStatement(cmd);
        pst.setInt(1, id);
        pst.executeUpdate();
		result = "<br/>**********Returned Successfully**********";
	} catch (SQLException e) {
	}
    return result;
  }

  public String showHistoryDao(String username) {
	  String history = "";
	  con = DaoConnection.getConnection();
	  cmd = "select * from transreturn where Username = ?;";
	  try {
		pst = con.prepareStatement(cmd);
		pst.setString(1, username);
		rs = pst.executeQuery();
		while(rs.next()) {
			history += "<br/>" +rs.getInt("BookId");
			history += "&nbsp;&nbsp;&nbsp;&nbsp;  " + rs.getDate("Fromdate").toString();
			history += "&nbsp;&nbsp;&nbsp;&nbsp;  " + rs.getDate("Todate").toString() ;
		}
	} catch (SQLException e) {
	}
	  return history;
  }

}
