import { HttpClientModule } from '@angular/common/http';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { TestBed } from '@angular/core/testing';
import { ServicologinService } from './servicologin.service';

describe('Teste de ServicologinService', () => {

  let service: ServicologinService;
 
  beforeEach(() => { 

    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule]
    });

    service = TestBed.inject(ServicologinService);
   
  });

  it('1 Teste - Deve ser criado', () => {
    expect(service).toBeTruthy();
  });


  it('2 - Segundo teste', () => {

   
    expect(1).toEqual(1);
  });

});
