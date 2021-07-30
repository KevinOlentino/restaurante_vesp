import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Autorizar } from './autenticacao/Autorizar';
import { Login } from './autenticacao/Login';

@Injectable({
  providedIn: 'root'
})
export class ServicologinService {

  
  constructor(private servico:HttpClient) { }

   fazerLogin(login: Login): Observable<any>{

      return this.servico.post<Autorizar>("http://localhost:8080/login/logar", login);
    
   }

   somar( a: number, b: number){
    return a+b;
  }


  // testar 2
  testarLogin(usuario: string, senha: string){

    if (usuario === "fulano" && senha === "65432")
       return true;
    else
      return false;
  }

  // testar 2
  usuarioAutorizado(){
    return true;
  }

  // testar 2
  usuarioNaoAutorizado( nome: string ){
    if (nome ==="beltrano"){
      return false;
    } else {
      return true;
    }
  }
    
}
