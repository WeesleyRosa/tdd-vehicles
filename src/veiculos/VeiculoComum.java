package veiculos;


public class VeiculoComum extends Veiculo {
    private final Double precoPadrao = 40.00;

    @Override
    public Double calculaPreco(Integer dias) {
        return (dias * precoPadrao) + (dias * precoPadrao) * calculaTaxa(dias);
    }

}
