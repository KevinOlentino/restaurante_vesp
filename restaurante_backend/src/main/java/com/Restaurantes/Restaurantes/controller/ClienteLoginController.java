package com.Restaurantes.Restaurantes.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.entity.Cliente;
import com.Restaurantes.Restaurantes.entity.ClienteAutorizado;
import com.Restaurantes.Restaurantes.entity.ClienteLogin;
import com.Restaurantes.Restaurantes.repositorio.ClienteRepositorio;


@RestController
@RequestMapping("login")
@CrossOrigin(origins={"http://localhost:9876", "http://localhost:4200"})
public class ClienteLoginController {
	
	@Autowired
	private ClienteRepositorio clientes;

	@PostMapping("logar")
	public ClienteAutorizado logar(@RequestBody ClienteLogin autenticaCliente) {
	
	System.out.println(autenticaCliente.getCodCliente());
	System.out.println(autenticaCliente.getSenha());
	
		
	ClienteAutorizado autorizado = new ClienteAutorizado();
	autorizado.setAutorizado(true);
	
	Cliente c = clientes.findById(autenticaCliente.getCodCliente()).get();
	
	if (c.getSenha().equals(autenticaCliente.getSenha())) {
		autorizado.setAutorizado(true);
	} else {
		autorizado.setAutorizado(false);
	}
	
	return autorizado;
	}

}
