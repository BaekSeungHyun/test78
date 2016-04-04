<%@ page contentType ="text/html;charset=euc-kr" %>

<%@ page import="java.util.List" %>
<%@ page import="jw.service.user.vo.UserVO"%>
<%@ page import="jw.service.user.dao.UserDao"%>

<!--
	:: workflow control) : 방어적코딩 : 로그인 유무 확인
	:: 로그인 회원은 session ObjectScope 에 userVO가 존재하며
	:: Field 의 active는 true
-->

<%
	UserVO userVO = (UserVO)session.getAttribute("userVO");
	if(userVO==null){
		userVO=new UserVO();
	}
%>

<!--
	==> 미 login 한 회원 : UserVO.active false
		1. 로그인 page include
		2. 회원가입 page로 이동할 수 있는 link display
	==> login한 회원 : UserVO.active 	true라면
		1. DAO 접근 회원 정보 GET
		2. 회원정보 Display
-->
<% if(!userVO.isActive()){%>
	<!--1. 로그인 page inlcude...-->
	<jsp:include page="../jw07/login.html"/>
	<br/><br/>
	<!--2. 회원가입 page로 이동 할 수 있는 link-->
	<a href="/edu/jw07/addUserhtml"> 회원가입...</a>
<%} else{ %>
	<center><h1> 회원가입한 전체목록... </h1></center><hr/>
		<center>
			<table border='1'>
				<tr>
					<th>번호</th><th>아이디</th><th>비밀번호</th>
				</tr>
				<% UserDao userDao= new UserDao();%>
				<% List<UserVO> arrayList = userDao.getUserList();%>
				<% for(UserVO user: arrayList) { %>
					
					<tr>
						<td><%=user.getNo()%></td>
						<td><%=user.getId()%></td>
						<td><%=user.getPwd()%></td>
					</tr>
			<%	} %>
			</table>
		</center>
<% } %>