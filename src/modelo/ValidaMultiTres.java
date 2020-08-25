package modelo;

public class ValidaMultiTres extends Regra {

    @Override
    public boolean validaResposta(Integer numero) {
        return numero % 3 == 0;
    }

    @Override
    public void printResposta(Integer numero) {
        System.out.println("fizz");
    }
}
