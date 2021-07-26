import { Component, OnInit } from '@angular/core';
import { FaturamentoService } from '../faturamento.service';
import { Faturamento } from './Faturamento';

@Component({
  selector: 'app-listar-faturamento',
  templateUrl: './listar-faturamento.component.html',
  styleUrls: ['./listar-faturamento.component.css']
})
export class ListarFaturamentoComponent implements OnInit {

  faturamentos: Faturamento[]=[];
  constructor(private servicofaturamento:FaturamentoService,) { }

  ngOnInit(): void {
    this.servicofaturamento.listarfaturamento().subscribe(
      dados => {this.faturamentos = dados, console.log(dados)},
      error => console.log("Erro ao buscar dados")
    )
  }

}
