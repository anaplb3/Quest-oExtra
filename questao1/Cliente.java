package questao1;

public class Cliente {
    private Ordenador ordenador;

    public void setOrdenadorBubble() {
        this.ordenador = new BubbleSort();
    }

    public void setOrdenadorInsertion() {
        this.ordenador = new InsertionSort();
    }

    public void setOrdenadorQuick() {
        this.ordenador = new QuickSort();
    }

    public void setOrdenadorMerge() {
        this.ordenador = new MergeSort();
    }

    public void ordenando() {
        int[] vetor = new int[10];
        ordenador.ordenar(vetor);
    }
}
