import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { QuantidadePratosPorPedido } from './entities/QuantidadePratosPorPedido';

@Injectable({
  providedIn: 'root'
})
export class QuantidadePratosPorPedidoService {

  constructor(private _http:HttpClient) { }

  quantidadepratosporpedido(): Observable<any>{
    return this._http.get<QuantidadePratosPorPedido[]>("http://localhost:8080/views1/listaqntpratosporpedido");
  }
}
