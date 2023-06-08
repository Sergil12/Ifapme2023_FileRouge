import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {SalaryHomePageComponent} from "./components/salary-home-page/salary-home-page.component";
import {SalaryDetailPageComponent} from "./components/salary-detail-page/salary-detail-page.component";

const routes: Routes = [
  {
    path: '', component: SalaryHomePageComponent
  },
  {
    path: 'detail/:id', component: SalaryDetailPageComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SalaryRoutingModule { }
