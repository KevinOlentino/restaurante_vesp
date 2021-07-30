import { HttpClientTestingModule } from '@angular/common/http/testing';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { IncluirPratosComponent } from './incluir-pratos.component';

describe('IncluirPratosComponent', () => {
  let component: IncluirPratosComponent;
  let fixture: ComponentFixture<IncluirPratosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ IncluirPratosComponent],
      imports: [HttpClientTestingModule, FormsModule]
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
