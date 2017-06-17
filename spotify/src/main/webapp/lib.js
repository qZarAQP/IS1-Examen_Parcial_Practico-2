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

function listarCuentas() {
	$.getJSON( "cuentas", function( data ) {
		$("#cuentas").html("");
		for (var i=0; i<data.length; i++) {
			  $("#cuentas").append("<li>Numero: " + data[i].numero + ", Saldo: " + data[i].saldo + "</li>");		
		}
	});	
}

function transferir() {
	var origen = $("#origen").val();
	var destino = $("#destino").val();
	var monto = $("#monto").val();
	
	alert("transfiriendo: " + monto + " desde " + origen + " a " + destino);

	var transfer = {
		"monto": monto,
		"origen": origen,
		"destino": destino
	};
	
	//alert("transfiriendo: " + monto + " desde " + origen + " a " + destino);


	$.postJSON( "transferir", transfer, function( data ) {
		listarCuentas();
	
	});

}

listarCuentas();