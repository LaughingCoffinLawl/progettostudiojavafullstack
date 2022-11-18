package jsp_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println(request.getParameter("name"));
		response.getWriter().println(request.getParameter("gender"));
		
		PrintWriter out = response.getWriter();
		String[] languages = request.getParameterValues("language");
		if (languages != null) {
			for (int i = 0; i<languages.length;i++) {
				out.print(languages[i]);
				out.print("\n");
			} 
		} else {
			out.print("Not Selected");
			out.print("\n");
		}
		response.getWriter().println(request.getParameter("country"));
	}
}
