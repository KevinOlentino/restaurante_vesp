import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Cliente } from 'src/app/entities/Cliente';
import { ClienteService } from '../cliente.service';
import { Funcionario } from '../entities/Funcionario';
import { FuncionarioService } from '../funcionario.service';
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
  clientes: Cliente[]=[];
  funcionarios: Funcionario[]=[];
  pedido: Pedido={codigoPedido: 0, codigoPrato: 0, codigoCliente: 0,codigofuncionario:0, quantidade: 0, preco:0, pronto:false}
  constructor(
    private servicoprato:PratoService, 
    private servicopedido:PedidoService,
    private servicocliente: ClienteService,
    private servicofuncionario: FuncionarioService) { }

  ngOnInit(): void {
    this.servicoprato.listarPratos().subscribe(
      dados => {this.pratos = dados, console.log(dados)},
      error => console.log("Erro ao buscar dados")
    )

    this.servicocliente.listarClientes().subscribe(
      dados =>this.clientes = dados,
      error => console.log("Erro na busca do cliente")
    )
    this.servicofuncionario.listarfuncionario().subscribe(
      dados => this.funcionarios = dados,
      error => console.log("Erro ao ler funcionarios")
    )

  }

  incluir(frm:NgForm){
    this.servicopedido.incluir(this.pedido).subscribe(
      dados=>alert("Dados gravados com sucesso!!"),
      error=> alert("erro ao gravar dados")
    )
  }
}
