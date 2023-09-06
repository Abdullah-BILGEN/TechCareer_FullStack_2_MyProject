package com.AbdullahBILGEN.bean;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// Bir methodun spring frameworkde anlaşılması için spring frame work e tanıtılması için bunu bean keyword ü ile bu şekilde class ta belirtmeliyiz. VİZE GİBİ
@Configuration
public class ModelMapperBean {

    @Bean
   public ModelMapper ModelMapperMethod(){
       return new ModelMapper();
   }

    }

