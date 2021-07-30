import { HttpClientTestingModule } from '@angular/common/http/testing';
import { TestBed } from '@angular/core/testing';

import { PratoService } from './prato.service';

describe('PratoService', () => {
  let service: PratoService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports : [HttpClientTestingModule]
    });
    service = TestBed.inject(PratoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
