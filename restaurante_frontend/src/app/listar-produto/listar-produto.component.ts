import { Component, OnInit } from '@angular/core';
import { ProdutoQuantidade } from '../entities/ProdutoQuantidade';
import { PratoService } from '../prato.service';
import { ProdutoQuantidadeService } from '../produto-quantidade.service';
import { ProdutoServicoService } from '../produto-servico.service';
import { Produto } from './Produto';

@Component({
  selector: 'app-listar-produto',
  templateUrl: './listar-produto.component.html',
  styleUrls: ['./listar-produto.component.css']
})
export class ListarProdutoComponent implements OnInit {

  produtos: Produto[] = [];
  produtoQuantidade: ProdutoQuantidade = { quantidade: 0};

  constructor(private servicoproduto:ProdutoServicoService,
              private servicoProdutoQuantidade: ProdutoQuantidadeService) { }

  ngOnInit(): void {
    this.servicoproduto.listarproduto().subscribe(
      dados => this.produtos = dados,
      error => console.log("Erro ao buscar dados")
    )

    this.servicoProdutoQuantidade.quantidade().subscribe(
      dados => this.produtoQuantidade = dados,
      error => console.log("Erro ao recuperar produto quantidade")
    )
  }
}
