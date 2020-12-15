package Student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginPage extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException{
				
				PrintWriter pw = res.getWriter();
				res.setContentType("text/html");
				
				String sName = req.getParameter("studentName");
				String sPass = req.getParameter("studentPassword");
				
				if(sName.equals("divansh") && sPass.equals("anupam"))
				{
					pw.println("Student "+ sName + " logged in successfully.....");
				}
				
				else
				{
					pw.println("Login failed.....");
				}
				pw.close();
			}
	
}
