package com.ApiFilRouge.ApiFilRouge.security.entity.payload;
import com.ApiFilRouge.ApiFilRouge.Entity.ApiResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignupRequest{
    private String username;
    private String gender;
    private String password;

    public ApiResponse isValid(){
        if(username == null ||username.isEmpty()){
            if(password == null ||password.isEmpty()){
                return new ApiResponse(false, null, "api.signup.valid-error-full");
            }else{
                return new ApiResponse(false, null, "api.signup.valid-error-email");
            }
        }else if(password == null ||password.isEmpty()){
            return new ApiResponse(false, null, "api.signup.valid-error-password");
        }else{
            return new ApiResponse(true, this, null);
        }
    }
}

