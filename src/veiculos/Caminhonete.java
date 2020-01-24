package veiculos;

public class Caminhonete extends Veiculo {
    private final Double precoPadrao = 80.00;

    @Override
    public Double calculaPreco(Integer dias) {
        return (dias * precoPadrao) + (dias * precoPadrao) * calculaTaxa(dias);
    }
}
