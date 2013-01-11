Ext.onReady(function(){

	var grade_griteria = new Ext.Panel({
		renderTo: 'grade_criteria',
		title: '평가등급기준',
		width:980,
		height:100,
		border:false,
	    items: [{
	        html: '	<table width="970px" align="center" style="font-family:Dotum; font-size:12px;">' +
						'<tr align="center" bgcolor="orange" height="25px" style="color:white; font-size:15px;">' +
							'<td width="180px"><b>A (탁월)</b></td>' +
							'<td width="180px"><b>B (우수)</b></td>' +
							'<td width="180px"><b>C (보통)</b></td>' +
							
						'</tr>' +
						'<tr align="center" valign="middle" height="40px">' +
							'<td>기대 수준을 크게 초과하는<br>월등한 수준</td>' +
							'<td>기대 수준 이상으로<br>성과 달성</td>' +
							'<td>기대 수준 만큼<br>성과 달성</td>' +
							
						'</tr>' +
					'</table>' 
	    }]

	
	});

});