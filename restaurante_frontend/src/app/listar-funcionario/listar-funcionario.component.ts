import { Component, OnInit } from '@angular/core';
import { Funcionario } from '../entities/Funcionario';
import { FuncionarioService } from '../funcionario.service';

@Component({
  selector: 'app-listar-funcionario',
  templateUrl: './listar-funcionario.component.html',
  styleUrls: ['./listar-funcionario.component.css']
})
export class ListarFuncionarioComponent implements OnInit {

  funcionario : Funcionario[] = [];
  constructor(private servico: FuncionarioService) { }

  ngOnInit(): void {

    this.servico.listarfuncionario().subscribe(
      dados => { this.funcionario = dados},
      error => alert("Erro ao consultar dados!!")
    )
  }
}
