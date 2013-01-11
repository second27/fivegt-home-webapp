Ext.onReady(function() {
	

	Ext.QuickTips.init();

	
	
	var self_comment = new Ext.FormPanel({
		renderTo : 'self_comment',
		title : 'Test Extjs lib',
		frame : true,
		width : 980,
		allowBlank : false,
		items : [ {
			xtype : 'textarea',
			anchor : '100%',
			allowblank : false
		}, {
			xtype : 'textarea',
			anchor : '100%',
			allowblank : false
		}, {
			xtype : 'textarea',
			anchor : '100%',
			allowblank : false
		} ]
	});

	
});
