import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IncluirPratosComponent } from './incluir-pratos.component';

describe('IncluirPratosComponent', () => {
  let component: IncluirPratosComponent;
  let fixture: ComponentFixture<IncluirPratosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ IncluirPratosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(IncluirPratosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
