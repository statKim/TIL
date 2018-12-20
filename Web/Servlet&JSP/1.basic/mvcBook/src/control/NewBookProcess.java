package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BookBean;
import model.BookDAO;

/**
 * Servlet implementation class NewBookProcess
 */
@WebServlet("/NewBookProcess")
public class NewBookProcess extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		BookBean bean = new BookBean();
		bean.setBookNo(request.getParameter("bookNo"));
		bean.setBookName(request.getParameter("bookName"));;
		bean.setBookPrice(request.getParameter("bookPrice"));
		bean.setBookDate(request.getParameter("bookDate"));
		bean.setPubNo(request.getParameter("pubNo"));

		//데이터베이스 객체 선언 후 저장
		//데이터베이스 객체 생성
		
		BookDAO bdao = new BookDAO();
		bdao.insertBook(bean);
		
		RequestDispatcher dis = request.getRequestDispatcher("newBookOk.jsp");
		dis.forward(request, response);
	}

}
