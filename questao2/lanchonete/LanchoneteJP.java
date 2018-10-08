package questao2.lanchonete;

import questao2.ingredientes.pao.Pao;
import questao2.ingredientes.pao.PaoBola;
import questao2.ingredientes.presunto.Presunto;
import questao2.ingredientes.presunto.PresuntoFrango;
import questao2.ingredientes.queijo.Queijo;
import questao2.ingredientes.queijo.QueijoMoussarela;
import questao2.ingredientes.salada.Salada;
import questao2.ingredientes.salada.SaladaSemVerdura;

public class LanchoneteJP implements FabricaLanchonete{

    public Pao criarPao(){
        return new PaoBola();
    }

    @Override
    public Queijo criarQueijo() {
        return new QueijoMoussarela();
    }

    @Override
    public Presunto criarPresunto() {
        return new PresuntoFrango();
    }

    @Override
    public Salada criarSalada() {
        return new SaladaSemVerdura();
    }

    @Override
    public Pao getPao() {
        return this.criarPao();
    }

    @Override
    public Queijo getQueijo() {
        return this.criarQueijo();
    }

    @Override
    public Presunto getPresunto() {
        return this.criarPresunto();
    }

    @Override
    public Salada getSalada() {
        return this.criarSalada();
    }

}
