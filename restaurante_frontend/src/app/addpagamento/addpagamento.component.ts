import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Pagamento } from 'src/Pagamento';
import { AddpagamentoService } from '../addpagamento.service';

@Component({
  selector: 'app-addpagamento',
  templateUrl: './addpagamento.component.html',
  styleUrls: ['./addpagamento.component.css']
})
export class AddpagamentoComponent implements OnInit {

  pagamento : Pagamento = {codigopagamento: 0, codigopedido: 0 , codigocliente: 0 , valorpago: 0 }

  constructor( private servico: AddpagamentoService) { }

  ngOnInit(): void {
  }

  incluirPagamento( frm: NgForm){
    this.servico.incluir(this.pagamento).subscribe(
      dados => alert("Pagamento cadastrado com sucesso"),
      error => alert("Erro ao cadastrar pagamento")
    )
  }

}
