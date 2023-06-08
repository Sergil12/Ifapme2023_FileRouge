export interface TimeSheetCreatePayload{
  start_date:number;
  start_hours:number;
  end_hours:number;
  comment:string;
  timesheet_type:string;
}
