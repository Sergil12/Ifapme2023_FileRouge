import {isEmpty} from "@shared/model";

export interface Document extends isEmpty{
  id:string;
  title:string;
  path:string;
  content:string;
  type:string;
  create_date:Date;
}
