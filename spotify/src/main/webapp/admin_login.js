/*function listarCuentas() {
	$.getJSON( "cuentas", function( data ) {
		$("#cuentas").html("");
		for (var i=0; i<data.length; i++) {
			  $("#cuentas").append("<li>Numero: " + data[i].numero + ", Saldo: " + data[i].saldo + "</li>");		
		}
	});	
}*/
//sera el admin



function login() {
	
	alert("mando");
	var usuario = $("#usuario").val();
	var password = $("#password").val();
//	alert("mando");	
	//alert("transfiriendo: " + monto + " desde " + origen + " a " + destino);

	var user = {
		"usuario": usuario,
		"password": password
	};
	
	//alert("transfiriendo: " + monto + " desde " + origen + " a " + destino);


	$.post( "login", user ).done(function( data ) {
	//	listarCuentas();
		alert("mando en");
	});

}

/*

data = "";
login = function(){
	 
		$.ajax({
			url:'login',
			type:'POST',
			data:{usuario:$("#usuario").val(),password:$('#password').val()},
			success: function(response){
					alert(response.message);
						
			}				
		});			
}*/

//listarCuentas();
