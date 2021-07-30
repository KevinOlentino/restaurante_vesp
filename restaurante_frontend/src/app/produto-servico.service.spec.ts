import { HttpClientTestingModule } from '@angular/common/http/testing';
import { TestBed } from '@angular/core/testing';

import { ProdutoServicoService } from './produto-servico.service';

describe('ProdutoServicoService', () => {
  let service: ProdutoServicoService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule] //add Bruno
    });
    service = TestBed.inject(ProdutoServicoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
