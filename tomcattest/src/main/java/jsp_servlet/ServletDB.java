package jsp_servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.mysql.cj.xdevapi.Statement;

/**
 * Servlet implementation class ServletDB
 */
@WebServlet("/ServletDB")
public class ServletDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DataSource dataSource;
	@Resource(name="jdbc/project")
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			connect = dataSource.getConnection();
			String query = "Select * from users";
			stmt = (Statement) connect.createStatement();
			rs = (ResultSet) ((java.sql.Statement) stmt).executeQuery(query);
			while(rs.next()) {
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
