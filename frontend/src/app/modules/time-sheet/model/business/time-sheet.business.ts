import {isEmpty} from "@shared/model";
import {Time} from "@angular/common";

export interface TimeSheet extends isEmpty{
  id:string ;
  start_date:Date;
  start_hours:number;
  end_hours:number;
  comment:string;
  timesheet_type:string;
}
