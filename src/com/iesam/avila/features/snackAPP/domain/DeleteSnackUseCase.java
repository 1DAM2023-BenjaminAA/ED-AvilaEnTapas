package com.iesam.avila.features.snackAPP.domain;

public class DeleteSnackUseCase {

private  SnackRepository snackRepository;

public DeleteSnackUseCase(SnackRepository snackRepository){
    this.snackRepository = snackRepository;
}

public void execute(String snackId){
    snackRepository.deleteSnack(snackId);
}

}
