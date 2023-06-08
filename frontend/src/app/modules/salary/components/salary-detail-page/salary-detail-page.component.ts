import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Params, Router} from "@angular/router";
import {SalaryService} from "../../service/salary.service";
import {map, switchMap, tap} from "rxjs/operators";
import {isNil} from "lodash";
import {SalaryHelper} from "../../helper/salary.helper";
import {BehaviorSubject, of} from "rxjs";
import {Salary} from "../../model/business/salary.business";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {SalaryUpdatePayload} from "../../model/payload/salary-update.payload";

@Component({
  selector: 'app-salary-detail-page',
  templateUrl: './salary-detail-page.component.html',
  styleUrls: ['./salary-detail-page.component.scss']
})
export class SalaryDetailPageComponent implements OnInit {

  formGroup!: FormGroup;
  salary$: BehaviorSubject<Salary> = new BehaviorSubject<Salary>(SalaryHelper.getEmpty());
  formMode: string = 'CREATE';
  error: string = '';

  constructor(public activatedRouter: ActivatedRoute, public router: Router, public salaryService: SalaryService) {
  }

  ngOnInit(): void {
    this.activatedRouter.params.pipe(
      switchMap((params: Params) => {

        // tester si param['id'] != 0 pourquoi? parce que pour créer un element je vais appeller cette page en
        // donnant comme id 0
        if (!isNil(params['id']) && params['id'] != '0') {
          return this.salaryService.detail(params['id']);
        }
        return of(SalaryHelper.getEmpty());
      }),
      // ici on va créer le formulaire
      tap((salary: Salary) => {
        // on définit dans quelle mode on est : creation ou modification
        this.formMode = (salary.isEmpty) ? 'CREATE' : 'UPDATE';
        this.salary$.next(salary);
        // on remplit le formgroup
        this.formGroup = new FormGroup({
          title: new FormControl(salary.title, [Validators.required]),
          comment: new FormControl(salary.comment, [Validators.required]),
          amount: new FormControl(salary.amount, [Validators.required]),
        })
      })
    ).subscribe();
  }

  submit(): void {
    // toujours regarder si le formulaire est valide ou non?
    if (this.formGroup.invalid) {
      this.error = 'Il y a une erreur dans le formulaire.'
    } else {
      if (this.formMode === 'CREATE') {
        // on cree
        this.salaryService.create(this.formGroup.value)
          .subscribe((result: Salary) => {
            if (result.isEmpty) {
              this.error = 'Erreur lors de la création.'
            }
            this.router.navigate(['/home']).then();
          })
      } else {
        const payload: SalaryUpdatePayload = this.formGroup.value;
        payload.salary_id = this.salary$.getValue().id;
        this.salaryService.update(payload)
          .subscribe((result: Salary) => {
            if (result.isEmpty) {
              this.error = 'Erreur lors de la modification.'
            }
            this.router.navigate(['/home']).then();
          })
      }
    }
  }

}
