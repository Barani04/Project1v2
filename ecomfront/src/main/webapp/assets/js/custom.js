$(function() {
	//for active menu
	switch(menu){
	
	case 'About':
		$('#about').addClass('active');
		break;
		
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#productslist').addClass('active');
		break;
		
	default:
		$('#a_'+menu).addClass('active');
		break;
	}
	
})