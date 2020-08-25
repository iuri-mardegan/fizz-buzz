package modelo;

public class Default extends Regra{

    @Override
    public boolean validaResposta(Integer numero) {
        return true;
    }

    @Override
    public void printResposta(Integer numero) {
        System.out.println(numero);
    }
}
