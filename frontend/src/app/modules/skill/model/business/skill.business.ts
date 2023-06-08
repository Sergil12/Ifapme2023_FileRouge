import {isEmpty} from "@shared/model";

export interface Skill extends isEmpty{
  id:string;
  title:string;
  description:string;
}
