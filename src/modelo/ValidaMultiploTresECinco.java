package modelo;

public class ValidaMultiploTresECinco extends Regra{

    @Override
    public boolean validaResposta(Integer numero) {
        return numero % 5 == 0 && numero % 3 == 0;
    }

    @Override
    public void printResposta(Integer numero) {
        System.out.println("fizz-buzz");
    }
}
