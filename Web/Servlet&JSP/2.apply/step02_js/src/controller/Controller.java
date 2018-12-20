package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/res")
public class Controller extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("data1", "{'name' : '강상현', 'age' : 24}");
		request.setAttribute("data2", "{\"name\" : \"강상현\", \"age\" : 24}");
		
		request.getRequestDispatcher("apply/resView.jsp").forward(request, response);
	}

}
