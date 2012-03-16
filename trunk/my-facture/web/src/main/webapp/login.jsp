<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<f:view>
		<h:form>
			<h:messages globalOnly="true" />
			<h:panelGrid columns="2"> 
				<h:outputLabel value="login" />
				<h:inputText id="login" value="login"></h:inputText>
				<h:outputLabel value="password" />
				<h:inputSecret id="password" value="password" />
				<h:commandButton action="/pages/home" value="login"/>
			</h:panelGrid>
		</h:form>
	</f:view>
</body>
</html>
