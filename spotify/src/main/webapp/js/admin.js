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
	$("#artista_menu").show();
	header();
	
}

function header() {
	
	$.getJSON( "session_adm", function( data ) {
		//console.log(data);
		
		//$("#head").val(data.nickname);
		//alert("*"+data);
		document.getElementById('head').innerHTML = data.nickname;
		
		
	});	
}

function artista() {

	$("#loginhead").hide();
	$("#artista_menu").hide();
	$("#artista_v").show();

}


function album() {

	$("#loginhead").hide();
	$("#artista_menu").hide();

	$("#album_v").show();
	

}


function cancion() {

	$("#loginhead").hide();
	$("#artista_menu").hide();

	$("#cancion_v").show();

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



function registraCancion() {
	
	
	var cancion = $("#cancion").val();
	var artista = $("#artista").val();
	var album = $("#album").val();

	
	//alert("transfiriendo: " + monto + " desde " + origen + " a " + destino);

	var user = {
		"cancion": cancion,
		"artista": artista,
		"album": album
	};

	$.postJSON( "registraCancion", user,function( data ) {
			
	
	});

}



function registraAlbum() {
	
	
	var artista = $("#artista").val();
	var album = $("#album").val();

	
	//alert("transfiriendo: " + monto + " desde " + origen + " a " + destino);

	var user = {
		"artista": artista,
		"nombre": album
	};

	$.postJSON( "registraAlbum", user,function( data ) {
			
	
	});

}


function registraArtista() {
	
	
	var artista = $("#artista_v #artista").val();
	var descripcion = $("#descripcion").val();

	
	//alert("transfiriendo: " + monto + " desde " + origen + " a " + destino);

	var user = {
		"nickname": artista
		//"descripcion": descripcion
	};

	$.postJSON( "registraArtista", user,function( data ) {
			
	
	});

}







