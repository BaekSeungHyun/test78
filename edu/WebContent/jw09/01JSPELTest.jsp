<%@ page contentType="text/html; charset=EUC-KR"%>

<%@ page isELIgnored="false"%>

문자 : <%= "홍길동" %><br/>
숫자 : <%= 1234 %><br/><hr/><br/>

${"##### Expression Language로 표현/Expression Tag 와 비교이해#####"}<br/>
문자 : ${"홍길동"}<br/>
숫자 : ${1234}<br/><hr/><br/>

<h3>1.기본적 산술,논리,관계연산자 사용</h3><p/>
문자+숫자 : ${1+2} <br/>
문자+숫자 : ${"1"+2} <br/>

<h4>expression tag 사용 : 문자*숫자 : <%= Integer.parseInt("1")+2 %></h4>

10==10 : ${10==10} <br/>
10>=1  : ${10>=1} <br/>
!true : ${!true} <br/><hr/><br/>

<h3>2. 조건연산자 사용 </h3><p/>
조건 ?  true :  false  = $ {10>100 ? "10 이 100보다크다 true" : "10이 100보다 작다 false"}
<br/><hr/><br/>

<h3>3. empty 연산자 사용 </h3><p/>
empty null : ${empty null}<br/>
empty " " : ${empty" "}<br/>
empty "" : ${empty ""} &nbsp;&nbsp;&nbsp; null String을 이해하자 String str = new String()