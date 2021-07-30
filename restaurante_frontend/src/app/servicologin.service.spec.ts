import { HttpClient, HttpClientModule } from '@angular/common/http';
import { ComponentFixture, TestBed, tick } from '@angular/core/testing';
import { Autorizar } from './autenticacao/Autorizar';
import { Login } from './autenticacao/Login';
import { ServicologinService } from './servicologin.service';

describe('ServicologinService', () => {

  let fixture: ComponentFixture<ServicologinService>;
  let service: ServicologinService;
  let login: Login = {codCliente:'1', senha:'a'};
  let autorizado: Autorizar = {autorizado: false};

 
  beforeEach(() => { 

    TestBed.configureTestingModule({
      imports: [HttpClientModule],
      providers: [ServicologinService]
    });

    service = TestBed.inject(ServicologinService);
   
  });

  it('Deveria ser criado', () => {

    expect(service).toBeTruthy();
  });

});
