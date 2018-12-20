package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CrimeDAO;
import model.CrimeDTO;
import model.CrimeDayDAO;
import model.CrimeDayDTO;
import model.CrimeTimeDAO;
import model.CrimeTimeDTO;

//http://ip:port/project(context紐�)/cont
//http://localhost:8080:/step04_CP/loginSucc.jsp
public class AllController extends HttpServlet {

	protected void service(HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String command = request.getParameter("command");
		
		System.out.println("controller : " + command);
		if(command.equals("crime1")) {
			crime1(request, response);
		}else if(command.equals("crime2")) {
			crime2(request, response);
		}else if(command.equals("crimeTime")) {
			crimeTime(request, response);
		}else if(command.equals("crimeDay")) {
			crimeDay(request, response);
		}
		else {
		}
	}

	private void crimeDay(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "";
		try {
			ArrayList<CrimeDayDTO> crimeDay1 = CrimeDayDAO.selectCrime("강력범죄");
			ArrayList<CrimeDayDTO> crimeDay2 = CrimeDayDAO.selectCrime("절도범죄");
			ArrayList<CrimeDayDTO> crimeDay3 = CrimeDayDAO.selectCrime("폭력범죄");
			ArrayList<CrimeDayDTO> crimeDay4 = CrimeDayDAO.selectCrime("지능범죄");
			ArrayList<CrimeDayDTO> crimeDay5 = CrimeDayDAO.selectCrime("풍속범죄");
			
			if(crimeDay1.size() != 0) {
				request.setAttribute("day1", crimeDay1);
				url = "main.jsp";
			}
			
			else {
				request.setAttribute("msg", "msgError");
				url = "msgView.jsp";
			}
			
			if(crimeDay2.size() != 0) {
				request.setAttribute("day2", crimeDay2);
				url = "main.jsp";
			}
			
			else {
				request.setAttribute("msg", "msgError");
				url = "msgView.jsp";
			}
			
			if(crimeDay3.size() !=0) {
				request.setAttribute("day3", crimeDay3);
				url = "main.jsp";
			}
			
			else {
				request.setAttribute("msg", "msgError");
				url = "msgView.jsp";
			}
			if(crimeDay4.size() !=0) {
				request.setAttribute("day4", crimeDay4);
				url = "main.jsp";
			}
			
			else {
				request.setAttribute("msg", "msgError");
				url = "msgView.jsp";
			}
			if(crimeDay5.size() !=0) {
				request.setAttribute("day5", crimeDay5);
				url = "mainView.jsp";
			}
			else {
				request.setAttribute("msg", "msgError");
				url = "msgView.jsp";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			request.setAttribute("errorMsg","errorError");
			url = "errorView.jsp";
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

	private void crimeTime(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "";
		try {
			ArrayList<CrimeTimeDTO> crimeTime1 = CrimeTimeDAO.selectCrime("강력범죄");
			ArrayList<CrimeTimeDTO> crimeTime2 = CrimeTimeDAO.selectCrime("절도범죄");
			ArrayList<CrimeTimeDTO> crimeTime3 = CrimeTimeDAO.selectCrime("폭력범죄");
			ArrayList<CrimeTimeDTO> crimeTime4 = CrimeTimeDAO.selectCrime("지능범죄");
			ArrayList<CrimeTimeDTO> crimeTime5 = CrimeTimeDAO.selectCrime("풍속범죄");

			if(crimeTime1.size() != 0) {
				request.setAttribute("time1", crimeTime1);
				url = "main.jsp";
			}
			
			else {
				request.setAttribute("msg", "msgError");
				url = "msgView.jsp";
			}
			
			if(crimeTime2.size() != 0) {
				request.setAttribute("time2", crimeTime2);
				url = "main.jsp";
			}
			
			else {
				request.setAttribute("msg", "msgError");
				url = "msgView.jsp";
			}
			
			if(crimeTime3.size() !=0) {
				request.setAttribute("time3", crimeTime3);
				url = "main.jsp";
			}
			
			else {
				request.setAttribute("msg", "msgError");
				url = "msgView.jsp";
			}
			if(crimeTime4.size() !=0) {
				request.setAttribute("time4", crimeTime4);
				url = "main.jsp";
			}
			
			else {
				request.setAttribute("msg", "msgError");
				url = "msgView.jsp";
			}
			if(crimeTime5.size() !=0) {
				request.setAttribute("time5", crimeTime5);
				url = "main.jsp";
			}
			else {
				request.setAttribute("msg", "msgError");
				url = "msgView.jsp";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			request.setAttribute("errorMsg","errorError");
			url = "errorView.jsp";
		}
		request.getRequestDispatcher(url).forward(request, response);
	}


	private void crime1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "msgView.jsp";
		try {
			ArrayList<CrimeDTO> crimeMan = CrimeDAO.selectCrime(0);//남자

			if(crimeMan.size() != 0) {
				request.setAttribute("crimeMan", crimeMan);
				url = "printView.jsp";	
			} else {
				request.setAttribute("msg", "검색된 데이터가 없습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg","검색시 문제 발생. 재시도 하세요");
			url = "errorView.jsp";
		}
		request.getRequestDispatcher(url).forward(request, response);
		
	}
	
	private void crime2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "msgView.jsp";
		try {
			ArrayList<CrimeDTO> crimeWoman = CrimeDAO.selectCrime(1);//여자

			if(crimeWoman.size() != 0) {
				request.setAttribute("crimeMan1", crimeWoman);
				url = "printView2.jsp";	
			} else {
				request.setAttribute("msg", "검색된 데이터가 없습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg","검색시 문제 발생. 재시도 하세요");
			url = "errorView.jsp";
		}
		request.getRequestDispatcher(url).forward(request, response);
		
	}
	
}
