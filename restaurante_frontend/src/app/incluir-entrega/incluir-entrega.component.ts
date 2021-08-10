import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Entrega } from '../entities/Entrega';
import { EntregaService } from '../entrega.service';

@Component({
  selector: 'app-incluir-entrega',
  templateUrl: './incluir-entrega.component.html',
  styleUrls: ['./incluir-entrega.component.css']
})
export class IncluirEntregaComponent implements OnInit {

  entrega: Entrega={codigo:0,codigoCliente:0,endereco:""}
  constructor(private incluirentrega: EntregaService) { }

  ngOnInit(): void {
  }

  incluir(frm:NgForm){
    this.incluirentrega.incluir(this.entrega).subscribe(
      dados => alert("Dados gravados com sucesso!!!"),
      error => alert("Erro do gravar dados.")
    )
  }

}
