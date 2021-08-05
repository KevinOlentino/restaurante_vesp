import { Component, OnInit } from '@angular/core';
import { Setor } from '../entities/Setor';
import { SetorService } from '../setor.service';

@Component({
  selector: 'app-listar-setor',
  templateUrl: './listar-setor.component.html',
  styleUrls: ['./listar-setor.component.css']
})
export class ListarSetorComponent implements OnInit {

  setores: Setor[]=[];

  constructor(private servico: SetorService) { }

  ngOnInit(): void {
  
  this.servico.listar().subscribe(
    dados => {this.setores = dados},
    error => alert("Erro ao consultar dados")
  )
  }  
}
