<script type="text/javascript" src="/resources/lib/jquery/jquery.js"></script>
<script type="text/javascript" src="/resources/scripts/pictureLotation.js"></script>
<link rel="stylesheet" type="text/css" href="/resources/css/layout.css" />
<link rel="shortcut icon" href="/resources/images/favicon.ico" />

<script type="text/javascript">
$(document).ready(function() {
$("ul#topnav li").hover(function() { 
	$(this).find("span").show(); //Show the subnav
} , function() { //on hover out...
	$(this).css({ 'background' : 'none'}); 
	$(this).find("span").hide(); //Hide the subnav
});
	
});
</script>
	
	