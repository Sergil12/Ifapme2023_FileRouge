import {PayloadInterface} from "@shared/model";

export interface SalaryUpdatePayload extends PayloadInterface{
  salary_id:string;
  create_date:number;
  title:string
  comment:string
  amount:number;
}
