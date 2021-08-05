import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Cliente } from 'src/app/entities/Cliente';
import { Pagamento } from 'src/app/entities/Pagamento';
import { AddpagamentoService } from '../addpagamento.service';
import { ClienteService } from '../cliente.service';
import { Pedido } from '../listar-pratos-incluir-pedidos/Pedido';
import { PedidoService } from '../pedido.service';

@Component({
  selector: 'app-addpagamento',
  templateUrl: './addpagamento.component.html',
  styleUrls: ['./addpagamento.component.css']
})
export class AddpagamentoComponent implements OnInit {

  pagamento : Pagamento = {codigopagamento: 0, codigopedido: 0 , codigocliente: 0 , valorpago: 0 }
  clientes: Cliente[]=[];
  pedidos: Pedido[]=[];

  constructor(
    private servico: AddpagamentoService,
    private servicoCliente:ClienteService,
    private servicoPedido: PedidoService
    ) { }

  ngOnInit(): void {
    this.servicoCliente.listarClientes().subscribe(
      dados => {this.clientes = dados, console.log(dados)},
      error => console.log("Erro ao buscar dados")
    )

    this.servicoPedido.listar().subscribe(
      dados =>{this.pedidos = dados, console.log(dados)},
      error => console.log("Erroao buscar pedido")
    )

  }

  incluirPagamento( frm: NgForm){
    this.servico.incluir(this.pagamento).subscribe(
      dados => alert("Pagamento cadastrado com sucesso"),
      error => alert("Erro ao cadastrar pagamento")
    )
  }

}
