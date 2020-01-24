package testes;

import org.junit.Assert;
import org.junit.Test;
import veiculos.Caminhonete;
import veiculos.Veiculo;
import veiculos.VeiculoComum;
import veiculos.VeiculoSuv;

public class PrecoTeste {

    @Test
    public void dadoQueTemosCarroComumEMenosDe5DiasRetornaValor(){
        Integer dias = 3;

        VeiculoComum veiculoComum = new VeiculoComum();

        Double precoTotal = veiculoComum.calculaPreco(dias);

        Assert.assertEquals(Double.valueOf(126), precoTotal);
    }
    @Test
    public void dadoQueTemosCarroComumDiasEntreSEISeNOVERetornaValor(){
        Integer dias = 8;

        VeiculoComum veiculoComum = new VeiculoComum();

        Double precoTotal = veiculoComum.calculaPreco(dias);

        Assert.assertEquals(Double.valueOf(352), precoTotal);

    }
    @Test
    public void dadoQueTemosCarroComumEDIASMaiorQueDEZRetornaValor(){
        Integer dias = 15;

        VeiculoComum veiculoComum = new VeiculoComum();

        Double precoTotal = veiculoComum.calculaPreco(dias);

        Assert.assertEquals(Double.valueOf(720), precoTotal);

    }

    @Test
    public void dadoQueTemosSuvEMenosDe5DiasRetornaValor(){
        Integer dias = 4;

        Veiculo veiculoComum = new VeiculoSuv();

        Double precoTotal = veiculoComum.calculaPreco(dias);

        Assert.assertEquals(Double.valueOf(420), precoTotal);

    }
    @Test
    public void dadoQueTemosSuvDiasEntreSEISeNOVERetornaValor(){

        Integer dias = 10;

        Veiculo veiculoComum = new VeiculoSuv();

        Double precoTotal = veiculoComum.calculaPreco(dias);

        Assert.assertEquals(Double.valueOf(1100), precoTotal);

    }

    @Test
    public void dadoQueTemosSuvEDIASMaiorQueDEZRetornaValor(){

        Integer dias = 11;

        Veiculo veiculoComum = new VeiculoSuv();

        Double precoTotal = veiculoComum.calculaPreco(dias);

        Assert.assertEquals(Double.valueOf(1320), precoTotal);

    }

    @Test
    public void dadoQueTemosCaminhoneteEMenosDe5DiasRetornaValor(){

        Integer dias = 5;

        Veiculo veiculoComum = new Caminhonete();

        Double precoTotal = veiculoComum.calculaPreco(dias);

        Assert.assertEquals(Double.valueOf(420), precoTotal);
    }
    @Test
    public void dadoQueTemosCaminhoneteDiasEntreSEISeNOVERetornaValor(){

    }
    @Test
    public void dadoQueTemosCaminhoneteEDIASMaiorQueDEZRetornaValor(){

    }

    @Test
    public void dadoQueTemosMotoEMenosDe5DiasRetornaValor(){

    }
    @Test
    public void dadoQueTemosMotoDiasEntreSEISeNOVERetornaValor(){

    }
    @Test
    public void dadoQueTemosMotoEDIASMaiorQueDEZRetornaValor(){

    }
}
