package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }
    
    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Walquíria", 123456789);
        agendaContatos.adicionarContato("Mortícia", 123456789);
        agendaContatos.adicionarContato("Drácula", 9999999);
        agendaContatos.adicionarContato("Frankenstein", 666);
        agendaContatos.adicionarContato("Wednesday", 2345);
        agendaContatos.adicionarContato("Walquíria", 7777);
        agendaContatos.adicionarContato("Walquíria SF", 126789);
        agendaContatos.adicionarContato("Walquíria Ferreira", 123459);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Walquíria"));

        System.out.println("Contato atualizado " + agendaContatos.atualizarNumeroContato("Mortícia", 23267));
    }
}
