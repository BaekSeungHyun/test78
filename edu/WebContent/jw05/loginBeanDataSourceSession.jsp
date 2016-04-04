<%@ page contentType="text/html; charset=EUC-KR" %>

<%
	request.setCharacterEncoding("EUC_KR");
	response.setContentType("text/html;charset=euc-kr");
	// PrintWriter out = response.getWriter();
	
	// Client Form Data ó��
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	//session ����Ȯ�� :: ���ο� HttpSession ���� OR ���� HttpSession Get
	//HttpSession session = req.getSession(true);
	
	// �� login�� ȸ�� :: session�� ����� UserVO Get
	// �� login�� ȸ�� :: session�� ����� UserVO �����Ƿ� null Get
	jw04.UserVO userVO = (jw04.UserVO)session.getAttribute("userVO");
	System.out.println("session�� ����� UserCO ���� Ȯ�� : " + userVO);
	
	
	// �Ʒ��� �� ��츦 ���
	//==>����� ���� 1
	// :: loginBeanPoolSession.html�� ���ļ�(?) ���� ���
	// 1. id�� �Է����� ���� ��� :: req.getParameter("id")�� �� ==> ""(NullString)
	
	//==>����� ���� 2
	// :: Browser �ּ�â�� ���� URL
	// http://127.0.0.1:8080/edu/LoginBeanDataSourceSession �Է��� ���
	// 2. req.getParameter("id")�� �� ==> null
	
	//==> 1, 2 �� ��� DB���� ���ʿ� :: �Է� ���� ��ȿ���� üũ�ϴ� if��
	if( !(id == null || id.equals(""))){
		// UserVO instance ���� �� Client Form Data ����(Binding)
		userVO = new jw04.UserVO();
		userVO.setId(id);
		userVO.setPwd(pwd);
		
		// DB ���� Data �˻� �� UserVO.active true / false ����
		jw04.UserDataSourceDao userDataSourceDao = new jw04.UserDataSourceDao();
		userDataSourceDao.getUser(userVO); 
	}
%>

<html>
<head></head>
<body>
<h2>Login ȭ��</h2>
  <% if(userVO != null && userVO.isActive()){ %>
  	<%= userVO.getId() %>�� ȯ���մϴ�.
  	<%
  	   // Login�� ���������� �̷���� ���
  	   // :: session�� �α��� ������ userVO instance ����
  	   session.setAttribute("userVO",userVO);
  	%>
    <%}else{ %>
      Login ���� id, pwd�� Ȯ���ϼ���.
    <%} %>
    
    <p/><p/><a href='/edu/jw07/loginBeanDataSourceSessionJSP.html'>�ڷ�</a>
</body>
</html>