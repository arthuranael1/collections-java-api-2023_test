package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato (String nome, int numero){
        contatoSet.add(new Contato(nome,numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

  public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet ){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
  }

public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
}
 public static void main (String [] args){
        AgendaContatos agendaContatos= new AgendaContatos();
        agendaContatos.exibirContatos();

agendaContatos.adicionarContato("Camila", 123456);
agendaContatos.adicionarContato("Camila",5665);
agendaContatos.adicionarContato("Arthur Anael", 111111111);
agendaContatos.adicionarContato("Silvio Santos", 654987);
agendaContatos.adicionarContato("Dilma Roussef", 40028922);
agendaContatos.exibirContatos();

     System.out.println(agendaContatos.pesquisarPorNome("Dilma"));
     System.out.println("Contato atualizado" + agendaContatos.atualizarNumeroContato("Dilma Roussef" , 5555));
 }
}
