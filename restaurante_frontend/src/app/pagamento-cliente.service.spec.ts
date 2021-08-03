import { TestBed } from '@angular/core/testing';

import { PagamentoClienteService } from './pagamento-cliente.service';

describe('PagamentoClienteService', () => {
  let service: PagamentoClienteService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PagamentoClienteService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
