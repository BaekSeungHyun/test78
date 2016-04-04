package jw04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginBeanIntitParam
 */
//@WebServlet("/LoginBeanIntitParam")
public class LoginBeanInitParam extends HttpServlet {
	
	private String jdbcDriver;
	private String jdbcURL;
	private String jdbcUser;
	private String jdbcPasswd;
	
	//init() method overrinding
	public void init(ServletConfig sc) throws ServletException{
		super.init(sc);
		jdbcDriver=sc.getInitParameter("jdbcDriver");
		jdbcURL=sc.getInitParameter("jdbcURL");
		jdbcUser=sc.getInitParameter("jdbcUser");
		jdbcPasswd=sc.getInitParameter("jdbcPasswd");
		
		//아래는 디버깅용 :: console 확인
		System.out.println("web.xml에 등록된 InitParam값을 추출유무 확인");
		System.out.println("jdbcDriver :"+jdbcDriver);
		System.out.println("jdbcURL :"+jdbcURL);
		System.out.println("jdbcUser :"+jdbcUser);
		System.out.println("jdbcPasswd :"+jdbcPasswd);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=euc_kr");
		PrintWriter out=res.getWriter();
		
		String id=req.getParameter("id");
		String pwd=req.getParameter("pwd");
		
		// UserVO instance 생성 및 Client Form Data 전달(Binding)
		UserVO userVO=new UserVO();
		userVO.setId(id);
		userVO.setPwd(pwd);
		
		//DB접근 data검색 비교 UserVO active true/false 변경
		UserInitParamDao dao=new UserInitParamDao();
		//DB접속정보 driver, url, user, password 설정
		dao.setJdbcDriver(jdbcDriver);
		dao.setJdbcURL(jdbcURL);
		dao.setJdbcUser(jdbcUser);
		dao.setJdbcPasswd(jdbcPasswd);
		
		dao.getUser(userVO);
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		
		out.println("<h2>Login 화면</h2>");
		
		if(userVO.isActive()){
			out.println(id+"님 환영합니다.");
		}else{
			out.println("Login 실패 id,pwd를 확인하세요.");
		}
		
		out.println("<p><p><a href='/edu/he04/loginBeanVODao.html'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");
	}
}
