import { HttpClientTestingModule } from '@angular/common/http/testing';
import { TestBed } from '@angular/core/testing';

import { FaturamentoService } from './faturamento.service';

describe('FaturamentoService', () => {
  let service: FaturamentoService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule] // Bruno
    });
    service = TestBed.inject(FaturamentoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
