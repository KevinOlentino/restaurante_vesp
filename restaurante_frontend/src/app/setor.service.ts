import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Setor } from './entities/Setor';

@Injectable({
  providedIn: 'root'
})
export class SetorService {

  constructor(private http:HttpClient) { }

  incluir(setor:Setor): Observable<any>{
    return this.http.post<Setor>("http://localhost:8080/setor/incluir", setor);
  }
  listar(): Observable<any>{
    return this.http.get<Setor[]>("http://localhost:8080/setor/listar");
  }
}
