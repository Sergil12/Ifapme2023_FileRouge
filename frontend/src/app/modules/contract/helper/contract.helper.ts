
import {Contract} from "../model/business/contract.business";
import {ContractDto} from "../model/dto/contract.dto";

export class ContractHelper{
  // convertir un dto vers un business
  public static fromDTO(dto:ContractDto): Contract {
    return{
      id:dto.contract_id,
      title:dto.title,
      description:dto.description,
      start_date:dto.start_date,
      end_date:dto.end_date,
      nb_hours_by_week:dto.nb_hours_by_week,
      isEmpty:false

    }
  }
//convertir un business vers un dto
  public static toDTO(business:Contract): ContractDto {
    return{
      title:business.title,
      contract_id:business.id,
      description:business.description,
      start_date:business.start_date,
      end_date:business.end_date,
      nb_hours_by_week:business.nb_hours_by_week

    }
  }
// retourne un business vide
  public static getEmpty(): Contract {
    return{
      id: "",
      title: '',
      description: '',
      start_date: new Date(),
      end_date: new Date(),
      nb_hours_by_week:0,
      isEmpty: true
    }
  }
}
