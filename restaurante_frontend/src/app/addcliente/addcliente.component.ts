import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Cliente } from 'src/app/entities/Cliente';
import { AddclienteService } from '../addcliente.service';

@Component({
  selector: 'app-addcliente',
  templateUrl: './addcliente.component.html',
  styleUrls: ['./addcliente.component.css']
})
export class AddclienteComponent implements OnInit {

  cliente: Cliente = {codigocliente: 0, nome:'', email:'', senha:''}

  constructor( private servico: AddclienteService) { }

  ngOnInit(): void {
  }

  incluirCliente( frm: NgForm){
    this.servico.incluir(this.cliente).subscribe(
      dados => alert("Cliente cadastrado com sucesso"),
      error => alert("Erro ao cadastrar cliente")
    )
  }

}
