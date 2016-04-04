<%@ page contentType="text/html;charset=euc-kr"%>

<HTML>
 <BODY>
	:: 10ResponseSendRedirect.jsp 시작<br/>

	<% request.setAttribute("aaa",new String("연결됨")); %>

	<!-- response.sendRedirect() 는 URL, URL, Relative URL 사용 가능-->
	<% response.sendRedirect("09JSPActionForward.jsp");  %>
	<% // response.sendRedirect("http://127.0.0.1:8080/edu/jw07/09JSPActionForward.jsp"); %>
	<% // response.sendRedirect("http://www.daum.net"); %>

	:: 10ResponseSendRedirect.jsp 끝<br/>
   </BODY>
</HTML>
