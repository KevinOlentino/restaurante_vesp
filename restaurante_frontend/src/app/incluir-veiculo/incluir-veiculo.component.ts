import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Veiculo } from '../entities/Veiculo';
import { VeiculoService } from '../veiculo.service';

@Component({
  selector: 'app-incluir-veiculo',
  templateUrl: './incluir-veiculo.component.html',
  styleUrls: ['./incluir-veiculo.component.css']
})
export class IncluirVeiculoComponent implements OnInit {

  veiculos: Veiculo={codigo:0, nome:"", placa:"", codigoFuncionario: 0}
  constructor(private servicoveiculo:VeiculoService) { }

  ngOnInit(): void {
   }

   incluir(fmr:NgForm){
    this.servicoveiculo.incluir(this.veiculos).subscribe(
      dados => alert("Dados gravados com sucesso."),
      error => alert("Erro ao gravar dados.")
    ) 
   } 

}
