import { Component, OnInit } from '@angular/core';
import { ViewPagamentoCliente } from '../entities/ViewPagamentoCliente';
import { PagamentoClienteService } from '../pagamento-cliente.service';

@Component({
  selector: 'app-listar-pagamento-cliente',
  templateUrl: './listar-pagamento-cliente.component.html',
  styleUrls: ['./listar-pagamento-cliente.component.css']
})
export class ListarPagamentoClienteComponent implements OnInit {

  pagamentoClientes: ViewPagamentoCliente[] = [];

  constructor( private servico: PagamentoClienteService) { }

  ngOnInit(): void {

    this.servico.listarPagamentoCliente().subscribe( 

      dados => this.pagamentoClientes = dados,
      error => console.log("Erro ao recuperar dados")
    )

  }

}
