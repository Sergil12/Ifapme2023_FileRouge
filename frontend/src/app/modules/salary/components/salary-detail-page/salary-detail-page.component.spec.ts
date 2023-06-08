import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SalaryDetailPageComponent } from './salary-detail-page.component';

describe('SalaryDetailPageComponent', () => {
  let component: SalaryDetailPageComponent;
  let fixture: ComponentFixture<SalaryDetailPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SalaryDetailPageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SalaryDetailPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
