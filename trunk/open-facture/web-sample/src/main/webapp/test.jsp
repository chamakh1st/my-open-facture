<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Title</title>
	</head>
<body>
	<f:view>
		<h:outputLabel value="h:outputLabel" for="title"/><br/>
		<h:outputLink title="title" id="title">h:outputLink</h:outputLink><br/>
		<h:outputText value="h:outputText" /><br/>
		<h:commandButton action="#{testBean.getNom}" value="valueeeee" /><br/>
		<h:commandLink action="#{testBean.getNom}" value="valueeeee" /><br/>
		<h:inputSecret value="h:inputSecret" /><br/>
		<h:inputText value="h:inputText" /><br/>
		<h:inputTextarea value="h:inputTextarea" /><br/>
		<h:outputText value="OBJECT SELECT2" /><br/>
		<h:selectBooleanCheckbox value="h:selectBooleanCheckbox"  label="label"/>
		<h:dataTable value="#{testBean.testList}" var="list">
			<h:column> 
				<f:facet name="header">header column</f:facet>
				<h:outputText value="#{list}" />
			</h:column>
		</h:dataTable>
	</f:view>
</body>
</html>