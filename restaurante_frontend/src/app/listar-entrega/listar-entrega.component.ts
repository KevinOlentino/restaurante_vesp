import { Component, OnInit } from '@angular/core';
import { Entrega } from '../entities/Entrega';
import { EntregaService } from '../entrega.service';

@Component({
  selector: 'app-listar-entrega',
  templateUrl: './listar-entrega.component.html',
  styleUrls: ['./listar-entrega.component.css']
})
export class ListarEntregaComponent implements OnInit {

  entregas: Entrega[]=[];
  constructor(private servicoentrega:EntregaService) { }

  ngOnInit(): void {
    this.servicoentrega.listar().subscribe(
      dados => {this.entregas = dados, console.log(dados)},
      error => alert("Erro ao carregar dados")
    )
  }

}
