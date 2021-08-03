import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarPratoPorProdutoComponent } from './listar-prato-por-produto.component';

describe('ListarPratoPorProdutoComponent', () => {
  let component: ListarPratoPorProdutoComponent;
  let fixture: ComponentFixture<ListarPratoPorProdutoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarPratoPorProdutoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarPratoPorProdutoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
