<#assign tiles=JspTaglibs["http://tiles.apache.org/tags-tiles"]> 
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>template</title>
	
	<#include "importLib.ftl">
</head>
<body>
	<div id="header">
		<@tiles.insertAttribute name="header"/>
	</div>

	<div id="content_index">
		<@tiles.insertAttribute name="content"/>
	</div>

	<div id="footer">
		<@tiles.insertAttribute name="footer"/>
	</div>
</body>
</html>
