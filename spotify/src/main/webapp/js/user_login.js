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
	
	
	var _usuario = $("#usuario").val();
	var _password = $("#password").val();
	
	//alert("transfiriendo: " + monto + " desde " + origen + " a " + destino);

	var user = {
		"nickname": _usuario,
		"password": _password
	};

	$.postJSON( "login", user,function( data ) {
	
	});
	
	$("#loginhead").hide();
	$("#menu").show();
	header();
	
}

function header() {
	//alert("*nsssssssssssssssssssssssss");
	
	//document.getElementById('head').innerHTML = 'bdsc';
	alert("*");
	$.getJSON( "session", function( data ) {
		console.log(data);
		
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

function registrate() {
	
	
	var _nombre = $("#nombre").val();
	var _nickname = $("#nickname").val();
	var _apellidos = $("#apellidos").val();
	var _email = $("#email").val();
	var _password = $("#password").val();
	var _telefono = $("#telefono").val();
	
	//alert("transfiriendo: " + monto + " desde " + origen + " a " + destino);

	var user = {
		"nombre": _nombre,
		"password": _password,
		"nickname": _nickname,
		"apellidos": _apellidos,
		"email": _email,
		"telefono": _telefono
	};

	$.postJSON( "registro", user,function( data ) {
			
	
	});
	
	alert("*");
	

//	location.href="/index.html";
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







