import {isEmpty} from "@shared/model";

export interface Company extends isEmpty{
  company_id:string;
  name:string;
  description:string;
  address:string;
  is_managed:string;
  active: boolean;
  deleted: boolean;
  deleted_by:string;
}
