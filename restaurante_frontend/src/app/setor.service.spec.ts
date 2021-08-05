import { HttpClient } from '@angular/common/http';
import { TestBed } from '@angular/core/testing';

import { SetorService } from './setor.service';

describe('SetorService', () => {
  let service: SetorService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClient]
    });
    service = TestBed.inject(SetorService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
