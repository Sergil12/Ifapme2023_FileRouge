import {Time} from "@angular/common";
import {Timestamp} from "rxjs";

export interface TimeSheetDto{
  timesheet_id:string ;
  start_date:Date;
  start_hours:number;
  end_hours:number;
  comment:string;
 timesheet_type:string;
}
