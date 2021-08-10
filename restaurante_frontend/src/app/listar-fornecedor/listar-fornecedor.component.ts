import { Component, OnInit } from '@angular/core';
import { Fornecedor } from '../entities/Fornecedor';
import { FornecedorService } from '../fornecedor.service';

@Component({
  selector: 'app-listar-fornecedor',
  templateUrl: './listar-fornecedor.component.html',
  styleUrls: ['./listar-fornecedor.component.css']
})
export class ListarFornecedorComponent implements OnInit {

  fornecedor : Fornecedor[] = [];
  constructor(private servico: FornecedorService) { }

  ngOnInit(): void {
    
    this.servico.listar().subscribe(
      dados => { this.fornecedor = dados},
      error => alert("Erro ao consultar dados!!")
    )
  }
}
