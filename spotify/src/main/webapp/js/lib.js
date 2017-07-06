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



function mostrarCuentas() {
	$("#menuPrincipal").hide();
	$("#listadoCuentas").show();
}

function mostrarMenuPrincipal() {
	$("#menuPrincipal").show();
	$("#listadoCuentas").hide();	
}

function modificarCuenta(numero) {
	$("#modificarCuenta").show();
	$("#listadoCuentas").hide();
	
	$.getJSON( "cuenta?numero=" + numero, function( data ) {
		$("#modificarCuenta #numero").val(data.numero);
		$("#modificarCuenta #saldo").val(data.saldo);
	});
}

function listarCuentas() {
	$.getJSON( "cuentas", function( data ) {
		$("#cuentas").html("");
		for (var i=0; i<data.length; i++) {
			var numero = "" + data[i].numero;
			$("#cuentas").append("<li>Numero: " + numero + ", Saldo: " + data[i].saldo + "</li>");
			var button = document.createElement("BUTTON");
			button.innerText = "Modificar";
			$(button).on("click", function() {
				modificarCuenta(numero);
			});
			$("#cuentas li:last").append(button);
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





