<%@ page contentType="text/html; charset=EUC-KR"%>

<!--  JSTL 사용 :  taglib 지시자 설정-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- 아래의 내용을 차례대로 주석을 풀고 확인/각각을 확인 후 Browser 주소창에 URL확인 -->
	<%-- 
		<c:redirect url="/jw09/11JSTL_c_set.jsp"/>
	--%>
	
	<%--
		<c:redirect url="http://127.0.0.1:8080/edu/jw10/52JSTL_c_import.jsp">
			<c:param name="name" value="value"/>
		</c:redirect>
	--%>
	
	<%--
		<c:url var="url" value="http://127.0.0.1:8080/edu/jw10/52JSTL_c_import.jsp" scope="session">
			<c:param name="name" value="value"/>
		</c:url>
		<c:redirect url="${url}"/>
	--%>