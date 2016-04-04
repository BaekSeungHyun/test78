import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

/*
 FileName  : HelloServletService.java
	- Servlet Life Cycle  ���� �� ���� ����
	- Servlet Hierarchy/ServletAPI ����
*/
public class HelloServletdoPost extends HttpServlet{

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		System.out.println("::servlet doPost()����");
		System.out.println("Request Client IP:"+req.getRemoteAddr());

		//res.setContentType("text/html");
		res.setContentType("text/html;charset=EUC_KR");

		//2.PrintWriter �ν��Ͻ� ������ Encapsulation �� API ��� Stream ����
		PrintWriter out=res.getWriter();
		
		out.print("<html>");
		out.print("<head><title>hello Servlet</title></head>");
		out.print("<body>");
		out.print("English : HelloServlet");
		out.print("<p>");
		out.print("Korea : ��� ������");
		out.print("</body>");		
		out.print("</html>");
		out.flush();
		out.close();

		System.out.println(":: servlet services()����\n");

	}

	// destroy() ==> �ݹ� ���� method overriding no need


}//end of class