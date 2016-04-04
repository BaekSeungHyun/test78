package jw05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//
//FileName : SessionUseCookieOneEncodeURL.java
// :: ������ �ʿ��� ���� HttpSession �̿� ����
//  
//@WebServlet("/SessionUseCookieOneEncodeURL")
public class SessionUseCookieOneEncodeURL extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// :: �ΰ��� ��� ����
		//1. HttpSession ��ü�� ���� ���.
		//2. HttpSession ��ü�� ���� ���.
		HttpSession session = req.getSession(true);
		//==> 1�� ��� ���ο� HttpSession ��ü ����(APIȮ��)
		//==> 2�� ��� ���� HttpSession ��ü GET(APIȮ��)
		
		//==>���� ������� HttpSession ��ü���...
		if( session.isNew() ) {
			// name=value���� :: �̸� ȫ�浿 ����
			session.setAttribute("name", new String("ȫ�浿"));
		}
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		out.println("<html><head></head>");
		out.println("<body>");
		out.println("<center><h2>SessionUseCookieOne</h2></center>");
		
		// HttpSeesion�� ����, GET �� �� �ִ� unique �� id�� Ȯ��
		System.out.println("\nUNIQUE�� JSESSIONID�� : "+session.getId());
		
		//==> ���� ������� HttpSession ��ü���...
		if(session.isNew()) {
			out.println("������ ���� ������<br>");
		}else{
			out.println("\n UNIQUE�� JSESSIONID�� : "+session.getId()+" �����");
		}
		
		//1. Browser ���� Cookie ���ܵ� ��� Session ���� �Ұ�
		//   (Client�� Server�� Session�� ã�� �� �ִ� JSESSIONID ���� �� cookie ��� �Ұ�)
		//2. Cookie�� ���ܵ� ��� response.encodedURL() Method ���
		//   JSESSIONID�� URL �Ĵܵ� �ٿ��� JSESSIONID�� Client�� ����
		String url = res.encodeURL("/edu/SessionUseCookieTwo");
		out.println("<a href="+url+">��ũ</a><p/>");
		out.println("�� link URL : "+url);
		out.println("<body></html>");
	}
}//end of class