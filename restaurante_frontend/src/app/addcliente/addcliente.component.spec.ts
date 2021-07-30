import { HttpClientTestingModule } from '@angular/common/http/testing';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FormsModule } from '@angular/forms';
import { AddclienteComponent } from './addcliente.component';

describe('AddclienteComponent', () => {
  let component: AddclienteComponent;
  let fixture: ComponentFixture<AddclienteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HttpClientTestingModule, FormsModule],
      declarations: [ AddclienteComponent ]

    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddclienteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('Deve ser criado', () => {
    expect(component).toBeTruthy();
  });
});
