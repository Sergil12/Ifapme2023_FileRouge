import {FleetDto} from "../model/dto/fleet.dto";
import {Fleet} from "../model/business/fleet.business";

export class FleetHelper {
  // convertir un dto vers un business
  public static fromDTO(dto: FleetDto): Fleet {
    return {
      id:dto.fleet_id,
      title:dto.title,
      description:dto.description,
      type:dto.type,
      cost:dto.cost,
      isEmpty: false
    }
  }

  //convertir un business vers un dto
  public static toDTO(business: Fleet): FleetDto {
    return {
      fleet_id:business.id,
      title:business.title,
      description:business.description,
      type:business.type,
      cost:business.cost
    }
  }
// retourne un business vide
  public static getEmpty():Fleet{
    return {
      id: '',
      title: '',
      description: '',
      type:'',
      cost:0,
      isEmpty:true

    }
  }
}
