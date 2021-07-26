import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Prato } from '../listar-pratos-incluir-pedidos/Prato';
import { PratoService } from '../prato.service';

@Component({
  selector: 'app-incluir-pratos',
  templateUrl: './incluir-pratos.component.html',
  styleUrls: ['./incluir-pratos.component.css']
})
export class IncluirPratosComponent implements OnInit {

  prato: Prato={codprato: 0, descricao: "", preco: 0}
  constructor(private servicoincluirpratos:PratoService) { }

  ngOnInit(): void {
  }

  incluir(frm:NgForm){
    this.servicoincluirpratos.incluir(this.prato).subscribe(
      dados=>alert("Dados gravados com sucesso!!"),
      error=> alert("erro ao gravar dados")
    )
  }

}
