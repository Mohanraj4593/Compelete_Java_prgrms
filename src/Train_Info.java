
 
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;

@WebServlet("/Details")
public class Train_Info extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Connection con;
		  String ftname = null,fsource=null,fdestination=null;
		  int ftnumber=0;
		  double ffare1=0.0;
		  double ffare=0.0;
		 
		  PrintWriter pw=resp.getWriter();
		
		
		
		
		String source=req.getParameter("source");
		String destination=req.getParameter("destination");
		
		if(source.equals("")||destination.equals("")) 
		{
			pw.println("source or destination cannot be empty");
	    }
		
		try 
		{
		//Class.forName("com.mysql.jdbc.Driver");
		
			Driver myDriver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(myDriver);
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/train","root","root");

			  pw.println("<html>");
			  pw.println("<head><title>Servlet JDBC</title></head>");
			  pw.println("<body>");
			  pw.println("<h1></h1>");
			  pw.println("</body></html>");  
			
		 String sql ="select * from train_information where source=? && destination=?";
				  java.sql.PreparedStatement pst =con.prepareStatement(sql);
				  pst.setString(1, source);
				  pst.setString(2, destination);
				  ResultSet result=pst.executeQuery();		  
				 while(result.next()) 
				 {
					 ftname=result.getString("train_name");
					 ftnumber=result.getInt("train_number");
					 fsource=result.getString("source");
					 fdestination=result.getString("destination");
					 ffare1=result.getInt("fare");
				 }}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		
		ffare=ffare1+ffare1*0.18;
				
	/*	String title = "TRAIN DETAILS";
	      String docType =
	         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	         
	      pw.println(docType +
	         "<html>\n" +
	            "<head></head>\n" +
	            "<body bgcolor = \"#c3eaeb\">\n" +
	               "<h1 align = \"center\">" + title + "</h1>\n" +
	               "<ul>\n" +"<center>"+
	               "  <li><b>Train Name:<b> "
	                  + ftname + "\n" +
	                  
	                  
	                  "  <li><b>Train Number:<b> "
	                  + ftnumber+ "\n" +
	                  
	                  
	                  "  <li><b>Source</b>: "
	                  +fsource + "\n" +
	                  
	                  "  <li><b>Destination</b>: "
	                  + fdestination+ "\n"+
	                  

	                  "  <li><b>Fare(incl. GST)</b>: "
	                  + ffare + "\n" +"</center>"+
	               "</ul>\n" +
	            "</body>" +
	         "</html>"
	      ); */
		
		String Title="Train Details From "+fsource+" To "+fdestination;
		
		pw.println("<html> \n"+"<body bgcolor = \"#c3eaeb\"> \n"+
		"<h2 align = \"center\">" + Title + "</h2>\n"+
		"<ul>\n" +"<center>"+
		"<table border='1'> \n"+
		"<tbody>\n"+
        " <tr><td><li><b>Train Name:<b> "
           + ftname + "</td> </tr>\n" +
           
           
           " <td><li><b>Train Number:<b> "
           + ftnumber+ "</td></tr>\n" +
           
           
           " <td><li><b>Source</b>: "
           +fsource + "</td></tr>\n" +
           
           " <td><li><b>Destination</b>: "
           + fdestination+ "</td></tr>\n"+
           

           "  <td><li><b>Fare(incl. GST)</b>: "
           + ffare + "</tbody> </table>\n"+"</td></tr>\n" +"</center>"+
        "</ul>\n" );

				
		
	/*	pw.println("<br > Train name: "+ftname);
		pw.println("<br > Train number: "+ftnumber);
		pw.println("<br > Source: "+fsource);
		pw.println("<br > Destination: "+fdestination);
		pw.println("<br > Total Fare(+GST): "+ffare);
*/

	}

}
