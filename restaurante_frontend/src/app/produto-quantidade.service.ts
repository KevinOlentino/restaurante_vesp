import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ProdutoQuantidade } from './entities/ProdutoQuantidade';

@Injectable({
  providedIn: 'root'
})
export class ProdutoQuantidadeService {

  constructor( private http: HttpClient) { }


  quantidade(): Observable<any>{

    return this.http.get<ProdutoQuantidade>("http://localhost:8080/produto/qtd_produto");

  }

}
