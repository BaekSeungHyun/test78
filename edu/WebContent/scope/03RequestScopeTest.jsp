<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	Integer count = (Integer)request.getAttribute("count");
	
	if(count==null) {
		out.println(":: 1번째 Request ::");
		request.setAttribute("count", new Integer(1));
	}
	
	else {
		int changeCount = count.intValue() + 1;
		out.println(":: " + changeCount + " 번째 Request ::");
		
		request.setAttribute("count", new Integer(changeCount));
	}

%>