<%@ page contentType="text/html;charset=euc-kr"%>

<HTML>
 <BODY>
	:: 10ResponseSendRedirect.jsp ����<br/>

	<% request.setAttribute("aaa",new String("�����")); %>

	<!-- response.sendRedirect() �� URL, URL, Relative URL ��� ����-->
	<% response.sendRedirect("09JSPActionForward.jsp");  %>
	<% // response.sendRedirect("http://127.0.0.1:8080/edu/jw07/09JSPActionForward.jsp"); %>
	<% // response.sendRedirect("http://www.daum.net"); %>

	:: 10ResponseSendRedirect.jsp ��<br/>
   </BODY>
</HTML>
