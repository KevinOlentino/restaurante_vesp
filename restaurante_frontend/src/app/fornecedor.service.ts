import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Fornecedor } from './entities/Fornecedor';

@Injectable({
  providedIn: 'root'
})
export class FornecedorService {

  HttpOptions = {
    Headers: new  HttpHeaders({
      'Content-Type': 'application/json'
    })
  }

  constructor(private http:HttpClient) { }

  incluir(fornecedor:Fornecedor): Observable<any>{
    return this.http.post<Fornecedor>("http://localhost:8080/fornecedor/incluir",fornecedor);
  }

  listar(): Observable<any>{
    return this.http.get<Fornecedor[]>("http://localhost:8080/fornecedor/listar");
  }
}
