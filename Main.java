
import javax.swing.*;

public class Main {
    public static void main(String[] args){
        int menu;
        int contador = 1;
        Fila filaEspera = new Fila();
        Fila filaLavados = new Fila();
        Veiculo veiculo;
        while (true){
            veiculo = null;
            menu = Integer.parseInt(JOptionPane.showInputDialog("Digite :\n1 para carro \n2 para moto \n3 para caminhao\n" +
                    "4 para imprimir veiculos já lavados\n" +
                    "5 para imprimir veiculos na fila de espera\n"+
                    "0 para sair"));
            if (menu==0){
                System.out.println("Saindo...");
                break;
            }else if (menu==1 || menu==2 || menu==3) {
                switch (menu) {
                    case 1:
                        veiculo = new Carro(contador);
                        break;
                    case 2:
                        veiculo = new Moto(contador);
                        break;
                    case 3:
                        veiculo = new Caminhao(contador);
                        break;
                }
                filaEspera.inserir(veiculo);
                contador+=1;


            }else{
                switch (menu) {
                    case 4:
                        if (filaLavados.fila_vazia()){
                            System.out.println("Fila de Lavados esta vazia!");
                        }else{
                            System.out.println("**************Fila de Lavados**************");
                            filaLavados.imprimir();
                        }
                        break;
                    case 5:
                        if (filaEspera.fila_vazia()){
                            System.out.println("Fila de Espera esta vazia!");
                        }else{
                            System.out.println("**************Fila de Espera**************");
                            filaEspera.imprimir();
                        }
                        break;
                    default:
                        System.out.println("Numero incorreto!");
                        break;

                }
            }

            if (filaEspera.tamanho() != 0 && filaEspera.tamanho() % 3 == 0){
                veiculo = filaEspera.remover();
                filaLavados.inserir(veiculo);
                System.out.println("Inserindo aos lavados veiculo de id: "+veiculo.getId());
            }
        }


    }
}
