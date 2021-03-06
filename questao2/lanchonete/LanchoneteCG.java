package questao2.lanchonete;

import questao2.ingredientes.pao.Pao;
import questao2.ingredientes.pao.PaoFrances;
import questao2.ingredientes.presunto.Presunto;
import questao2.ingredientes.presunto.PresuntoFrango;
import questao2.ingredientes.queijo.Queijo;
import questao2.ingredientes.queijo.QueijoPrato;
import questao2.ingredientes.salada.Salada;
import questao2.ingredientes.salada.SaladaComVerdura;

public class LanchoneteCG implements FabricaLanchonete{
    @Override
    public Pao criarPao() {
        return new PaoFrances();
    }

    @Override
    public Queijo criarQueijo() {
        return new QueijoPrato();
    }

    @Override
    public Presunto criarPresunto() {
        return new PresuntoFrango();
    }

    @Override
    public Salada criarSalada() {
        return new SaladaComVerdura();
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
