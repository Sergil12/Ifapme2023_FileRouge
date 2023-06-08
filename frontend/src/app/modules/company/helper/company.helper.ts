import {CompanyDto} from "../model/dto/company.dto";
import {Company} from "../model/business/company.business";

export class CompanyHelper{
  // convertir un dto vers un business
  public static fromDTO(dto:CompanyDto): Company {
    return{
      company_id:dto.company_id,
      name:dto.name,
      description:dto.description,
      address:dto.address,
      is_managed:dto.is_managed,
      active:dto.active,
      deleted:dto.deleted,
      deleted_by:dto.deleted_by,
      isEmpty:false
    }
  }
//convertir un business vers un dto
  public static toDTO(business:Company): CompanyDto {
    return{
      company_id:business.company_id,
      name:business.name,
      description:business.description,
      address:business.address,
      is_managed:business.is_managed,
      active:business.active,
      deleted:business.deleted,
      deleted_by:business.deleted_by
    }
}
// retourne un business vide
  public static getEmpty(): Company {
    return{
      company_id: '',
      name: '',
      description: '',
      address: '',
      is_managed: '',
      active: true,
      deleted: true,
      deleted_by: '',
      isEmpty:true
    }
  }
}
