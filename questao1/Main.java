package questao1;

public class Main {
    public static void main(String[] args) {
        Cliente cli = new Cliente();

        cli.setOrdenadorBubble();
        cli.ordenando();

        cli.setOrdenadorInsertion();
        cli.ordenando();

        cli.setOrdenadorQuick();
        cli.ordenando();

        cli.setOrdenadorMerge();
        cli.ordenando();
    }


}
