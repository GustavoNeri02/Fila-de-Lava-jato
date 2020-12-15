public class Moto extends Veiculo{
    private int numeroRodas;

    public Moto(int contador) {
        super(contador);
        System.out.println("Digite o numero de rodas da moto");
        this.numeroRodas = scan.nextInt();
    }

    @Override
    void Dados() {
        super.Dados();
        System.out.println("Numero de Rodas da moto:" + this.numeroRodas+"\n" +
                "Tipo de Veiculo: Moto");
    }

    public int getNumeroRodas() {
        return numeroRodas;
    }

    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }
}
