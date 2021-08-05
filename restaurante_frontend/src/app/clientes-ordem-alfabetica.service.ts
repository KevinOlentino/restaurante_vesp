import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ClientesOrdemAlfabetica } from './entities/ClientesOrdemAlfabetica';

@Injectable({
  providedIn: 'root'
})
export class ClientesOrdemAlfabeticaService {

  constructor(private http:HttpClient) { }

  listarclientesordem(): Observable<any>{

    return this.http.get<ClientesOrdemAlfabetica[]>("http://localhost:8080/views/listarclienteordemalfa");
  }
}
