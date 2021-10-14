package com.Restaurantes.Restaurantes.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.entity.Cliente;
import com.Restaurantes.Restaurantes.entity.ClienteAutorizado;
import com.Restaurantes.Restaurantes.entity.ClienteLogin;
import com.Restaurantes.Restaurantes.repositorio.ClienteRepositorio;
import org.springframework.security.authentication.AuthenticationManager;


@RestController
@RequestMapping("login")
@CrossOrigin(origins="*")
public class ClienteLoginController {
	
	@Autowired
	private ClienteRepositorio clientes;

	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("logar")
	public String logar(@RequestBody ClienteLogin autenticaCliente) throws Exception {
		try {

			Cliente c = clientes.findByNome(autenticaCliente.getUserName());

			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(autenticaCliente.getUserName(), autenticaCliente.getSenha())
			);

		}catch (Exception ex){
			throw new Exception("Username/Password Invalido");
		}
		return "Teste";
	}

}
