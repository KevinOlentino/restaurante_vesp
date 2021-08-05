import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Funcionario } from '../entities/Funcionario';
import { FuncionarioService } from '../funcionario.service';

@Component({
  selector: 'app-incluir-funcionario',
  templateUrl: './incluir-funcionario.component.html',
  styleUrls: ['./incluir-funcionario.component.css']
})
export class IncluirFuncionarioComponent implements OnInit {

  funcionario: Funcionario={codigo: 0, nome: "", salario: 0, codigosetor: 0}
  constructor(private servicoincluirfuncionario:FuncionarioService) { }

  ngOnInit(): void {
  }

  incluir(frm:NgForm){
    this.servicoincluirfuncionario.incluir(this.funcionario).subscribe(
      dados=>alert("Dados gravados com sucesso!!"),
      error=> alert("erro ao gravar dados")
    )
  }

}
