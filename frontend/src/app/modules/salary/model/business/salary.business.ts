import {isEmpty} from "@shared/model";

export interface Salary extends isEmpty{
  id:string;
  create_date:Date;
  title:string;
  comment:string;
  amount:number;
}
