import {ContractDto} from "../../contract/model/dto/contract.dto";
import {Contract} from "../../contract/model/business/contract.business";
import {SalaryDto} from "../model/dto/salary.dto";
import {Salary} from "../model/business/salary.business";

export class SalaryHelper{
  // convertir un dto vers un business
  public static fromDTO(dto:SalaryDto): Salary {
    return{
      id:dto.salary_id,
      create_date:dto.create_date,
      title:dto.title,
      comment:dto.comment,
      amount:dto.amount,
      isEmpty:false

    }
  }
//convertir un business vers un dto
  public static toDTO(business:Salary): SalaryDto {
    return{
      salary_id:business.id,
      create_date:business.create_date,
      title:business.title,
      comment:business.comment,
      amount:business.amount

    }
  }
// retourne un business vide
  public static getEmpty(): Salary {
    return{
      id: "",
      create_date:new Date(),
      title:'',
      comment:'',
      amount:0,
      isEmpty: true
    }
  }
}
