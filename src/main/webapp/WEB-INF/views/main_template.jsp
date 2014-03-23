<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>

<html>
  <head>
    <meta charset="utf-8">
    <title>SpringMVC with tiles view resolver</title>
    <meta name="description" content="ajax based signup form infotuts">
    <meta name="author" content="Vassilis Foto">

<style type="text/css">
html,body{margin:0;padding:0}
body{font: 76% arial,sans-serif;text-align:center}
p{margin:0 10px 10px}
a{display:block;color: #981793;padding:10px}
div#header h1{height:80px;line-height:80px;margin:0;
  padding-left:10px;background: #EEE;color: #79B30B}
div#container{text-align:left}
div#content p{line-height:1.4}
div#navigation{background:#B9CAFF}
div#extra{background:#FF8539}
div#footer{background: #333;color: #FF8539}
div#footer p{margin:0;padding:5px 10px}

div#container{width:700px;margin:0 auto}
div#content{float:left;width:500px}
div#navigation{float:right;width:200px}
div#extra{float:left;width:500px}
div#footer{clear:both;width:100%}
</style>

	<!-- Stylesheets -->
	<link rel="stylesheet" href="css/base.css">
	<link rel="stylesheet" href="css/skeleton.css">
	<link rel="stylesheet" href="css/layout.css">
</head>
	<body>
		<div id="container">
			<div id="header"><h1>Header</h1></div>
			
			<div id="wrapper">
				<div id="content">
					<t:insertAttribute name="primary-content"/>
				</div>
			</div>		
			
			<div id="navigation">
		    	<t:insertAttribute name="login-form"/>		
			</div>
			
			<div id="footer">
				<t:insertAttribute name="footer"/>
			</div>
		</div>
	</body>
</html>