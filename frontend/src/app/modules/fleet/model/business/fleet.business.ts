import {isEmpty} from "@shared/model";

export interface Fleet extends isEmpty{
  id:string;
  title:string;
  description:string;
  type:string;
  cost:number;
}
