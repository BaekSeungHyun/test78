<%@ page contentType="text/html; charset=EUC-KR"%>

<%@ page isELIgnored="false"%>

���� : <%= "ȫ�浿" %><br/>
���� : <%= 1234 %><br/><hr/><br/>

${"##### Expression Language�� ǥ��/Expression Tag �� ������#####"}<br/>
���� : ${"ȫ�浿"}<br/>
���� : ${1234}<br/><hr/><br/>

<h3>1.�⺻�� ���,��,���迬���� ���</h3><p/>
����+���� : ${1+2} <br/>
����+���� : ${"1"+2} <br/>

<h4>expression tag ��� : ����*���� : <%= Integer.parseInt("1")+2 %></h4>

10==10 : ${10==10} <br/>
10>=1  : ${10>=1} <br/>
!true : ${!true} <br/><hr/><br/>

<h3>2. ���ǿ����� ��� </h3><p/>
���� ?  true :  false  = $ {10>100 ? "10 �� 100����ũ�� true" : "10�� 100���� �۴� false"}
<br/><hr/><br/>

<h3>3. empty ������ ��� </h3><p/>
empty null : ${empty null}<br/>
empty " " : ${empty" "}<br/>
empty "" : ${empty ""} &nbsp;&nbsp;&nbsp; null String�� �������� String str = new String()