package control;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardBean;
import model.BoardDAO;


@WebServlet("/BoardListProcess")
public class BoardListProcess extends HttpServlet {
	
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
		BoardDAO bdao = new BoardDAO();
		
		//게시글을 리턴 받아주는 메소드 호출
		Vector<BoardBean> v = bdao.getAllBoard();
		
		//BoardList.jsp에 전달
		request.setAttribute("v", v);
		
		RequestDispatcher dis = request.getRequestDispatcher("jsp/boardList.jsp");
		dis.forward(request, response);
	}
}
