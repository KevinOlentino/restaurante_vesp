import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Entrega } from './entities/Entrega';

@Injectable({
  providedIn: 'root'
})
export class EntregaService {

  constructor(private http:HttpClient) { }

  incluir(entrega:Entrega): Observable<any>{
    return this.http.post<Entrega>("http://localhost:8080/entrega/incluir", entrega);
  }
  listar(): Observable<any>{
    return this.http.get<Entrega[]>("http://localhost:8080/entrega/listar");
  }
}
  