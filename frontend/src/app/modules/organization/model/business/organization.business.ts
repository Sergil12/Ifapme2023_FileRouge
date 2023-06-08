import {isEmpty} from "@shared/model";

export interface Organization extends isEmpty{
  id:string;
  name:string;
  description:string;
}
