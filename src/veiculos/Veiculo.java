package veiculos;

public abstract class Veiculo {
    protected Double precoPadrao;

    public abstract Double calculaPreco(Integer dias);

    protected Double calculaTaxa(Integer dias){
        if(dias < 6)
            return 0.05;
        else if (dias >= 6 && dias < 11)
            return 0.1;
        else
            return 0.2;
    }
}


