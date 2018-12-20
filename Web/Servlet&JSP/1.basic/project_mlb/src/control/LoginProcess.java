package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberBean;
import model.MemberDAO;

@WebServlet("/LoginProcess")
public class LoginProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로그인 유지
		MemberBean bean = new MemberBean();
		
		bean.setId(request.getParameter("id"));
		bean.setPassword(request.getParameter("password"));
		
		MemberDAO mdao = new MemberDAO();
		int result = mdao.loginCheck(bean);
		
		if (result ==1) { //회원인 경우
			HttpSession session = request.getSession();
			session.setAttribute("sid", bean.getId());
			//session.setMaxInactiveInterval(5); //세션 타임아웃 시간 설정
			
			RequestDispatcher dis = request.getRequestDispatcher("main.jsp"); //회원 성공인 경우
			dis.forward(request, response);
		} else {
			response.sendRedirect("jsp/loginForm.jsp");
		}
	}
	
	//<a href = "LoginProcess?command=logout">로그아웃</a>로 호출한 경우 Get 방식
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = request.getParameter("command");
		if (command.equals("logout")) {
			logout(request, response);
		}
	}
	
	//로그아웃 처리
	protected void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.invalidate();
		session = null;
		response.sendRedirect("main.jsp");
	}

}
