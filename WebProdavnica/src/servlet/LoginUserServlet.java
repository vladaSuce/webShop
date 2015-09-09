package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 * Servlet implementation class LoginUserServlet
 */
public class LoginUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginUserServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/json");
		PrintWriter out = response.getWriter();


		
			
			String json = request.getParameter("json");
			System.out.println("1="+json);
			JSONObject jsonData = (JSONObject) JSONValue.parse(json);
			String username = ((String)jsonData.get("username"));
			String password = ((String)jsonData.get("password"));
			
			System.out.println("username ="+username);
			System.out.println("password ="+password);
			JSONObject result = new JSONObject();
			String jsonResult = JSONObject.toJSONString(result);
			out.println(jsonResult);

		RequestDispatcher rd = getServletContext().getRequestDispatcher(response.encodeRedirectURL("/index.html"));
		rd.forward(request, response);
	}

}
