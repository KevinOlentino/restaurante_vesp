import { Component, OnInit } from '@angular/core';
import { PratoPronto } from 'src/PratoPronto';
import { ListarpratoprontoService } from '../listarpratopronto.service';

@Component({
  selector: 'app-listarpratopronto',
  templateUrl: './listarpratopronto.component.html',
  styleUrls: ['./listarpratopronto.component.css']
})
export class ListarpratoprontoComponent implements OnInit {

  pratoPronto : PratoPronto[] = [];

  constructor( private servico: ListarpratoprontoService) { }

  ngOnInit(): void {

    this.servico.listarpratopronto().subscribe(

      dados => { this.pratoPronto = dados},
      error => alert("Erro ao consultar dados!!")
    )
  }

}
