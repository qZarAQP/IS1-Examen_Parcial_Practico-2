$.postJSON = function(url, data, callback) {
    return jQuery.ajax({
        'type': 'POST',
        'url': url,
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'        	
        },
        'data': JSON.stringify(data),
        'dataType': 'json',
        'success': callback
    });
};



function login() {
	
	alert("logn:   ");

	
	var _usuario = $("#usuario").val();
	var _password = $("#password").val();
	
	//alert("transfiriendo: " + monto + " desde " + origen + " a " + destino);

	var admin = {
		"nickname": _usuario,
		"password": _password
	};

	$.postJSON( "login_adm", admin,function( data ) {
	
	});
	
	$("#loginhead").hide();
	$("#menu").show();
	header();
	
}

function header() {
	//alert("*nsssssssssssssssssssssssss");
	
	document.getElementById('head').innerHTML = 'bdsc';
	//alert("*");
	$.getJSON( "session_adm", function( data ) {
		//console.log(data);
		
		//$("#head").val(data.nickname);
		//alert("*"+data);
		document.getElementById('head').innerHTML = data.nickname;
		
		
	});	
}

function mostrarregistro() {

	$("#loginhead").hide();
	$("#registro").show();

}



function mostrarconfiguracion() {

	//$("#loginhead").hide();
	$("#configuracion").show();

}

function configuracion()
{
	var _nickname = $("#nickname").val();
	
	var _email = $("#email").val();
	var _password = $("#password").val();
	
	alert("transfiriendo:  desde ");

	var user = {
				
		"password": _password,
		"nickname": _nickname,
		"email": _email,
		
	};

	$.postJSON( "configuracion_upd", user,function( data ) {
			
	
	});
	
	alert("seeeeeeeeeeeee ");

	
	
}







