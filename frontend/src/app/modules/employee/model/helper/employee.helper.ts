import {EmployeeDto} from "../dto/employee.dto";
import {Employee} from "../business/employee.business";

export class EmployeeHelper {
  // convertir un dto vers un business
  public static fromDTO(dto: EmployeeDto): Employee {
    return {
      id:dto.employee_id,
      lastname:dto.lastname,
      firstname:dto.firstname,
      active:dto.active,
      deleted_by:dto.deleted_by,
      address:dto.address,
      gender:dto.gender,
      birthday:dto.birthday,
      ssin:dto.ssin,
      status:dto.status,
      deleted:dto.deleted,
      isEmpty:false

    }
  }

  //convertir un business vers un dto
  public static toDTO(business: Employee): EmployeeDto {
    return {
      employee_id:business.id,
      lastname:business.lastname,
      firstname:business.firstname,
      active:business.active,
      deleted_by:business.deleted_by,
      address:business.address,
      gender:business.gender,
      birthday:business.birthday,
      ssin:business.ssin,
      status:business.status,
      deleted:business.deleted
    }
  }
// retourne un business vide
  public static getEmpty():Employee{
    return {
      isEmpty: false,
      id: '',
      lastname: '',
      firstname: '',
      active: true,
      deleted_by: '',
      address: '',
      gender: '',
      birthday: new Date(),
      ssin: '',
      status:'',
      deleted: true
    }
  }
}
