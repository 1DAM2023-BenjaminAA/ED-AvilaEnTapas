package com.iesam.avila.features.snackAPP.presentation;

import com.iesam.avila.features.snackAPP.data.SnackDataRepository;
import com.iesam.avila.features.snackAPP.domain.*;

import java.util.ArrayList;

public class MainSnack {

    public static void printSnacks(){
        GetSnacksUseCase snacksUseCase = new GetSnacksUseCase(SnackDataRepository.newInstance());
        ArrayList<Snack> snacks = snacksUseCase.execute();
        //imprimir cada una de las tapas
        System.out.println(snacks.toString());
    }

    public static void printSnack(String snackId){
        GetSnackUseCase getSnackUseCase = new GetSnackUseCase(SnackDataRepository.newInstance());
        Snack snack = getSnackUseCase.execute(snackId);
        System.out.println(snack.toString());
    }

    public static void  deleteSnack(String snackId){
        DeleteSnackUseCase deleteSnackUseCase = new DeleteSnackUseCase(SnackDataRepository.newInstance());
        deleteSnackUseCase.execute(snackId);
    }

    public static void updateSnack(Snack snack){
        UpdateSnackUseCase updateSnackUseCase = new UpdateSnackUseCase(SnackDataRepository.newInstance());
        updateSnackUseCase.execute(snack);

        System.out.println("");
    }


}
