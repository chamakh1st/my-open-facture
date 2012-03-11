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
<!-- 			<li><a href="#">Adress</a> -->
<!-- 				<ul> -->
<!-- 					<li><a href="main.jsp?entity=Adress&action=search" target="main">search</a></li> -->
<!-- 					<li><a href="main.jsp?entity=Adress&action=list" target="main">list</a></li> -->
<!-- 					<li><a href="main.jsp?entity=Adress&action=create" target="main">create</a></li> -->
<!-- 				</ul> -->
<!-- 			</li> -->
<!-- 			<li><a href="#">Article</a> -->
<!-- 				<ul> -->
<!-- 					<li><a href="main.jsp?entity=Article&action=search" target="main">search</a></li> -->
<!-- 					<li><a href="main.jsp?entity=Article&action=list" target="main">list</a></li> -->
<!-- 					<li><a href="main.jsp?entity=Article&action=create" target="main">create</a></li> -->
<!-- 				</ul> -->
<!-- 			</li> -->
<!-- 			<li><a href="#">ArticleType</a> -->
<!-- 				<ul> -->
<!-- 					<li><a href="main.jsp?entity=ArticleType&action=search" target="main">search</a></li> -->
<!-- 					<li><a href="main.jsp?entity=ArticleType&action=list" target="main">list</a></li> -->
<!-- 					<li><a href="main.jsp?entity=ArticleType&action=create" target="main">create</a></li> -->
<!-- 				</ul> -->
<!-- 			</li> -->
<!-- 			<li><a href="#">BankAccount</a> -->
<!-- 				<ul> -->
<!-- 					<li><a href="main.jsp?entity=BankAccount&action=search" target="main">search</a></li> -->
<!-- 					<li><a href="main.jsp?entity=BankAccount&action=list" target="main">list</a></li> -->
<!-- 					<li><a href="main.jsp?entity=BankAccount&action=create" target="main">create</a></li> -->
<!-- 				</ul> -->
<!-- 			</li> -->
<!-- 			<li><a href="#">Company</a> -->
<!-- 				<ul> -->
<!-- 					<li><a href="main.jsp?entity=Company&action=search" target="main">search</a></li> -->
<!-- 					<li><a href="main.jsp?entity=Company&action=list" target="main">list</a></li> -->
<!-- 					<li><a href="main.jsp?entity=Company&action=create" target="main">create</a></li> -->
<!-- 				</ul> -->
<!-- 			</li> -->
<!-- 			<li><a href="#">Country</a> -->
<!-- 				<ul> -->
<!-- 					<li><a href="main.jsp?entity=Country&action=search" target="main">search</a></li> -->
<!-- 					<li><a href="main.jsp?entity=Country&action=list" target="main">list</a></li> -->
<!-- 					<li><a href="main.jsp?entity=Country&action=create" target="main">create</a></li> -->
<!-- 				</ul> -->
<!-- 			</li> -->
<!-- 			<li><a href="#">Currency</a> -->
<!-- 				<ul> -->
<!-- 					<li><a href="main.jsp?entity=Currency&action=search" target="main">search</a></li> -->
<!-- 					<li><a href="main.jsp?entity=Currency&action=list" target="main">list</a></li> -->
<!-- 					<li><a href="main.jsp?entity=Currency&action=create" target="main">create</a></li> -->
<!-- 				</ul> -->
<!-- 			</li> -->
<!-- 			<li><a href="#">Document</a> -->
<!-- 				<ul> -->
<!-- 					<li><a href="main.jsp?entity=Document&action=search" target="main">search</a></li> -->
<!-- 					<li><a href="main.jsp?entity=Document&action=list" target="main">list</a></li> -->
<!-- 					<li><a href="main.jsp?entity=Document&action=create" target="main">create</a></li> -->
<!-- 				</ul> -->
<!-- 			</li> -->
<!-- 			<li><a href="#">DocumentLine</a> -->
<!-- 				<ul> -->
<!-- 					<li><a href="main.jsp?entity=DocumentLine&action=search" target="main">search</a></li> -->
<!-- 					<li><a href="main.jsp?entity=DocumentLine&action=list" target="main">list</a></li> -->
<!-- 					<li><a href="main.jsp?entity=DocumentLine&action=create" target="main">create</a></li> -->
<!-- 				</ul> -->
<!-- 			</li> -->
<!-- 			<li><a href="#">DocumentType</a> -->
<!-- 				<ul> -->
<!-- 					<li><a href="main.jsp?entity=DocumentType&action=search" target="main">search</a></li> -->
<!-- 					<li><a href="main.jsp?entity=DocumentType&action=list" target="main">list</a></li> -->
<!-- 					<li><a href="main.jsp?entity=DocumentType&action=create" target="main">create</a></li> -->
<!-- 				</ul> -->
<!-- 			</li> -->
<!-- 			<li><a href="#">LegalForm</a> -->
<!-- 				<ul> -->
<!-- 					<li><a href="main.jsp?entity=LegalForm&action=search" target="main">search</a></li> -->
<!-- 					<li><a href="main.jsp?entity=LegalForm&action=list" target="main">list</a></li> -->
<!-- 					<li><a href="main.jsp?entity=LegalForm&action=create" target="main">create</a></li> -->
<!-- 				</ul> -->
<!-- 			</li> -->
			<li><a href="#">TvaType</a>
				<ul>
					<li><h:outputLink  value="tvaType/search.jsp" target="main">search</h:outputLink></li>
					<li><h:outputLink value="tvaType/list.jsp" target="main">list</h:outputLink></li>
					<li><h:outputLink value="tvaType/detail.jsp" target="main">create</h:outputLink></li>
				</ul>
			</li>
<!-- 			<li><a href="#">User</a> -->
<!-- 				<ul> -->
<!-- 					<li><a href="main.jsp?entity=User&action=search" target="main">search</a></li> -->
<!-- 					<li><a href="main.jsp?entity=User&action=list" target="main">list</a></li> -->
<!-- 					<li><a href="main.jsp?entity=User&action=create" target="main">create</a></li> -->
<!-- 				</ul> -->
<!-- 			</li> -->
		</ul>
	</f:view>
</body>
</html>