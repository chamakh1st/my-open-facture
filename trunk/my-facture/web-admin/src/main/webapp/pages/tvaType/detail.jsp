<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
#detailDiv {
	width: 80%;
	margin: auto;
	margin-top: 100px;
}
</style>
</head>
<body>
	<f:view>
		<h:form>
			<div id="detailDiv">
				<table border="1" width="100%">
					<tr>
						<td width="50%"><h:outputLabel value="Code" /></td>
						<td width="50%"><h:inputText /></td>
					</tr>
					<tr>
						<td><h:outputLabel value="Percentage" /></td>
						<td><h:inputText /></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td>
							<h:commandButton value="annuler" type="reset"/>
							<h:commandButton value="valider"/>
						</td>
					</tr>
				</table>

			</div>
		</h:form>
	</f:view>
</body>
</html>