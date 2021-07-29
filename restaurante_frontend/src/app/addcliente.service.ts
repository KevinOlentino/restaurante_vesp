import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cliente } from 'src/app/entities/Cliente';

@Injectable({
  providedIn: 'root'
})
export class AddclienteService {

  constructor( private _http:HttpClient) { }

  incluir (cliente: Cliente): Observable<Cliente>{
    return this._http.post<Cliente>("http://localhost:8080/cliente/incluir", cliente);
  }
}
