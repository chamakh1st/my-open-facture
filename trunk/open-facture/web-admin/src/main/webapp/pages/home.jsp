<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN"
   "http://www.w3.org/TR/html4/frameset.dtd">
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="../js/jquery/jquery-1.6.1.js"></script>
<style type="text/css">
	#container{
		height: 800px;
		width: 1000px;
		margin: auto;
	}
	#menu{
		width: 200px;
		height: 800px;
		float: left;
	}
	#main{
		width: 800px;
		height: 800px;
		float: left;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	<div id="container">
		<div id="menu">
			<iframe width="100%" height="100%" scrolling="no" src="vmenu.jsp"></iframe>
		</div>
		<div id="main">
			<iframe name="main" width="100%" height="100%" scrolling="no" src="main.jsp"></iframe>
		</div>
	</div>
</body>
</html>