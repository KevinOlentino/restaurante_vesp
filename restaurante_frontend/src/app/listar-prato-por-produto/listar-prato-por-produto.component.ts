import { Component, OnInit } from '@angular/core';
import { ViewPratoPorProduto } from '../entities/ViewPratoPorProduto';
import { PratoPorProdutoService } from '../prato-por-produto.service';


@Component({
  selector: 'app-listar-prato-por-produto',
  templateUrl: './listar-prato-por-produto.component.html',
  styleUrls: ['./listar-prato-por-produto.component.css']
 
})
export class ListarPratoPorProdutoComponent implements OnInit {

  pratoPorProduto: ViewPratoPorProduto[] = [];

  constructor(private servico: PratoPorProdutoService) { }

  ngOnInit(): void {
    this.servico.listarPratoPorProduto().subscribe( 

      dados => this.pratoPorProduto = dados,
      error => console.log("Erro ao recuperar dados")
    )
  }

}
