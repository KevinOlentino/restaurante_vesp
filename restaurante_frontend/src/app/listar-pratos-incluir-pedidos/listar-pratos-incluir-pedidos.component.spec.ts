import { HttpClientTestingModule } from '@angular/common/http/testing';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FormsModule } from '@angular/forms';

import { ListarPratosIncluirPedidosComponent } from './listar-pratos-incluir-pedidos.component';

describe('ListarPratosIncluirPedidosComponent', () => {
  let component: ListarPratosIncluirPedidosComponent;
  let fixture: ComponentFixture<ListarPratosIncluirPedidosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HttpClientTestingModule, FormsModule],
      declarations: [ ListarPratosIncluirPedidosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarPratosIncluirPedidosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
