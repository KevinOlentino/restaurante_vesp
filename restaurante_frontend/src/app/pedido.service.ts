import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Pedido } from './listar-pratos-incluir-pedidos/Pedido';


@Injectable({
  providedIn: 'root'
})
export class PedidoService {

  HttpOptions = {
    Headers: new  HttpHeaders({
      'Content-Type': 'application/json'
    })
  }

  constructor(private _cliente:HttpClient) { }
  incluir(pedido:Pedido): Observable<any>{
    return this._cliente.post<Pedido>("http://localhost:8080/pedido/incluir",pedido);
  }
}
