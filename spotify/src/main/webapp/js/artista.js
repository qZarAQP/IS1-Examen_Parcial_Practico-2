
function mostrarAlbum() {
	alert("mol");
	$("#menuPrincipal").hide();
	$("#mostrarAlbum").show();
}

function mostrarCancion() {
	$("#menuPrincipal").hide();
	$("#mostrarCancion").show();
}

function mostrarArtista() {
	$("#menuPrincipal").hide();
	$("#mostrarArtista").show();
}

function mostrarMenuPrincipal() {
	$("#menuPrincipal").show();
	$("#listadoCuentas").hide();	
}

function modificarCuenta(numero) {
	$("#modificarCuenta").show();
	$("#listadoCuentas").hide();
	
	$.getJSON( "usuario?id=" + numero, function( data ) {
		$("#modificarCuenta #numero").val(data.numero);
		$("#modificarCuenta #saldo").val(data.saldo);
	});
}

function listarCuentas() {
	$.getJSON( "cuentas", function( data ) {
		$("#usuarios").html("");
		for (var i=0; i<data.length; i++) {
			var numero = "" + data[i].id;
			$("#usuarios").append("<li>Numero: " + numero + ", Saldo: " + data[i].saldo + "</li>");
			var button = document.createElement("BUTTON");
			button.innerText = "Modificar";
			$(button).on("click", function() {
				modificarCuenta(numero);
			});
			$("#cuentas li:last").append(button);
		}
	});	
}



listarCuentas();

