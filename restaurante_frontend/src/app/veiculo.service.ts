import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Veiculo } from './entities/Veiculo';

@Injectable({
  providedIn: 'root'
})
export class VeiculoService {

  constructor(private http:HttpClient) { }

  incluir(veiculo:Veiculo): Observable<any>{
    return this.http.post<Veiculo>("http://localhost:8080/veiculo/incluir", veiculo);
  }
  listar(): Observable<any>{
    return this.http.get<Veiculo[]>("http://localhost:8080/veiculo/listar");
  }
}
