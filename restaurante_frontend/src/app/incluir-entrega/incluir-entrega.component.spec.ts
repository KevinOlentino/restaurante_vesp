import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IncluirEntregaComponent } from './incluir-entrega.component';

describe('IncluirEntregaComponent', () => {
  let component: IncluirEntregaComponent;
  let fixture: ComponentFixture<IncluirEntregaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ IncluirEntregaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(IncluirEntregaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
