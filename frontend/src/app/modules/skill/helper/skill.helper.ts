
import {Skill} from "../model/business/skill.business";
import {SkillDto} from "../model/dto/skill.dto";

export class SkillHelper{
  // convertir un dto vers un business
  public static fromDTO(dto:SkillDto): Skill {
    return{
      id:dto.skill_id,
      title:dto.title,
      description:dto.description,
      isEmpty:false

    }
  }
//convertir un business vers un dto
  public static toDTO(business:Skill): SkillDto {
    return{
      skill_id:business.id,
      title:business.title,
      description:business.description

    }
  }
// retourne un business vide
  public static getEmpty(): Skill {
    return{
      id: "",
      title:'',
      description:'',
      isEmpty: true
    }
  }
}
