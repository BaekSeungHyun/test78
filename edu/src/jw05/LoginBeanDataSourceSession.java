package jw05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jw04.UserDataSourceDao;
import jw04.UserVO;

/*
 * FileName : LonginBeanDataSourceSession.java
 * ::Servlet/JDBC/DataSource(Connection Pool)/Session 이용 Login 처리
 */
//@WebServlet("LoginBeanDataSourceSession")
public class LoginBeanDataSourceSession extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws
	ServletException, IOException{
		
	req.setCharacterEncoding("EUC_KR");
	res.setContentType("text/html;charset=EUC_KR");
	PrintWriter out =res.getWriter();
	
	//Client Form Data 처리
	String id = req.getParameter("id");
	String pwd = req.getParameter("pwd");
	
	//session 유무확인 :: 새로운 HttpSession 생성 OR 기존 HttpSession GET	
	HttpSession session = req.getSession(true);
	
	//기 login 한 회원 :: session에 저장된 UserVO get
	//미 login 한 회원 :: session에 저장된 UserVO 없으므로 null Get
	UserVO userVO = (UserVO)session.getAttribute("userVO");
	System.out.println("session에 저장된 UserVO 유무 확인 :"+userVO);
	
	
	//아래의 두경우를 고려
	//==>고려할 사항 1
	//::loginBeanPoolSession.html을 거처서(?) 오는경우
	//1. id를 입력하지 않은 경우::req.getParameter("id")의 값==>""(NullString)
	
	//==>고려할 사항2
	//::Browser 주소창에 직접URL
	// Http://127.0.0.1:8080/edu/LoginBeanDataSourceSession 입력한 경우
	//2. req.getParameter("id")의 값 ==>null
	
	//==>1, 2인 경우 DB접근 불필요 :: 입력값의 유효성을 check하는 if문
	if( !(id == null || id.equals(""))){
	//UserVO instance 생성 및 Client Form Data 전달(Binding)
	userVO = new UserVO();
	userVO.setId(id);
	userVO.setPwd(pwd);
	
	//DB 접근 Data 검색 비교 UserVO.active true /false 변경
	UserDataSourceDao userDataSourceDao = new UserDataSourceDao();
	userDataSourceDao.getUser(userVO);
	}
	
	out.println("<html>");
	out.println("<head></head>");
	out.println("<body>");
	out.println("<h2>Login 화면 </h2>");
	
	if(userVO != null && userVO.isActive()){
		out.println(userVO.getId()+"님 환영합니다.");
		//Login 이 정상적으로 이루어 진 경우
		// ::session에 로그인 정보로 userVO instance 저장
		session.setAttribute("userVO", userVO);
	}else{
		out.println("Login 실패 id, pwd를 확인하세요.");
	}
	
	out.println("<p><p><a href='/edu/jw05/LoginBeanDataSourceSession.html'> 뒤로</a>");
	out.println("</body>");
	out.println("</html>");
	}
	
}
