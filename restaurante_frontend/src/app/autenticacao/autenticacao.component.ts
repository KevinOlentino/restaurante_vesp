import { createTokenForExternalReference } from '@angular/compiler/src/identifiers';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ServicologinService } from '../servicologin.service';
import { Autorizar } from './Autorizar';
import { Login } from './Login';
import { Router } from '@angular/router';

@Component({
  selector: 'app-autenticacao',
  templateUrl: './autenticacao.component.html',
  styleUrls: ['./autenticacao.component.css']
})
export class AutenticacaoComponent implements OnInit {


  login: Login = {codCliente:'', senha:''}
  autorizado: Autorizar = { autorizado: false }
  
  router: Router;
  
  constructor( private servico: ServicologinService, router: Router) { this.router = router; }
 
  ngOnInit(): void {


    
  }

  public autenticar(frm: NgForm){

    // executar o processo de login logar

    this.servico.fazerLogin(this.login).subscribe(

      dados => {this.autorizado = dados, console.log(this.autorizado.autorizado), this.navegar()},
      error => console.log("Erro ao autorizar")

    )

  }

  public navegar(){
    // se a senha estiver correta
    if (this.autorizado.autorizado){
      // redirecionar para o componente principal
       this.router.navigate(["principal"]);

    } else {
       alert('Acesso não autorizado');
    }

  }


}
