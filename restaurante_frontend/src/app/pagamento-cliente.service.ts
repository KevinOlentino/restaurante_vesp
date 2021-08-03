import { HttpClient } from '@angular/common/http';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ViewPagamentoCliente } from './entities/ViewPagamentoCliente';

@Injectable({
  providedIn: 'root'
})
export class PagamentoClienteService {

    constructor( private http: HttpClient) { }

    listarPagamentoCliente(): Observable<any>{

      return this.http.get<ViewPagamentoCliente[]>("http://localhost:8080/views/listapagamentocliente");

    }


}
