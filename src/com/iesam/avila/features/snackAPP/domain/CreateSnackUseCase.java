package com.iesam.avila.features.snackAPP.domain;

public class CreateSnackUseCase {

    private SnackRepository snackRepository;

    public CreateSnackUseCase(SnackRepository snackRepository){
        this.snackRepository = snackRepository;
    }

    public void execute(String snackId){
        snackRepository.createSnack(snackId);
    }

    }

