import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

/*
 FileName  : HelloServletService.java
	- Servlet Life Cycle  이해 및 적용 구현
	- Servlet Hierarchy/ServletAPI 이해
*/
public class HelloServletdoPost extends HttpServlet{

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		System.out.println("::servlet doPost()시작");
		System.out.println("Request Client IP:"+req.getRemoteAddr());

		//res.setContentType("text/html");
		res.setContentType("text/html;charset=EUC_KR");

		//2.PrintWriter 인스턴스 생성을 Encapsulation 한 API 사용 Stream 생성
		PrintWriter out=res.getWriter();
		
		out.print("<html>");
		out.print("<head><title>hello Servlet</title></head>");
		out.print("<body>");
		out.print("English : HelloServlet");
		out.print("<p>");
		out.print("Korea : 헬로 서블릿");
		out.print("</body>");		
		out.print("</html>");
		out.flush();
		out.close();

		System.out.println(":: servlet services()종료\n");

	}

	// destroy() ==> 금번 예제 method overriding no need


}//end of class