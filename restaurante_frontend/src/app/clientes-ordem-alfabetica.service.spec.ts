import { HttpClient } from '@angular/common/http';
import { TestBed } from '@angular/core/testing';

import { ClientesOrdemAlfabeticaService } from './clientes-ordem-alfabetica.service';

describe('ClientesOrdemAlfabeticaService', () => {
  let service: ClientesOrdemAlfabeticaService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClient]
    });
    service = TestBed.inject(ClientesOrdemAlfabeticaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
