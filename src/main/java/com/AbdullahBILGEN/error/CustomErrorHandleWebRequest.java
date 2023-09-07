package com.AbdullahBILGEN.error;

import com.AbdullahBILGEN.assist.Frontend;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// LOMBOK
@RequiredArgsConstructor


// API
@RestController
@CrossOrigin(origins = Frontend.REACT_URL)
public class CustomErrorHandleWebRequest implements ErrorController {


    // ErrorController
    //errorAttributes
    //WebRequest

    private ApiResult apiResult;
    private String path;
    private String message;
    private int status ;
    private Map<String, String> validationErrors;

/*
    //1. YOL
    @Autowired
    private ErrorAttributes errorAttributes;
/*

2.Yol
 /*
    private ErrorAttributes errorAttributes;
    @Autowired

    public CustomErrorHandleWebRequest(ErrorAttributes errorAttributes) {
        this.errorAttributes = errorAttributes;
    }

 */



    //3. yol (Conctor Lombok Injection)
 private final ErrorAttributes errorAttributes;

 //http://localhost:444/error
 @RequestMapping("/error")
 public ApiResult springMyHandleErrorMethod(WebRequest webRequest) {

     //spring >=2.3

     Map<String, Object> attributes = errorAttributes.getErrorAttributes(
             webRequest,
             ErrorAttributeOptions.of(
                     ErrorAttributeOptions.Include.MESSAGE,
                     ErrorAttributeOptions.Include.BINDING_ERRORS
             )
     );// end Attributes

     // Spring'ten gelen verileri almak
     status= (int) attributes.get("status");
     message= (String) attributes.get("message");
     path= (String) attributes.get("path");
     // public ApiResult(String path, String message, int status) {}
     apiResult=new ApiResult(path,message,status);

     // eğer springden gelen bir hata var ise
     if (attributes.containsKey("errors")) {
         List<FieldError> fieldErrorList = (List<FieldError>) attributes.get("errors");
         //HashMap oluştur
         validationErrors = new HashMap<>();
         // Bütün hataları Foreach döngüsünde kullan

         for (FieldError temp : fieldErrorList
         ) {
             validationErrors.put(temp.getField(), temp.getDefaultMessage());

         }
         apiResult.setValidationErrors(validationErrors);
     }
     return apiResult;
 }     // End spring My Handle Method
}// End Class

