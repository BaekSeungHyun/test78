<%@ page contentType="text/html;charset=euc_kr" %>

<html>
<body>

::06JSPActionIncludeParam.jsp 시작 <br/>

<%
 //Scriptlet tag 변수 선언::service() Method local variable
 String value="local varibale";
 
 //request,session,application ObjectScope Data 저장
 request.setAttribute("aaa",new String("request ObjectScope 저장된 문자열"));
 session.setAttribute("bbb",new String("request ObjectScope 저장된 문자열"));
 application.setAttribute("ccc",new String("request ObjectScope 저장된 문자열"));
%>
 
  <!-- Expression Tag 의 다른 용도를 이해/변수 처리 -->
  <jsp:include page="07JSPActionIncludeParam.jsp">
	<jsp:param name="str" value="<%=value %>"/>
  </jsp:include>
  
:: 06JSPActionIncludeParam.jsp 끝<br/>

</body>
</html>