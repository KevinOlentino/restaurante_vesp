import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Fornecedor } from '../entities/Fornecedor';
import { FornecedorService } from '../fornecedor.service';

@Component({
  selector: 'app-incluir-fornecedor',
  templateUrl: './incluir-fornecedor.component.html',
  styleUrls: ['./incluir-fornecedor.component.css']
})
export class IncluirFornecedorComponent implements OnInit {

  fornecedor: Fornecedor={codigo: 0, nome: "", telefone: "", codigoproduto: 0}
  constructor(private servicoincluirfornecedor: FornecedorService) { }

  ngOnInit(): void {
  }

  incluir(frm:NgForm){
    this.servicoincluirfornecedor.incluir(this.fornecedor).subscribe(
      dados=>alert("Dados gravados com sucesso!!"),
      error=> alert("erro ao gravar dados")
    )
  }

}
