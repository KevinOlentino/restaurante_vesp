import { Component, OnInit } from '@angular/core';
import { QuantidadePratosPorPedido } from '../entities/QuantidadePratosPorPedido';
import { QuantidadePratosPorPedidoService } from '../quantidade-pratos-por-pedido.service';

@Component({
  selector: 'app-quantidade-pratos-por-pedido',
  templateUrl: './quantidade-pratos-por-pedido.component.html',
  styleUrls: ['./quantidade-pratos-por-pedido.component.css']
})
export class QuantidadePratosPorPedidoComponent implements OnInit {

  quantidadePratosPorPedido: QuantidadePratosPorPedido[] = [];
  constructor(private servico: QuantidadePratosPorPedidoService) { }

  ngOnInit(): void {
    this.servico.quantidadepratosporpedido().subscribe(
      dados => { this.quantidadePratosPorPedido = dados},
      error => alert("Erro ao consultar dados!!")
    )
  }

}
