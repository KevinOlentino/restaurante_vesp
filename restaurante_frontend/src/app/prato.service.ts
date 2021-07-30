import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Prato } from './listar-pratos-incluir-pedidos/Prato';

@Injectable({
  providedIn: 'root'
})
export class PratoService {

  constructor(private _cliente:HttpClient) { }

  listarPratos(): Observable<any>{
    return this._cliente.get<Prato[]>("http://localhost:8080/prato/listar")
  }

  incluir(prato:Prato): Observable<any>{
    return this._cliente.post<Prato>("http://localhost:8080/prato/incluir",prato);
  }

  // testar 3
  descontoPrato( prato: Prato){
    let desconto: number  = prato.preco * 0.8;
    return desconto;
  }

// testar 3
  contarPrato(){
    return 35;
  }

// testar 3
   pratoGratis( prato: Prato){

    if (prato.descricao === "Peixe")
    {
        prato.preco = 0;
    }
    return prato;
  }

  
}
