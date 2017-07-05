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



function crear_playlist() {
	
	var _nombre = $("#nombre").val();
	
	var playlist = {
		"nombre": _nombre
	};
	$.postJSON( "crearPlayList", playlist,function( data ) {
		alert("Se creo tu lista")
		
	
	});
	
}


function listarPlaylist() {

	
	$.getJSON( "playlists", function( data ) {
		//nombre en el html
		$("#playlist").html("");
		for (var i=0; i<data.length; i++) {
			  $("#playlist").append("<li>Playlists: " + data[i].nombre + "</li>");		
		}
	});	
	
}


