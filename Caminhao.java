public class Caminhao extends Veiculo{
    private String tipoDeCarga;

    public Caminhao(int contador) {
        super(contador);
        System.out.println("Digite o tipo de carga do caminhao");
        this.tipoDeCarga = scan.nextLine();
    }

    @Override
    void Dados() {
        super.Dados();
        System.out.println("Tipo de Carga do caminhao: "+ this.tipoDeCarga + "\n" +
                "Tipo de Veiculo: Caminhao");
    }

    public String getTipoDeCarga() {
        return tipoDeCarga;
    }

    public void setTipoDeCarga(String tipoDeCarga) {
        this.tipoDeCarga = tipoDeCarga;
    }
}
