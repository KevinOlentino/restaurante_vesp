import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddpagamentoComponent } from './addpagamento.component';

describe('AddpagamentoComponent', () => {
  let component: AddpagamentoComponent;
  let fixture: ComponentFixture<AddpagamentoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddpagamentoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddpagamentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
