import { Component, OnInit } from '@angular/core';
import { PratoService } from '../prato.service';
import { ProdutoServicoService } from '../produto-servico.service';
import { Produto } from './Produto';

@Component({
  selector: 'app-listar-produto',
  templateUrl: './listar-produto.component.html',
  styleUrls: ['./listar-produto.component.css']
})
export class ListarProdutoComponent implements OnInit {

  produtos: Produto[] = [];
  constructor(private servicoproduto:ProdutoServicoService,) { }

  ngOnInit(): void {
    this.servicoproduto.listarproduto().subscribe(
      dados => this.produtos = dados,
      error => console.log("Erro ao buscar dados")
    )
  }
}
