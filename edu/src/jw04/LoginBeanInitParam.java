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
		
		//�Ʒ��� ������ :: console Ȯ��
		System.out.println("web.xml�� ��ϵ� InitParam���� �������� Ȯ��");
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
		
		// UserVO instance ���� �� Client Form Data ����(Binding)
		UserVO userVO=new UserVO();
		userVO.setId(id);
		userVO.setPwd(pwd);
		
		//DB���� data�˻� �� UserVO active true/false ����
		UserInitParamDao dao=new UserInitParamDao();
		//DB�������� driver, url, user, password ����
		dao.setJdbcDriver(jdbcDriver);
		dao.setJdbcURL(jdbcURL);
		dao.setJdbcUser(jdbcUser);
		dao.setJdbcPasswd(jdbcPasswd);
		
		dao.getUser(userVO);
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		
		out.println("<h2>Login ȭ��</h2>");
		
		if(userVO.isActive()){
			out.println(id+"�� ȯ���մϴ�.");
		}else{
			out.println("Login ���� id,pwd�� Ȯ���ϼ���.");
		}
		
		out.println("<p><p><a href='/edu/he04/loginBeanVODao.html'>�ڷ�</a>");
		out.println("</body>");
		out.println("</html>");
	}
}
