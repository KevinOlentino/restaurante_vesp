import { TestBed } from '@angular/core/testing';

import { ProdutoQuantidadeService } from './produto-quantidade.service';

describe('ProdutoQuantidadeService', () => {
  let service: ProdutoQuantidadeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ProdutoQuantidadeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
