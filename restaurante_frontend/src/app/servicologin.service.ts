import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Autorizar } from './autenticacao/Autorizar';
import { Login } from './autenticacao/Login';

@Injectable({
  providedIn: 'root'
})
export class ServicologinService {

  
  constructor( private servico:HttpClient) { }

   fazerLogin(login: Login): Observable<any>{

    return this.servico.post<Autorizar>("http://localhost:8080/login/logar", login);
    
    
    }
    
}
