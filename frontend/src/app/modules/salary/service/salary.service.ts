import { Injectable } from '@angular/core';
import {ApiService} from "@shared/service";
import {Salary} from "../model/business/salary.business";
import {Observable} from "rxjs";
import {map, switchMap} from "rxjs/operators";
import {ApiResponse, ApiUriEnum} from "@shared/model";
import {SalaryDto} from "../model/dto/salary.dto";
import {SalaryHelper} from "../helper/salary.helper";
import {SalaryCreatePayload} from "../model/payload/salary-create.payload";
import {SalaryUpdatePayload} from "../model/payload/salary-update.payload";

@Injectable({
  providedIn: 'root'
})
export class SalaryService extends ApiService{

  list():Observable<Salary[]>{
    return this.get(ApiUriEnum.SALARY_LIST)
      .pipe(
        map((response:ApiResponse)=>
          (response.result)?
            (response.data! as SalaryDto[]).map((dto:SalaryDto)=> SalaryHelper.fromDTO(dto))
            :
            [])
      )
  }
  detail(id:string):Observable<Salary>{
    return this.get(ApiUriEnum.SALARY_DETAIL+id)
      .pipe(
        map((response:ApiResponse)=>
          (response.result)?
            SalaryHelper.fromDTO(response.data! as SalaryDto)
            :
            SalaryHelper.getEmpty())
      )
  }
  create(payload:SalaryCreatePayload):Observable<Salary>{
    return this.post(ApiUriEnum.SALARY_CREATE, payload)
      .pipe(
        map((response:ApiResponse)=>
          (response.result)?
            SalaryHelper.fromDTO(response.data! as SalaryDto)
            :
            SalaryHelper.getEmpty())
      )
  }
  update(payload:SalaryUpdatePayload):Observable<Salary>{
    return this.put(ApiUriEnum.SALARY_UPDATE, payload)
      .pipe(
        map((response:ApiResponse)=>
          (response.result)?
            SalaryHelper.fromDTO(response.data! as SalaryDto)
            :
            SalaryHelper.getEmpty())
      )
  }

  remove(id:string):Observable<Salary[]>{
    return this.delete(ApiUriEnum.SALARY_DELETE+ id)
      .pipe(switchMap(()=>this.list()))
  }

}
