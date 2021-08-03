import { TestBed } from '@angular/core/testing';

import { QuantidadePratosPorPedidoService } from './quantidade-pratos-por-pedido.service';

describe('QuantidadePratosPorPedidoService', () => {
  let service: QuantidadePratosPorPedidoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(QuantidadePratosPorPedidoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
