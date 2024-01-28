package com.iesam.avila.features.snackAPP.domain;

import java.util.ArrayList;

public interface SnackRepository {

    ArrayList<Snack> obtainSnacks();
    Snack obtainSnack(String snackId);
    void deleteSnack(String snackId);

    void saveSnack(Snack snack);
    void updateSnack(Snack snack);

    void createSnack(String snackId);
}
