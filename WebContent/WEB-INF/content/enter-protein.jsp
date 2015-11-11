<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter Steps</h1>
<s:form>
	<s:textfield name="enteredProtein" />
	<s:submit value="Enter" />
</s:form>
<div>Last amount entered: <s:property value="enteredProtein" /> steps</div>
<div>Total for the day: <s:property value="proteinData.total" /> steps</div>
<div><s:property value="goalText" />: <s:property value="proteinData.goal" /> steps</div>
<s:if test="%{proteinData.total >= proteinData.goal}">
	<s:property value="resetTotal()" />
</s:if>
<a href="<s:url action="enter-goal" />">Edit Goal</a>
</body>
</html>