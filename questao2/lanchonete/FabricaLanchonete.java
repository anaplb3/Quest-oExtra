package questao2.lanchonete;

import questao2.ingredientes.pao.Pao;
import questao2.ingredientes.presunto.Presunto;
import questao2.ingredientes.queijo.Queijo;
import questao2.ingredientes.salada.Salada;

public interface FabricaLanchonete{

    Pao criarPao();
    Queijo criarQueijo();
    Presunto criarPresunto();
    Salada criarSalada();

    Pao getPao();
    Queijo getQueijo();
    Presunto getPresunto();
    Salada getSalada();
}
