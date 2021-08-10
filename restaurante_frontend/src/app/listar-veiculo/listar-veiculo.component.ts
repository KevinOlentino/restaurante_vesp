import { Component, OnInit } from '@angular/core';
import { Veiculo } from '../entities/Veiculo';
import { VeiculoService } from '../veiculo.service';

@Component({
  selector: 'app-listar-veiculo',
  templateUrl: './listar-veiculo.component.html',
  styleUrls: ['./listar-veiculo.component.css']
})
export class ListarVeiculoComponent implements OnInit {

  veiculos: Veiculo[]=[];
  constructor(private servicoveiculo: VeiculoService) { }

  ngOnInit(): void {
    this.servicoveiculo.listar().subscribe(
      dados => {this.veiculos = dados},
      error => alert("Erro ao consultar dados")
    )
  }

}
