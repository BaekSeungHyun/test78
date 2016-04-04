package jw02;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class GetDataKrATagServletMapping extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out=res.getWriter();
		
		String clientName=req.getParameter("name");
		String clientAddr=req.getParameter("addr");
		
		String clientNameKo=this.convertKo(clientName);
		String clientAddrKo=convertKo(clientAddr);
		
		System.out.println(clientNameKo+" : "+clientAddrKo);
		
		out.print("<html>");
		out.print("<head><title>GetDataKrATag.java</title></head>");
		out.print("<body>");
		
		out.print("<h2>Get Test</h2>");
		out.print("<li> �̸�:"+clientNameKo);
		out.print("<li> �ּ�:"+clientAddrKo);
		
		out.print("<p><p><a href='/edu/jw02/getDataKrATagServletMapping.html'>�ڷ�</a>");
		
		out.println("<p><a href='/edu/getDataKrATagServletMapping?name=ȫ�浿&addr=����'>"+"�ڱ��ڽ�</a>");
		
		out.print("</body>");
		out.print("</html>");
	}
	
	private String convertKo(String paramValue){
		String convertParamValue=null;
		try {
			byte[] b=paramValue.getBytes("8859_1");
			convertParamValue=new String(b,"EUC_KR");
		} catch (UnsupportedEncodingException uee) {
			System.out.println("�ѱ� ��ȯ�� Exception �߻�");
			uee.printStackTrace();
		}
		return convertParamValue;
	}
}
