package com.Restaurantes.Restaurantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restaurantes.Restaurantes.entity.Funcionario;
import com.Restaurantes.Restaurantes.entity.FuncionarioQuantidade;
import com.Restaurantes.Restaurantes.repositorio.FuncionarioRepositorio;

@RestController
@RequestMapping ("funcionario")
@CrossOrigin(origins={"http://localhost:4200", "http://localhost:9876"})
public class FuncionarioController {

	@Autowired
	private FuncionarioRepositorio funcionariorepositorio;
	
	@GetMapping("listar")
	public  List<Funcionario> listarfuncionario(){		
		return funcionariorepositorio.findAll();
	}
	
	@PostMapping("incluir")
    public void cadastrar( @RequestBody Funcionario novoFuncionario) {
		this.funcionariorepositorio.save(novoFuncionario);
		this.funcionariorepositorio.flush();
	}
	
	@GetMapping ("qtd_funcionario")
	public FuncionarioQuantidade quantidadefuncionario () {
		
		FuncionarioQuantidade novofuncionario = new FuncionarioQuantidade();
		novofuncionario.setQuantidade(this.funcionariorepositorio.count());
		
		return novofuncionario;
    }    
}
