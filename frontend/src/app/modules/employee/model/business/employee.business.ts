import {isEmpty} from "@shared/model";

export interface Employee extends isEmpty{
  id:string;
  lastname:string;
  firstname:string;
  active:boolean;
  deleted_by:string;
  address:string;
  gender:string;
  birthday:Date;
  ssin:string;
  status:string;
  deleted:boolean ;
}
