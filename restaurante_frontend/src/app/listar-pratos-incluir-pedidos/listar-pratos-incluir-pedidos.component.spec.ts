import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarPratosIncluirPedidosComponent } from './listar-pratos-incluir-pedidos.component';

describe('ListarPratosIncluirPedidosComponent', () => {
  let component: ListarPratosIncluirPedidosComponent;
  let fixture: ComponentFixture<ListarPratosIncluirPedidosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
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
