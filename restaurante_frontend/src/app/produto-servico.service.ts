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


}