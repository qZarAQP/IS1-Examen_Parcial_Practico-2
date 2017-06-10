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
	
	alert("transfiriendo: " + monto + " desde " + origen + " a " + destino);


	$.post( "transferir", transfer ).done(function( data ) {
		listarCuentas();
		alert("coaj");
	});

}

listarCuentas();