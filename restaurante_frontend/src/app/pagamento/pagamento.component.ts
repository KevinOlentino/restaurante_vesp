import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Pagamento } from '../entities/Pagamento';
import { Pedido } from '../listar-pratos-incluir-pedidos/Pedido';
import { PagamentoService } from '../pagamento.service';

@Component({
  selector: 'app-pagamento',
  templateUrl: './pagamento.component.html',
  styleUrls: ['./pagamento.component.css']
})
export class PagamentoComponent implements OnInit {

  pagamento: Pagamento =  { codigopagamento: 0, codigopedido: 0, codigocliente:0, valorpago:0}

  constructor( private pagamentoService: PagamentoService) { }

  ngOnInit(): void {

  }


  excluir( frm: NgForm){

    console.log(this.pagamento.codigopagamento)
    this.pagamentoService.excluir(this.pagamento.codigopagamento).subscribe(
      dados => console.log(dados),
      error => console.log(error)
    )

  }

}
