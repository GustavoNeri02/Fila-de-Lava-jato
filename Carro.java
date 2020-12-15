public class Carro extends Veiculo{

    private int numeroPortas;

    public Carro(int contador) {
        super(contador);
        System.out.println("Digite o numero de portas do carro");
        this.numeroPortas = scan.nextByte();
    }

    @Override
    void Dados() {
        super.Dados();
        System.out.println("Numero de portas do carro: " + this.numeroPortas + "\n" +
                "Tipo de Veiculo: Carro");
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}
