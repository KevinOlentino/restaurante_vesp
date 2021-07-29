import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PratoPronto } from './entities/PratoPronto';


@Injectable({
  providedIn: 'root'
})
export class ListarpratoprontoService {

  constructor( private _http:HttpClient) { }

  listarpratopronto(): Observable<any>{

    return this._http.get<PratoPronto[]>("http://localhost:8080/clientepratopronto/listar");
  }
}
