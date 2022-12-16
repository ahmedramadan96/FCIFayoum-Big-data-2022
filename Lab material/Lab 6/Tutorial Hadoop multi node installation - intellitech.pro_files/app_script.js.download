jQuery(document).ready(function($){
	"use strict";

	
	var carpro_slider_styles = $("#carpro_slider_styles").val();
	if( carpro_slider_styles == 1 || carpro_slider_styles == 2 ){

		$("#hide1").hide('slow');
		$("#hide2").hide('slow');
		$("#hide3").hide('slow');
		$("#hide4").hide('slow');
		$("#hide5").hide('slow');
		$("#hide6").hide('slow');
		$("#bgcontroller").hide('slow');
		$("#cp_ex_length_area").hide('slow');
		$("#conhide").hide('slow');
		$("#content_textsize").hide('slow');
		$("#conalign").hide('slow');
		$("#datetimes").hide('slow');
		$("#datealign").hide('slow');
		$("#datefsize").hide('slow');
		$("#datefcolors").hide('slow');
	}
	else {
		$("#hide1").show('slow');
		$("#hide2").show('slow');
		$("#hide3").show('slow');
		$("#hide4").show('slow');
		$("#hide5").hide('slow');
		$("#hide6").hide('slow');
	}
	
	
	var carpro_slider_styles = $("#carpro_slider_styles").val();
	if( carpro_slider_styles == 3 || carpro_slider_styles == 4 || carpro_slider_styles == 5 || carpro_slider_styles == 6 ){

		$("#hide1, #hide2, #hide3, #hide4").show('slow');
		$("#bgcontroller").hide('slow');
		$("#cp_ex_length_area").hide('slow');
		$("#conhide").hide('slow');
		$("#content_textsize").hide('slow');
		$("#conalign").hide('slow');
		$("#datetimes").hide('slow');
		$("#datealign").hide('slow');
		$("#datefsize").hide('slow');
		$("#datefcolors").hide('slow');
	}
		
	var carpro_slider_styles = $("#carpro_slider_styles").val();
	if( carpro_slider_styles == 7 || carpro_slider_styles == 8 || carpro_slider_styles == 9 || carpro_slider_styles == 10 ){

		$("#hide1, #hide2, #hide3, #hide4").hide('slow');
		$("#bgcontroller").show('slow');
		$("#cp_ex_length_area").show('slow');
		$("#conhide").show('slow');
		$("#content_textsize").show('slow');
		$("#conalign").show('slow');
		$("#datetimes").show('slow');
		$("#datealign").show('slow');
		$("#datefsize").show('slow');
		$("#datefcolors").show('slow');
		$("#hide5").show('slow');
		$("#hide6").show('slow');
		$("#caphidden").hide('slow');
	}

	

	
	$("#carpro_slider_styles").on('change', function(){

		var carpro_slider_styles = $("#carpro_slider_styles").val();
		if( carpro_slider_styles == 3 || carpro_slider_styles == 4 || carpro_slider_styles == 5 || carpro_slider_styles == 6 ){
			$("#hide1, #hide2, #hide3, #hide4").show('slow');
			$("#bgcontroller").hide('slow');
			$("#conhide").hide('slow');
			$("#content_textsize").hide('slow');
			$("#conalign").hide('slow');
			$("#datetimes").hide('slow');
			$("#datealign").hide('slow');
			$("#datefsize").hide('slow');
			$("#datefcolors").hide('slow');
		}
		else{
			$("#hide1, #hide2, #hide3, #hide4").hide('slow');
			$("#bgcontroller").hide('slow');
			$("#content_textsize").hide('slow');
			$("#conhide").hide('slow');
			$("#conalign").hide('slow');
			$("#datetimes").hide('slow');
			$("#datealign").hide('slow');
			$("#datefsize").hide('slow');
			$("#datefcolors").hide('slow');
		}
		
		
		if( carpro_slider_styles == 7 || carpro_slider_styles == 8 || carpro_slider_styles == 9 || carpro_slider_styles == 10 ){
			$("#bgcontroller").show("slow");
			$("#conhide").show("slow");
			$("#content_textsize").show("slow");
			$("#conalign").show("slow");
			$("#datetimes").show("slow");
			$("#datealign").show("slow");
			$("#datefsize").show("slow");
			$("#datefcolors").show("slow");
			$("#caphidden").hide("slow");
			$("#hide5").show("slow");
			$("#hide6").show("slow");
			$("#cp_ex_length_area").show("slow");
		}
		else {
			$("#bgcontroller").hide("slow");
			$("#conhide").hide("slow");
			$("#content_textsize").hide("slow");
			$("#conalign").hide("slow");
			$("#datetimes").hide("slow");
			$("#datealign").hide("slow");
			$("#datefsize").hide("slow");
			$("#datefcolors").hide("slow");
			$("#hide5").hide("slow");
			$("#hide6").hide("slow");
			$("#caphidden").show("slow");
			$("#cp_ex_length_area").hide("slow");
		}		
	});

	$(".changer").on('change', function(){
		var post_types = $(this).val();
		var postid = $(this).attr('postid');
		$.ajax({
			type: 'POST',
			url: carpros_pro_ajax.carpros_pro_ajaxurl,
			data: { "action": "carpros_get_taxonomy_categories","post_types":post_types,"postid":postid },
			success: function(data){
				$("#get_cate_area").html(data);
			}
		});
	});

	if($("#post_grid_meta_options").val() == ""){
		$("#get_cate_area").html("Select any Post Type");
	}

	$("#carpro_slider_hide_img").on('change', function(){
		var getImgVal = $(this).val();
		if(getImgVal  == 2){
			$("#img_controller, #img_controller2").hide('slow');
		}
		if(getImgVal  == 1){
			$("#img_controller, #img_controller2").show('slow');
		}
	});

});