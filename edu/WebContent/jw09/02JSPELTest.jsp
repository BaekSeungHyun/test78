<%@ page contentType="text/html; charset=EUC-KR"%>

<%@ page import="java.util.*" %>

<h3>4.색인(.,[])연산자 사용</h3><p/>
<%
	pageContext.setAttribute("abc",new String("page ObjectScope 저장된 문자열"));
	
	request.setAttribute("abc",new String("request ObjectScope 저장된 문자열"));
	
	session.setAttribute("abc",new ArrayList());
	
	ArrayList arrayList=new ArrayList();
	arrayList.add(new String("ArrayList 저장된 문자열"));
	session.setAttribute("def",arrayList);
	
	HashMap hashMap=new HashMap();
	hashMap.put("zzz",new String("HashMap 저장된 문자열"));
	application.setAttribute("abc",hashMap);
%>

<h5>1. page ObjectScope 접근</h5>
	ㅇ${pageScope.abc} = ${pageScope["abc"]}

<h5>2. request ObjectScope 접근</h5>
	ㅇ${requestScope.abc} = ${requestScope["abc"]}
		
<h5>3. session ObjectScope 접근:저장된 ArrayList empty유무</h5>
	ㅇ${empty sessionScope.abc} = ${empty sessionScope["abc"]}

<h5>4.1 session n ObjectScope 접근:저장된 ArrayList empty유무</h5>
	ㅇ${empty sessionScope.def} = ${empty sessionScope["def"]}

<h5>4.2 session ObjectScope 접근</h5>
	ㅇ${sessionScope.def[0]} = ${sessionScope["def"][0]}
			
<h5>5.1 application ObjectScope 접근:저장된 HashMap empty유무</h5>
	ㅇ${empty applicationScope.abc} = ${empty applicationScope["abc"]}

<h5>5.2 application ObjectScope 접근</h5>
	ㅇ${applicationScope.abc.zzz} = ${applicationScope["abc"].zzz}<br/><hr/><br/>
	
<h3>Object Scope의 영역을 지정하지 않고 EL을 사용 abc접근시<br/>
	어떤 ObjectScope값이 추출되는지 확인하자.<br/><br/>
	어떤 Object Scope의 내용인가 : ${abc}</h3>		