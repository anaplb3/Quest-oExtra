package questao2.sanduiche;

import questao2.ingredientes.pao.Pao;
import questao2.ingredientes.presunto.Presunto;
import questao2.ingredientes.queijo.Queijo;
import questao2.ingredientes.salada.Salada;
import questao2.lanchonete.FabricaLanchonete;

public class Sanduiche {
    private Queijo queijo;
    private Presunto presunto;
    private Salada salada;
    private Pao pao;


    public Sanduiche(FabricaLanchonete fabrica) {
        this.queijo = fabrica.criarQueijo();
        this.presunto = fabrica.criarPresunto();
        this.salada = fabrica.criarSalada();
        this.pao = fabrica.criarPao();
    }
}
