package jsp_servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletSession
 */
@WebServlet("/ServletSession")
public class ServletSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch (action) {
		case "login":
			//creates the URL for the page
			request.getRequestDispatcher("Login.jsp").forward(request, response);
			break;
		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/* Redirect by passing information to JSP file (NOT RECOMMENDED)
		 * 
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals("lol") && password.equals("1234")) {
			request.getSession().invalidate();
			HttpSession newSession = request.getSession(true);
			newSession.setMaxInactiveInterval(300);
			
			CREATION AND USE ON COOKIES
			*
			Cookie cUsername = new Cookie("username", username);
			response.addCookie(cUsername);
			*
			CREATION AND USE ON COOKIES 
			
			newSession.setAttribute("username", username);
			response.sendRedirect("memberArea.jsp");
		} else {
			response.sendRedirect("Login.jsp");
		}
		*
		*/
		
		String action = request.getParameter("action");
		switch (action) {
		case "loginSubmit":
			authenticate(request, response);
			break;
		default:
			break;
		}
	}
	
	public void authenticate (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals("lol") && password.equals("1234")) {
			request.getSession().invalidate();
			HttpSession newSession = request.getSession(true);
			newSession.setMaxInactiveInterval(300);
			
			/* CREATION AND USE ON COOKIES
			*
			Cookie cUsername = new Cookie("username", username);
			response.addCookie(cUsername);
			*
			CREATION AND USE ON COOKIES */
			
			newSession.setAttribute("username", username);
			//creates a session ID and encode the URL to prevent errors from browsers that doesn't support cookies
			String encode = response.encodeURL(request.getContextPath());
			//redirects based on the URl created by the Dispatcher to the correct Servlet that manage the logic + ENCODE
			response.sendRedirect(encode+"/MemberAreaController?action=memberArea");
		} else {
			//redirects based on the URl created by the Dispatcher to the correct Servlet that manage the logic
			response.sendRedirect(request.getContextPath()+"/ServletSession?action=login");
		}
	}
}
