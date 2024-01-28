package com.iesam.avila.features.snackAPP.data;

import com.iesam.avila.features.snackAPP.domain.Snack;
import com.iesam.avila.features.snackAPP.domain.SnackRepository;

import java.util.ArrayList;

public class SnackDataRepository implements SnackRepository {

private static SnackDataRepository instance = null;

private ArrayList<Snack> localSnacks = new ArrayList<>();

private SnackDataRepository(){
    initData();
}


@Override
public ArrayList<Snack> obtainSnacks(){
    return localSnacks;
}

@Override
public Snack obtainSnack(String petId){
    for(Snack snack : localSnacks){
        if(snack.getId().equals(petId)){
            return snack;
        }
    }
    return null;
}

@Override
public void deleteSnack(String snackId){
    for(int i=0; i<localSnacks.size(); i++){
        if (localSnacks.get(i).getId().equals(snackId)) {
            localSnacks.remove(i);
        }
    }


}

    @Override
    public void saveSnack(Snack snack) {
        localSnacks.add(snack);
    }

    @Override
    public void updateSnack(Snack snack) {
     deleteSnack(snack.getId());
     saveSnack(snack);
    }

    @Override
    public void createSnack(String snackId) {
    createSnack(snackId);
    }


    private void initData(){
    localSnacks.add(new Snack("1", " pulpo con parmetier ", "2do plato caliente", "CARAMEL", "4.0", "10", "15", " (pata de pulpo), (500gm de patata), (nata de cocina), (sal y pimienta)", " 40 Calle de San Segundo, 05001, Ávila "));
    localSnacks.add(new Snack("2", " chuleton de avila", " entrante tradicional", "SIGLO-DOCE", "3.5", "15", "20", " (120gr de chuleton), (1 patata panadera), 4 trozos de pimientos), (aceite oliva), (sal), (tomillo), (pimienta negra)", " Plaza Catedral, 05003, Avila (Ávila)"));
}

public static SnackDataRepository newInstance(){
    if(instance == null){
        instance = new SnackDataRepository();
    }
    return instance;
}

}
