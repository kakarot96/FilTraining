package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import main.DBConnection;
import main.Supplier;


/**
 * Servlet implementation class FirstServlet
 */
@WebServlet(
		description = "First java servlet", 
		urlPatterns = { 
				"/FirstServlet", 
				"/First"
		})
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter writer= response.getWriter();
		String s1,s2;
		s1=request.getParameter("userid");
		s2=request.getParameter("password");
		if(s1.equals(s2))writer.append("\nsuccess");
		else writer.append("\nfailed");
		response.flushBuffer();
		Supplier supp=new Supplier(10,"","");
	System.out.println(supp.getId());
	
	
	Connection connection= DBConnection.getConnection();
	
	try {
		PreparedStatement smt= connection.prepareStatement("select * from login where userid=?");
		smt.setString(1,s1);
		ResultSet resultSet= smt.executeQuery();
		if(resultSet.next()){
			if(resultSet.getString(2).equals(s2))System.out.println("login successful");
			else System.out.println("login failed");
		}
		else
			System.out.println("userid not exists");
		} 
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		}

}
