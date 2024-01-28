package com.iesam.avila.features.snackAPP.domain;

import java.util.ArrayList;

public class GetSnacksUseCase {

    private SnackRepository  snackRepository;

    public GetSnacksUseCase(SnackRepository snackRepository){

        this.snackRepository = snackRepository;
    }

    public ArrayList<Snack>execute(){
        return snackRepository.obtainSnacks();
    }


}
