package Command;

import java.util.ArrayList;
import java.util.List;

public class GerenciaDeTrafego {

    private List<Tarefa> tarefas = new ArrayList<Tarefa>();

    public void executaTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
        tarefa.executa();
    }

    public void cancelaTarefa() {
        if (!tarefas.isEmpty()) {
            Tarefa tarefa = this.tarefas.get(this.tarefas.size() - 1);
            tarefa.cancela();
            this.tarefas.remove(this.tarefas.size() - 1);
        }
    }

}
