package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberBean;
import model.MemberDAO;

/**
 * Servlet implementation class NewMemberProcess
 */
@WebServlet("/NewMemberProcess")
public class NewMemberProcess extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		MemberBean bean = new MemberBean();
		bean.setId(request.getParameter("id"));
		bean.setPassword(request.getParameter("password"));;
		bean.setName(request.getParameter("name"));
		String hp1 = request.getParameter("hp1");
		String hp2 = request.getParameter("hp2");
		String hp3 = request.getParameter("hp3");
		String hp = hp1 + "-" + hp2 + "-" + hp3;
		bean.setHp(hp);
		bean.setAddress(request.getParameter("address"));
		
		//데이터베이스 객체 선언 후 저장
		//데이터베이스 객체 생성
		
		MemberDAO mdao = new MemberDAO();
		mdao.insertMember(bean);
		
		RequestDispatcher dis = request.getRequestDispatcher("newMemberOk.jsp");
		dis.forward(request, response);
	}

}
