package jsp_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;


/**
 * Servlet implementation class ServletDB
 */
@WebServlet("/Test")
public class ServletDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name="jdbc/project")
	private DataSource dataSource;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			connect = dataSource.getConnection();
			out.print("Connection Established!");
			String query = "Select * FROM my_db.users";
			stmt = connect.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				out.print("<br>" + rs.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
