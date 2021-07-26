import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarpratoprontoComponent } from './listarpratopronto.component';

describe('ListarpratoprontoComponent', () => {
  let component: ListarpratoprontoComponent;
  let fixture: ComponentFixture<ListarpratoprontoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarpratoprontoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarpratoprontoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
