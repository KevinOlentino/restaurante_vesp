import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Pagamento } from './entities/Pagamento';

@Injectable({
  providedIn: 'root'
})
export class PagamentoService {

  constructor( private http: HttpClient) { }

  excluir (id: number): Observable<any>{
    return this.http.delete("http://localhost:8080/pagamento/excluir/"+id);
  }

}
