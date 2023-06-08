import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SalaryHomePageComponent } from './salary-home-page.component';

describe('SalaryHomePageComponent', () => {
  let component: SalaryHomePageComponent;
  let fixture: ComponentFixture<SalaryHomePageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SalaryHomePageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SalaryHomePageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
