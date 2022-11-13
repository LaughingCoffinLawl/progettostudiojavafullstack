package jsp_servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberAreaController
 */
@WebServlet("/MemberAreaController")
public class MemberAreaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberAreaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		switch(action) {
			case "destroy":
				//destroy the session
				//*
				request.getSession().invalidate();
				/* LOG-IN / LOG-OUT SYSTEM USING COOKIE (DO NOT RECOMMEND)
				 * 
				Cookie[] cookies = request.getCookies();
				//*
				//Expire cookie
				//*
				for(Cookie cookie: cookies) {
					if (cookie.getName().equals("username")) {
						cookie.setValue(null);
						cookie.setMaxAge(0);
						response.addCookie(cookie);
					}
				}
				//redirect to login page once logout
				 * 
				LOG-IN / LOG-OUT SYSTEM USING COOKIE (DO NOT RECOMMEND) */
				//*
				//redirects to a page
				//*
				response.sendRedirect(request.getContextPath()+"/ServletSession?action=login");
				break;
			case "memberArea":
				//creates the URL for the page
				request.getRequestDispatcher("memberArea.jsp").forward(request, response);
				break;
			default:
				break;
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
