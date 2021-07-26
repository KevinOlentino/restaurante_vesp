import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarFaturamentoComponent } from './listar-faturamento.component';

describe('ListarFaturamentoComponent', () => {
  let component: ListarFaturamentoComponent;
  let fixture: ComponentFixture<ListarFaturamentoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarFaturamentoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarFaturamentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
