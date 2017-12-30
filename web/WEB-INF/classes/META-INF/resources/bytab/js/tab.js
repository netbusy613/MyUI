// JavaScript Docume
$(document).ready(function() {
	$(".bytab").each(function() {
		$(this).find(".content>div").hide();
		$(this).find(".tabs>li:first").attr("id","current"); // Activate first tab
		$(this).find(".content>div:first").show(); // Show first tab content		
		$(this).find('.tabs a').mouseover(function(e) {
			//alert($(this).parent().parent().html());
			var index = $(this).parent().index();
			e.preventDefault();      
			$(this).parent().parent().parent().find(".content>div").hide(); //Hide all content
			$(this).parent().parent().children("li").attr("id",""); //Reset id's
			$(this).parent().attr("id","current"); // Activate this
			$(this).parent().parent().parent().find(".content>div").eq(index).show();
			
		});
    });
})();