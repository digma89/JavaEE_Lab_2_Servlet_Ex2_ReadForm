

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
			{
			// TODO Auto-generated method stub
			try
			{
			
			// read form fields
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			PrintWriter writer = response.getWriter();
			String htmlRespone = "<html>";
			htmlRespone += "<h2>Your username is: " + username + "<br/>";
			htmlRespone += "Your password is: " + password + "</h2>";
			htmlRespone += "</html>";
			// return response
			writer.println(htmlRespone);
			}
			catch (IOException ioException)
			{
			ioException.printStackTrace();
			}
			}

}
