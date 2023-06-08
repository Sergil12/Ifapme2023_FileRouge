import {Component, OnInit} from '@angular/core';
import {SalaryService} from "../../service/salary.service";
import {BehaviorSubject} from "rxjs";
import {Salary} from "../../model/business/salary.business";
import {tap} from "rxjs/operators";
import {Router} from "@angular/router";

@Component({
  selector: 'app-salary-home-page',
  templateUrl: './salary-home-page.component.html',
  styleUrls: ['./salary-home-page.component.scss']
})
export class SalaryHomePageComponent implements OnInit {
  list$ = new BehaviorSubject<Salary[]>([])

  constructor(public router:Router,public salaryService: SalaryService) {
  }

  ngOnInit(): void {
    this.refresh();
  }

  refresh(): void {
    this.salaryService.list()
      .pipe(
        tap((list: Salary[]) => this.list$.next(list))
      )
      .subscribe();
  }

  delete(id:string){
    this.salaryService.remove(id)
      .pipe(
        tap((list: Salary[]) => this.list$.next(list))
      )
      .subscribe();
  }

  create():void {
    this.router.navigate(['/home/detail/0']).then();
  }

  detail(id:string):void {
    this.router.navigate(['/home/detail/'+id]).then();
  }
}
