package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatosMap.isEmpty()) {agendaContatosMap.remove(nome);}
    }

    public void exibirContatos() {
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatosMap.isEmpty()) {agendaContatosMap.get(nome);}
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Wal", 123456789);
        agendaContatos.adicionarContato("Wal", 987654);
        agendaContatos.adicionarContato("Wal SF", 83445969);
        agendaContatos.adicionarContato("Wal Ferreira", 54876);
        agendaContatos.adicionarContato("Addams", 123456789);
        agendaContatos.adicionarContato("Drácula", 666);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Addams");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Wal SF"));
    }
    
}
