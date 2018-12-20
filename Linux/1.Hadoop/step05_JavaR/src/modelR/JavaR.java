package modelR;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jr")
public class JavaR extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String url = "error.jsp";
	 	
        //resp.setContentType("text/html;charset=utf-8"); 
        PrintWriter out = response.getWriter();
        try {
            Process p = Runtime.getRuntime().exec("Rscript C:\\ITStudy\\2.bigData\\Box_R\\test.R");
            p.waitFor();
            /* 서버 시스템 내에 존재하는 일반 파일을 read해서 client에게 응답
             * 단, 여러분들은 requeest.setAtrribute("data", 크롤링한데이터)
             * priceView.jsp 통해서 응답 
             * 
             * 서버 시스템 내에 존재하는 일반 파일에 한글이 보유될 가능성이 있다면
             * 한글은 2byte 단위의 언어
             * 따라서 2byte로 read 할수 있는 API를활용
             *  
             *  1. FileReader 
             *  	- 존재하는 file로 부터 2byte씩 read 가능
             *     - 단순 read만 가능하고, performance는 미 고려
             *  	- 한 음절씩만 read 가능
             *  		int read()
             *  		- read한 데이터가 있다 : int
             *  		- read할 데이터가 없다 : -1
             *  
             *  2. BufferedReader
             *  	- 입력 필터
             *  	- 입력하는 속도 향상을 하는 API
             *  	- 2byte 로 read
             *  	- line단위로 read하는 메소드도 있음
             *  		String readLine()
             *  		- read한 데이터가 있다 : String 객체
             *  		- read할 데이터가 없다 : null
             * 
             */
            BufferedReader in 
            = new BufferedReader(new FileReader("C:\\ITStudy\\2.bigData\\Box_R\\result.csv"));
            
            /* python에 의해 생성된 데이터를 file로 read
             * 요청 객체에 저장 -> priceView.jsp */
            
            //다수의 데이터가 존재할 경우 모든 read한 데이터를 적재하는 문자열 객체
            StringBuffer buf = new StringBuffer("");
            String line = null;
            while ((line = in.readLine()) != null) {
                //System.out.println(line);
                buf.append(line); //라인 단위로 read해서 적재
            }
            //out.println(buf);
            request.setAttribute("data", buf.toString()); //StringBuffer의 데이터를 문자열로 변환 및 저장
            url = "priceView.jsp";
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error.Msg", "죄송합니다 재요청해주십시오");
        }
        //발생된 결과에 합당한 화면으로 이동 : priceView.jsp or error.jsp로 이동
        request.getRequestDispatcher(url).forward(request, response);
    }
}