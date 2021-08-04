import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarClientesOrdemAlfaComponent } from './listar-clientes-ordem-alfa.component';

describe('ListarClientesOrdemAlfaComponent', () => {
  let component: ListarClientesOrdemAlfaComponent;
  let fixture: ComponentFixture<ListarClientesOrdemAlfaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarClientesOrdemAlfaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarClientesOrdemAlfaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
