import { HttpClientTestingModule } from '@angular/common/http/testing';
import { TestBed } from '@angular/core/testing';

import { AddclienteService } from './addcliente.service';

describe('AddclienteService', () => {
  let service: AddclienteService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule]
    });
    service = TestBed.inject(AddclienteService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
