import java.util.Scanner;

public abstract class Veiculo {
    private int id;
    private String placa;
    private String cor;
    private String nomeDono;
    Scanner scan = new Scanner(System.in);

    public Veiculo(int contador) {
        this.id = contador;
        System.out.println("--------------Inserindo Veiculo--------------");
        System.out.println("Digite a placa do veiculo");
        this.placa = scan.nextLine();
        System.out.println("Digite a cor");
        this.cor = scan.nextLine();
        System.out.println("Digite o nome:");
        this.nomeDono = scan.nextLine();
    }
    void Dados(){
        System.out.println("--------------Dados do Veiculo--------------\n"+
                "ID: " + this.id+"\n" +
                "Placa: "+this.placa+"\n" +
                "Cor: "+this.cor+"\n" +
                "Nome: "+this.nomeDono);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }
}
