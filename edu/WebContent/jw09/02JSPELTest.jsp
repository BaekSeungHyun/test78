<%@ page contentType="text/html; charset=EUC-KR"%>

<%@ page import="java.util.*" %>

<h3>4.����(.,[])������ ���</h3><p/>
<%
	pageContext.setAttribute("abc",new String("page ObjectScope ����� ���ڿ�"));
	
	request.setAttribute("abc",new String("request ObjectScope ����� ���ڿ�"));
	
	session.setAttribute("abc",new ArrayList());
	
	ArrayList arrayList=new ArrayList();
	arrayList.add(new String("ArrayList ����� ���ڿ�"));
	session.setAttribute("def",arrayList);
	
	HashMap hashMap=new HashMap();
	hashMap.put("zzz",new String("HashMap ����� ���ڿ�"));
	application.setAttribute("abc",hashMap);
%>

<h5>1. page ObjectScope ����</h5>
	��${pageScope.abc} = ${pageScope["abc"]}

<h5>2. request ObjectScope ����</h5>
	��${requestScope.abc} = ${requestScope["abc"]}
		
<h5>3. session ObjectScope ����:����� ArrayList empty����</h5>
	��${empty sessionScope.abc} = ${empty sessionScope["abc"]}

<h5>4.1 session n ObjectScope ����:����� ArrayList empty����</h5>
	��${empty sessionScope.def} = ${empty sessionScope["def"]}

<h5>4.2 session ObjectScope ����</h5>
	��${sessionScope.def[0]} = ${sessionScope["def"][0]}
			
<h5>5.1 application ObjectScope ����:����� HashMap empty����</h5>
	��${empty applicationScope.abc} = ${empty applicationScope["abc"]}

<h5>5.2 application ObjectScope ����</h5>
	��${applicationScope.abc.zzz} = ${applicationScope["abc"].zzz}<br/><hr/><br/>
	
<h3>Object Scope�� ������ �������� �ʰ� EL�� ��� abc���ٽ�<br/>
	� ObjectScope���� ����Ǵ��� Ȯ������.<br/><br/>
	� Object Scope�� �����ΰ� : ${abc}</h3>		