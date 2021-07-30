import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Produto } from './listar-produto/Produto';

@Injectable({
  providedIn: 'root'
})
export class ProdutoServicoService {

  constructor(private produto:HttpClient) { }

  listarproduto(): Observable<any>{
    return this.produto.get<Produto[]>("http://localhost:8080/produto/listar")
  }
  contarProduto(): Observable<any>{
    return this.produto.get<Produto[]>("http://localhost:8080/produto/qtd_produto")
  }


   // testar 1
   ccontarProduto(){
    return 41;
  }

  // testar 1 
  descontoProduto( produto: Produto){

    let desconto: Number;
    desconto = produto.preco  * 0.9;
    return desconto;

  }

  // testar 1
  faltaProduto( produto: Produto){

    return  (produto.quantidade < 5);

  }


}