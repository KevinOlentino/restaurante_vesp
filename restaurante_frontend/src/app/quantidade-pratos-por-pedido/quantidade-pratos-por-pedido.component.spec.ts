import { ComponentFixture, TestBed } from '@angular/core/testing';

import { QuantidadePratosPorPedidoComponent } from './quantidade-pratos-por-pedido.component';

describe('QuantidadePratosPorPedidoComponent', () => {
  let component: QuantidadePratosPorPedidoComponent;
  let fixture: ComponentFixture<QuantidadePratosPorPedidoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ QuantidadePratosPorPedidoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(QuantidadePratosPorPedidoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
