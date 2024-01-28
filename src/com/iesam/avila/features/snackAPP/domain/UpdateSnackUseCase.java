package com.iesam.avila.features.snackAPP.domain;

public class UpdateSnackUseCase {
private SnackRepository snackRepository;
    public UpdateSnackUseCase(SnackRepository  snackRepository){
    this.snackRepository = snackRepository;
}

public void execute(Snack snack){
        this.snackRepository.updateSnack(snack);
}

}
