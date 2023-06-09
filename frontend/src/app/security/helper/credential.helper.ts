import {Credential, CredentialDto} from '@security/model';
import {isNil} from 'lodash';

export class CredentialHelper {
  public static credentialFromDto(dto: CredentialDto): Credential {
    return {
      id: dto.credential_id,
      username: dto.username,
      isActif: dto.actif,
      isEmpty: isNil(dto.credential_id)
    }
  }
}
