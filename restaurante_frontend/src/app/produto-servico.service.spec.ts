import { HttpClientTestingModule } from '@angular/common/http/testing';
import { TestBed } from '@angular/core/testing';
import { Produto } from './listar-produto/Produto';

import { ProdutoServicoService } from './produto-servico.service';

describe('ProdutoServicoService', () => {
  let service: ProdutoServicoService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule] //add Bruno
    });
    service = TestBed.inject(ProdutoServicoService);
  });


  it('ccontarProduto', () => {
    let retorno: Number;
    retorno = service.ccontarProduto();
    expect(retorno).toEqual(41);
  });

  it('descontoProduto', () => {
    let produto: Produto = {codigo: 0, nome: 'Bala de coco', preco: 100.00, quantidade : 3};
    let retorno : Number;
    retorno = service.descontoProduto(produto);
    expect(retorno).toEqual(90);
  });

  it('faltaProduto', () => {
    let produto: Produto = {codigo: 0, nome: 'Bala de limao', preco: 100.00, quantidade : 3};
    let retorno : boolean;
    retorno = service.faltaProduto(produto);
    expect(retorno).toBeTruthy;
  });

});
