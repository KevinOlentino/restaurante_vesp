import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Funcionario } from 'src/app/entities/Funcionario';

@Injectable({
  providedIn: 'root'
})
export class FuncionarioService {

  constructor(private _cliente:HttpClient) { }
  listarfuncionario(): Observable<any>{
    return this._cliente.get<Funcionario[]>("http://localhost:8080/funcionario/listar")
  }

  incluir(funcionario:Funcionario): Observable<any>{
    return this._cliente.post<Funcionario>("http://localhost:8080/funcionario/incluir", funcionario);
  }
}
