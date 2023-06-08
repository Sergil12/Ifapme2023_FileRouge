export interface CompanyCreatePayload{
  name:string;
  description:string;
  address:string;
  is_managed:string;
  active: boolean;
  deleted: boolean;
  deleted_by:string;
}
