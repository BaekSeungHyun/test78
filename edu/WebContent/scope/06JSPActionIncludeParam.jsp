<%@ page contentType="text/html;charset=euc_kr" %>

<html>
<body>

::06JSPActionIncludeParam.jsp ���� <br/>

<%
 //Scriptlet tag ���� ����::service() Method local variable
 String value="local varibale";
 
 //request,session,application ObjectScope Data ����
 request.setAttribute("aaa",new String("request ObjectScope ����� ���ڿ�"));
 session.setAttribute("bbb",new String("request ObjectScope ����� ���ڿ�"));
 application.setAttribute("ccc",new String("request ObjectScope ����� ���ڿ�"));
%>
 
  <!-- Expression Tag �� �ٸ� �뵵�� ����/���� ó�� -->
  <jsp:include page="07JSPActionIncludeParam.jsp">
	<jsp:param name="str" value="<%=value %>"/>
  </jsp:include>
  
:: 06JSPActionIncludeParam.jsp ��<br/>

</body>
</html>