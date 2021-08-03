import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarPagamentoClienteComponent } from './listar-pagamento-cliente.component';

describe('ListarPagamentoClienteComponent', () => {
  let component: ListarPagamentoClienteComponent;
  let fixture: ComponentFixture<ListarPagamentoClienteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarPagamentoClienteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarPagamentoClienteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
