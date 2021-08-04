import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ViewPratoPorProduto } from './entities/ViewPratoPorProduto';


@Injectable({
  providedIn: 'root'
})
export class PratoPorProdutoService {

  constructor( private http: HttpClient) { }

  listarPratoPorProduto(): Observable<any>{

    return this.http.get<ViewPratoPorProduto[]>("http://localhost:8080/views3/listarpratoporproduto");
                                                  
  }
}
