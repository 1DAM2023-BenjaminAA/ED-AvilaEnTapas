package com.iesam.avila.features.snackAPP.domain;

import java.util.ArrayList;

public class GetSnackUseCase {



   private SnackRepository snackRepository;


   public GetSnackUseCase(SnackRepository snackRepository){

       this.snackRepository = snackRepository;
   }

   public Snack execute(String snackId){
       return this.snackRepository.obtainSnack(snackId);
   }



}
