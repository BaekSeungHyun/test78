package spring.base.navigation;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * FileName : ServletSendRedirect.java
 * ::Servlet Navigation :: SendRedirect
 * ::HttpServletResponse.sendRedirect() API 확인
 * ::Servlet에서 각각의 ObjectScope에 저장한 Bean을 
 * 	 JSP로 Forward시 저장된 Bean 공유 유무 확인
 */
public class ServletSendRedirect extends HttpServlet {
	
	//service()
	public void service(HttpServletRequest request,HttpServletResponse response) 
														throws ServletException,IOException{
		
		System.out.println("[ServletSendRedirect.service() start.......]");
		
		//==>Request ObjectScope 저장
		request.setAttribute("user01", new User("홍길동","1111"));
		
		//==>Session ObjectScope 저장
		HttpSession session=request.getSession(true);
		session.setAttribute("user02", new User("이순신","2222"));
		
		//==>Application ObjectScope 저장
		ServletContext application=this.getServletContext();
		application.setAttribute("user03", new User("장보고","3333"));
		
		
		//==>Request 다시생성 Request하는 sendRedirect 이해..
		response.sendRedirect("/003edu/02Navigation/view.jsp");
		
		System.out.println("[ServletSendRedirect.service() start......]");
		
	}//end of service
}//end of class

/*
 * 실행방법:http://127.0.0.1:8080/003edu/ServletSendRedirect
 * 1.web.xml mapping 확인
 * 2.URL 확인 / Browser 화면은 Servlet 화면인가? JSP 화면인가?
 * 3.각각의 ObjectScope 다시 확인
 * 4.forward와 sendRedirect 차이점?
 **/
