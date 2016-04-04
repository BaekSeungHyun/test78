<%@ page contentType="text/html;charset=euc-kr" %>

<html>
	<head></head>
	<body>

		1. 주석문 연습입니다. <br/>

<%
	String str1 = "주석 1";
	String str2 = "주석 2";
%>

	<!--
		<%= str1 %>
		나는 html 주석입니다.
	-->

	<!--
		<%= str2 %>
		나는 html 주석입니다.
	-->

	<%--
		나는 jsp주석입니다.
	--%>

	<%
		//주석처리만 했습.
		//개행처리만 함은
	%>

	</body>
</html>

<!--
	::실행후 ..
	ㅇ Browser화면
	ㅇ Browser화면에서 소스보기한 내용
	ㅇ ~~~.jsp 파일
	ㅇ ~~~.java 파일
	동시 오픈하여
	html주석, jsp주석, java주석 확인
-->