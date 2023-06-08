import {FleetDto} from "../../fleet/model/dto/fleet.dto";
import {Fleet} from "../../fleet/model/business/fleet.business";
import {OrganizationDto} from "../model/dto/organization.dto";
import {Organization} from "../model/business/organization.business";

export class OrganizationHelperHelper {
  // convertir un dto vers un business
  public static fromDTO(dto: OrganizationDto): Organization {
    return {
      isEmpty: false,
      id:dto.organization_id,
      name:dto.name,
      description:dto.description
    }
  }

  //convertir un business vers un dto
  public static toDTO(business: Organization): OrganizationDto {
    return {
      organization_id: business.id,
      name:business.name,
      description:business.description
    }
  }
// retourne un business vide
  public static getEmpty():Organization{
    return {
      id: '',
      name:'',
      description: '',
      isEmpty: true
    }
  }
}
