import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { PedidoService } from '../pedido.service';
import { PratoService } from '../prato.service';
import { Pedido } from './Pedido';
import { Prato } from './Prato';

@Component({
  selector: 'app-listar-pratos-incluir-pedidos',
  templateUrl: './listar-pratos-incluir-pedidos.component.html',
  styleUrls: ['./listar-pratos-incluir-pedidos.component.css']
})
export class ListarPratosIncluirPedidosComponent implements OnInit {

  pratos: Prato[]=[];
  pedido: Pedido={codigopedido: 0, codigoprato: 0, codigocliente: 0, quantidade: 0, preco:0, pronto:false}
  constructor(private servicoprato:PratoService, private servicopedido:PedidoService) { }

  ngOnInit(): void {
    this.servicoprato.listarPratos().subscribe(
      dados => {this.pratos = dados, console.log(dados)},
      error => console.log("Erro ao buscar dados")
    )
  }

  incluir(frm:NgForm){
    this.servicopedido.incluir(this.pedido).subscribe(
      dados=>alert("Dados gravados com sucesso!!"),
      error=> alert("erro ao gravar dados")
    )
  }
}
