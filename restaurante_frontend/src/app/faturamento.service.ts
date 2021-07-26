import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Faturamento } from './listar-faturamento/Faturamento';

@Injectable({
  providedIn: 'root'
})
export class FaturamentoService {

  constructor(private _cliente:HttpClient) { }
  listarfaturamento(): Observable<any>{
    return this._cliente.get<Faturamento[]>("http://localhost:8080/faturamento/listar")
  }
}
