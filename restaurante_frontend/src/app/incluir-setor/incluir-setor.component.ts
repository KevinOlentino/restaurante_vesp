import { Component, NgModule, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Setor } from '../entities/Setor';
import { SetorService } from '../setor.service';

@Component({
  selector: 'app-incluir-setor',
  templateUrl: './incluir-setor.component.html',
  styleUrls: ['./incluir-setor.component.css']
})
export class IncluirSetorComponent implements OnInit {

  setor: Setor={codigosetor:0, nome:""}

  constructor(private servicoincluirsetor:SetorService) { }

  ngOnInit(): void {
  }

  incluir(fmr:NgForm){
    this.servicoincluirsetor.incluir(this.setor).subscribe(
      dados => alert("Dados gravados com sucesso."),
      error => alert("Erro ao gravar dados.")
    )
  }

}
