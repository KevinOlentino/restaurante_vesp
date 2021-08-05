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

  constructor(private http:HttpClient) { }
  incluir(pedido:Pedido): Observable<any>{
    return this.http.post<Pedido>("http://localhost:8080/pedido/incluir",pedido);
  }

  listar(): Observable<any>{

    return this.http.get<Pedido[]>("http://localhost:8080/pedido/listar");

  }

}
