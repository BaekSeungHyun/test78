package hw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registInfo
 */
//@WebServlet("/registInfo")
public class registInfo extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		req.setCharacterEncoding("EUC_KR");      
		res.setContentType("text/html;charset=KSC5601");
		PrintWriter out = res.getWriter();
		
		String name=req.getParameter("name");
		String gender=req.getParameter("gender");
		String year=req.getParameter("year");
		String month=req.getParameter("month");
		String days=req.getParameter("day");
		String school=req.getParameter("grade");
		String jobs=req.getParameter("jobs");
		String belong=req.getParameter("belong");
		String marry=req.getParameter("marrige?");
		String phoneNum1=req.getParameter("phoneNum1");
		String phoneNum2=req.getParameter("phoneNum2");
		String phoneNum3=req.getParameter("phoneNum3");
		String where=req.getParameter("where");
		String phoneNum4=req.getParameter("phoneNum4");
		String phoneNum5=req.getParameter("phoneNum5");
		String phoneNum6=req.getParameter("phoneNum6");
		String telecom=req.getParameter("통신사");
		String add=req.getParameter("주소");
		String addr=req.getParameter("detailAddr");
		String child=req.getParameter("child");
		
		out.println("<html>");
		out.println("<head></head>");
		
		out.println("<boby><center><h2>환영합니다 회원가입 완료되었습니다</h2></center><p>");
		out.println("<table border=1><tr><td colspan=2 ><b><font size=3>개인정보</font></b></td>");
		out.println("<tr><td>이름(한글실명)</td>"+"<td>"+name+"</td>");
		out.println("<tr><td>성별</td>"+"<td>"+gender+"</td>");
		out.println("<tr><td>생년월일</td>"+"<td>"+year+"년"+month+"월"+days+"일"+"</td>");
		out.println("<tr><td>최종학력</td>"+"<td>"+school+"</td>");
		out.println("<tr><td>직업</td>"+"<td>"+jobs+"&nbsp"+"소속"+"&nbsp"+belong+"</td>");
		out.println("<tr><td>결혼여부</td>"+"<td>"+marry+"&nbsp"+"자녀수"+"&nbsp"+child+"</td>");
		out.println("<tr><td>연락처</td><td>전화번호"+"&nbsp"+phoneNum1+"-"+phoneNum2+"-"+phoneNum3+"&nbsp"+where+"<br>"); 
		out.println("휴대폰"+"&nbsp"+phoneNum4+"-"+phoneNum5+"-"+phoneNum6+"&nbsp&nbsp"+telecom+"</td>");
		out.println("<tr><td>거주지주소</td>"+"<td>"+add+"&nbsp"+addr+"</td>");
		out.print("<p><p><a href='/edu/jw02/postDataATagServletMapping.html'>뒤로</a>");		
	    out.println("</body>");
	    out.println("</html>");	
}
}
