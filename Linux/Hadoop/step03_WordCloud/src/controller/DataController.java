package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.WordCloudDAO;
import model.dto.WordCloudDTO;

@WebServlet("/cont")
public class DataController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* ���� ����
		 * 		- ������ �ִ�
		 * 			��û ��ü�� ������ �����ؼ� ajax/res.jsp�� �̵�
		 * 		- ������ ����
		 * 			msg.jsp�� ��û �����Ͱ� �����ϴ�.
		 * ������ ����
		 * 		- error.jsp
		 * 			�˼��մϴ�. ����Ŀ� �ٽ� ��û�� �ּ���
		 */
		String url = "error.jsp";
		ArrayList<WordCloudDTO> data = null;
		try {
			data = WordCloudDAO.getAll();
			if(data.size() != 0) {
				request.setAttribute("datas", data);
				url = "jsonRes.jsp";
			}else {
				request.setAttribute("message", "��û�� �����ʹ� �����ϴ�");
				url = "msg.jsp";
			}
		} catch (SQLException e) {
			e.printStackTrace();//���� �߻� �����丮�� �����ڰ� �ܼ�â���� Ȯ��
			request.setAttribute("errorMsg", "�˼��մϴ�, �� ��û���ּ���");
		}
		request.getRequestDispatcher(url).forward(request, response);
		
	}

}


