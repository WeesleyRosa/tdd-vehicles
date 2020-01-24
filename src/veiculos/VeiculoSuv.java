package veiculos;

public class VeiculoSuv extends Veiculo {
    private final Double precoPadrao = 100.00;

    @Override
    public Double calculaPreco(Integer dias) {
        return (dias * precoPadrao) + (dias * precoPadrao) * calculaTaxa(dias);
    }
}
