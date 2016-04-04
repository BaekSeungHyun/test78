<%@ page contentType="text/html; charset=EUC-KR"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- JSTL 사용 :  taglib 지시자 설정-->

<h3>ㅇ taglib의 c:set, c:remove,c:out을 사용</h3>

<c:set var="num1" value="100" scope="page"/>
<c:set var="num2"/> <!-- Default ObjectScope : page -->

<%
  //page ObjectScope에 num2 Value 확인
  String abc=(String)pageContext.getAttribute("num2");
  System.out.println("abc를 확인: "+"_ "+abc+" _");
%>

1. num1은 empty : ${empty pageScope.num1}  num1=${pageScope.num1} <br/>
2. num2은 empty : ${empty num2} num2 = _${num2}_ <br/>
3. num1+num2 : ${num1+pageScope.num2}<br/>
<!-- EL은 JSTL에서 먼저 사용되었고,  JSP2.0 지원-->
4. c:out을 사용한 num1+num2 : <c:out value="${num1+num2}"/><br/>
<hr/>

<c:set var="num1" value="${num1+100}"/>
5. num1 : ${num1} <br/><hr/>

 <c:remove var="num1" scope="page"/>
6. num1은 empty : true  num1 = ${empty num1} num1=_${num1}_ <br/>
7. num2은 empty : true  num2 = ${empty num2}_num2=_${pageScope.num2}_

<%
  //page ObjectScope에서 num1 remove 확인
  String def=(String)pageContext.getAttribute("num1");
  System.out.println("_"+def+"_");
%>
   

