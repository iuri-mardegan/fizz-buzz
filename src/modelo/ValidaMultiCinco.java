package modelo;

public class ValidaMultiCinco extends Regra{

    @Override
    public boolean validaResposta(Integer numero) {
        return numero % 5 == 0;
    }

    @Override
    public void printResposta(Integer numero) {
        System.out.println("buzz");
    }
}
