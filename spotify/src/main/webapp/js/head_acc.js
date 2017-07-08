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



function  mostrarCanciones() {

	$("#loginhead").hide();
	$("#Canciones").show();
	listarSong();
}


function listarSong() {
	$.getJSON( "songs", function( data ) {
		$("#songs").html("");
		for (var i=0; i<data.length; i++) {
			var nombre = "nakn" + data[i].nombre;
			$("#songs").append("<li> " + nombre+ "</li>");
			/*var button = document.createElement("BUTTON");
			button.innerText = "Modificar";
			$(button).on("click", function() {
				modificarCuenta(numero);
			});
			$("#cuentas li:last").append(button);*/
		}
	});	
}



function   mostrarAlbumes() {

	//$("#loginhead").hide();
	$("#Albumes").show();

}


function   mostrarArtistas() {

	//$("#loginhead").hide();
	$("#Artistas").show();

}


