import java.util.ArrayList;
import java.util.List;

public class Fila {
    List<Veiculo> filaLavaJato = new ArrayList<>();


    void inserir(Veiculo veiculo){
        filaLavaJato.add(veiculo);
    }
    Veiculo remover(){
        return this.filaLavaJato.remove(0);
    }
    boolean fila_vazia(){
        return(this.filaLavaJato.isEmpty());
    }
    int tamanho(){
        return(this.filaLavaJato.size());
    }
    void imprimir(){
        for (int i = 0; i < filaLavaJato.size(); i++){
            filaLavaJato.get(i).Dados();
        }
    }

}

