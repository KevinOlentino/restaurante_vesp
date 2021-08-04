import { TestBed } from '@angular/core/testing';

import { PratoPorProdutoService } from './prato-por-produto.service';

describe('PratoPorProdutoService', () => {
  let service: PratoPorProdutoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PratoPorProdutoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
