<%@ page contentType="text/html;charset=euc-kr" %>

<br/>
<hr/>
	<h3>
	09JSPActionForward.jsp 시작..</br>
	<!--
	request Object Scope 공유유무 확인(Data 추출유무)
	request ObjectScope Data 추출 : response 전
	request ObjectScopeData 추출불가 : response 후
	-->
	
	<br/>Reqeust Object Scope 공유 유무 : <%=request.getAttribute("aaa")%><br/><br/>
	09JSPActionForward.jsp 끝</br>
	</h3>
<hr/>