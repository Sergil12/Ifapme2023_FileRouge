import {DocumentDto} from "../model/dto/document.dto";
import {Document} from "../model/business/document.business";

export class DocumentHelper {
  // convertir un dto vers un business
  public static fromDTO(dto: DocumentDto): Document {
    return {
      id:dto.document_id,
      title:dto.title,
      path:dto.path,
      content:dto.content,
      type:dto.type,
      create_date:dto.create_date,
      isEmpty:false
    }
  }

  //convertir un business vers un dto
  public static toDTO(business: Document): DocumentDto {
    return {
      document_id:business.id,
      title:business.title,
      path:business.path,
      content:business.content,
      type:business.type,
      create_date:business.create_date
    }
  }
// retourne un business vide
  public static getEmpty():Document{
    return {
      title: '',
      id: '',
      path: '',
      content: '',
      type: '',
      create_date:new Date(),
      isEmpty: true
    }
  }
}
