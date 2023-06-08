import {PayloadInterface} from "@shared/model";

export interface SalaryCreatePayload extends PayloadInterface{
  create_date:number;
  title:string
  comment:string
  amount:number;
}
