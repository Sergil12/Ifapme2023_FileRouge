
import {TimeSheetDto} from "../model/dto/time-sheet.dto";
import {TimeSheet} from "../model/business/time-sheet.business";

export class TimesheetHelper{
  // convertir un dto vers un business
  public static fromDTO(dto:TimeSheetDto): TimeSheet {
    return{
      id:dto.timesheet_id,
      start_date:dto.start_date,
      start_hours:dto.start_hours,
      end_hours:dto.end_hours,
      comment:dto.comment,
      timesheet_type:dto.timesheet_type,
      isEmpty:false

    }
  }
//convertir un business vers un dto
  public static toDTO(business:TimeSheet): TimeSheetDto {
    return{
      timesheet_id:business.id,
      start_date:business.start_date,
      start_hours:business.start_hours,
      end_hours:business.end_hours,
      comment:business.comment,
      timesheet_type:business.timesheet_type

    }
  }
// retourne un business vide
  public static getEmpty(): TimeSheet {
    return{
      id:'',
      start_date:new Date(),
      start_hours:0,
      end_hours:0,
      comment:'',
      timesheet_type:'',
      isEmpty: true
    }
  }
}
