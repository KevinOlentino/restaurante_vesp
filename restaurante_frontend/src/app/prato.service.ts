import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Prato } from './listar-pratos-incluir-pedidos/Prato';

@Injectable({
  providedIn: 'root'
})
export class PratoService {

  constructor(private _cliente:HttpClient) { }

  listarPratos(): Observable<any>{
    return this._cliente.get<Prato[]>("http://localhost:8080/prato/listar")
  }

  incluir(prato:Prato): Observable<any>{
    return this._cliente.post<Prato>("http://localhost:8080/prato/incluir",prato);
  }
}
