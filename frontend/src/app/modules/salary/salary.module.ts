import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SalaryRoutingModule } from './salary-routing.module';
import { SalaryHomePageComponent } from './components/salary-home-page/salary-home-page.component';
import { SalaryDetailPageComponent } from './components/salary-detail-page/salary-detail-page.component';
import {ReactiveFormsModule} from "@angular/forms";


@NgModule({
  declarations: [
    SalaryHomePageComponent,
    SalaryDetailPageComponent
  ],
  imports: [
    CommonModule,
    SalaryRoutingModule,
    ReactiveFormsModule
  ]
})
export class SalaryModule { }
