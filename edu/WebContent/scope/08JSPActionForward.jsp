<%@ page contentType="text/html;charset=euc-kr" %>

<html>
<body>
	<h3>
	::08JSPActionForward.jsp ����</br>
	<% request.setAttribute("aaa",new String("�����")); %>
	<jsp:forward page="09JSPActionForward.jsp"/>
	
	::08JSPActionForward.jsp ��</br>
	</body>
</html>