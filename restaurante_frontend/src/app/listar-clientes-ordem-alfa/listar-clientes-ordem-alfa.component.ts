import { Component, OnInit } from '@angular/core';
import { ClientesOrdemAlfabeticaService } from '../clientes-ordem-alfabetica.service';
import { ClientesOrdemAlfabetica } from '../entities/ClientesOrdemAlfabetica';

@Component({
  selector: 'app-listar-clientes-ordem-alfa',
  templateUrl: './listar-clientes-ordem-alfa.component.html',
  styleUrls: ['./listar-clientes-ordem-alfa.component.css']
})
export class ListarClientesOrdemAlfaComponent implements OnInit {

  listarclientes: ClientesOrdemAlfabetica[] = [];

  constructor(private servicoOrdem:ClientesOrdemAlfabeticaService) { }

  ngOnInit(): void {
    this.servicoOrdem.listarclientesordem().subscribe(
      dados => {this.listarclientes = dados, console.log(dados)},
      error => console.log("Erro ao buscar dados Cliente")
    )
  }

}
