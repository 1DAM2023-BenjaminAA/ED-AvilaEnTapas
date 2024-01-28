import com.iesam.avila.features.snackAPP.domain.Snack;
import com.iesam.avila.features.snackAPP.presentation.MainSnack;

public class Main {
    public static void main(String[] args) {

        MainSnack.printSnacks();
        MainSnack.printSnack("2");

        Snack newSnack = new Snack(
                "3",
                "Cochinillo",
                "",
                "Meson de Gredos",
                "4.3",
                "200",
                "502",
                " (4 calabacines), (2 cebollas), (1 diente de ajo), (carne picada 1/2), (aceite de oliva), (2 tomates), 1 taza de zanahoria), (pimiento rojo), (vino blanco), (300ml de bechamel), (100g de queso rallado), (sal y pimienta)",
                " C. Comuneros de Castilla, 4, 05001 Ávila, España"
        );
      // MainSnack.createSnack(newSnack);

        Snack snackToUpdate = new Snack(
                "3",
                "Cochinillo II",
                "",
                "Meson de Gredos",
                "4.4",
                "210",
                "510",
                " (4 calabacines), (2 cebollas), (1 diente de ajo), (carne picada 1/2), (aceite de oliva), (2 tomates), 1 taza de zanahoria), (pimiento rojo), (vino blanco), (300ml de bechamel), (100g de queso rallado), (sal y pimienta)",
                " C. Comuneros de Castilla, 4, 05001 Ávila, España"
        );
      //  Main.updateSnack(snackToUpdate);
    }
}