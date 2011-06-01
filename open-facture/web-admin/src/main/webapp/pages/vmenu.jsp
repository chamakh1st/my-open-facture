<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="../js/jquery/vmenu/vmenu.css" rel="stylesheet">
<script type="text/javascript" src="../js/jquery/jquery-1.6.1.js"></script>
<script type="text/javascript" src="../js/jquery/vmenu/vmenu.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#vmenu').vmenu();
	});
</script>
<title>Insert title here</title>
</head>
<body>
	<f:view>
Home admin
	<ul id="vmenu">
			<li><a href="#">Adress</a>
				<ul>
					<li><a href="#">search</a></li>
					<li><a href="#">list</a></li>
					<li><a href="#">create</a></li>
				</ul>
			</li>
			<li><a href="#">Article</a>
				<ul>
					<li><a href="#">search</a></li>
					<li><a href="#">list</a></li>
					<li><a href="#">create</a></li>
				</ul>
			</li>
			<li><a href="#">ArticleType</a>
				<ul>
					<li><a href="#">search</a></li>
					<li><a href="#">list</a></li>
					<li><a href="#">create</a></li>
				</ul>
			</li>
			<li><a href="#">BankAccount</a>
				<ul>
					<li><a href="#">search</a></li>
					<li><a href="#">list</a></li>
					<li><a href="#">create</a></li>
				</ul>
			</li>
			<li><a href="#">Company</a>
				<ul>
					<li><a href="#">search</a></li>
					<li><a href="#">list</a></li>
					<li><a href="#">create</a></li>
				</ul>
			</li>
			<li><a href="#">Country</a>
				<ul>
					<li><a href="#">search</a></li>
					<li><a href="#">list</a></li>
					<li><a href="#">create</a></li>
				</ul>
			</li>
			<li><a href="#">Currency</a>
				<ul>
					<li><a href="#">search</a></li>
					<li><a href="#">list</a></li>
					<li><a href="#">create</a></li>
				</ul>
			</li>
			<li><a href="#">Facture</a>
				<ul>
					<li><a href="#">search</a></li>
					<li><a href="#">list</a></li>
					<li><a href="#">create</a></li>
				</ul>
			</li>
			<li><a href="#">FactureLine</a>
				<ul>
					<li><a href="#">search</a></li>
					<li><a href="#">list</a></li>
					<li><a href="#">create</a></li>
				</ul>
			</li>
			<li><a href="#">LegalForm</a>
				<ul>
					<li><a href="#">search</a></li>
					<li><a href="#">list</a></li>
					<li><a href="#">create</a></li>
				</ul>
			</li>
			<li><a href="#">TvaType</a>
				<ul>
					<li><a href="#">search</a></li>
					<li><a href="#">list</a></li>
					<li><a href="#">create</a></li>
				</ul>
			</li>
			<li><a href="#">User</a>
				<ul>
					<li><a href="#">search</a></li>
					<li><a href="#">list</a></li>
					<li><a href="#">create</a></li>
				</ul>
			</li>
		</ul>
	</f:view>
</body>
</html>