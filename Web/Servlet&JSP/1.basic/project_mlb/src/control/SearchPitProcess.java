package control;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SearchPitBean;
import model.SearchPitDAO;


@WebServlet("/SearchPitProcess")
public class SearchPitProcess extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doReqProcess(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doReqProcess(request,response);
	}

	protected void doReqProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		//데이터베이스 객체 생성
		SearchPitDAO sdao = new SearchPitDAO();
		String name = request.getParameter("plyName");
		String sql = "select * from pitcher2017 where pitName like '%" + name + "%'";
		//리턴 받아주는 메소드 호출
		Vector<SearchPitBean> v = sdao.getAllBoard(sql);
		
		//BoardList.jsp에 전달
		request.setAttribute("v", v);
		
		RequestDispatcher dis = request.getRequestDispatcher("jsp/1-1_search2.jsp");
		dis.forward(request, response);
	}
}
