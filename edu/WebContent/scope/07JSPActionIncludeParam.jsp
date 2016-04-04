<%@ page contentType="text/html; charset=EUC-KR" %>

<br/><hr/>
<h3>
* 07JSPActionIncludeParam.jsp 시작<br/><br/>

request,session,application Object Scope Data 추출 <br/><br/>

requset ObjectScope 추출 Data :<%= request.getAttribute("aaa") %><br/>
session ObjectScope 추출 Data :<%= session.getAttribute("aaa") %><br/>
application ObjectScope 추출 Data :<%= application.getAttribute("aaa") %><br/><br/>

* 07JSPActionIncludeParam.jsp 끝<br/>
</h3>
<hr/><br/>