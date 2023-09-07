package com.AbdullahBILGEN.error;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
import java.util.Map;
import java.util.Objects;

//LOMBOK
@Data

//JSON
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResult {

            // PIRASA VALİ M E S C
            private String path;
            private Map<String, String> validationErrors;
            private String message;
            private  String erorr;
            private int status ;
            private Date systemDate;  /*Created Date

    // Parametresiz Consctor

       public ApiResult() {
    }

     // Parametreli Consctor
     public ApiResult(String path, String message, int status) {
        this.path = path;
        this.message = message;
        this.status = status;
    }


}





