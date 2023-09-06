package com.AbdullahBILGEN.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
@Log4j2
public class CommandLineRunnerBean {
    public CommandLineRunner commendLineRunnerMethod(){
        return args->{
            log.info("Data set oluşturuldu");
            System.out.println("Data set oluşturuldu");

         };// end return
        }//end CommendLineRunnerBean Method
       }// end class

