import modelo.*;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Regra> regraList = Arrays.asList(new ValidaMultiploTresECinco(), new ValidaMultiCinco(), new ValidaMultiTres(), new Default());
        for (int i = 0; i <= 100; i++) {
            validaRegras(regraList, i).printResposta(i);
        }
    }

    private static Regra validaRegras(List<Regra> regraList, Integer inteiro){
        for (Regra r : regraList) {
            if (r.validaResposta(inteiro)) {
                return r;
            }
        }
        return null;
    }

}
