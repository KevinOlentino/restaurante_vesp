import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Pagamento } from 'src/app/entities/Pagamento';

@Injectable({
  providedIn: 'root'
})
export class AddpagamentoService {

  constructor( private _http: HttpClient) { }

  incluir ( pagamento: Pagamento): Observable<Pagamento>{
    return this._http.post<Pagamento>("http://localhost:8080/pagamento/incluir", pagamento);
  }

}
