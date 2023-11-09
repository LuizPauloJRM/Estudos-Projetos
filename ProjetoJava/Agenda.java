package ProjetoJava;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda(){
        //incialize a lista de contatos no construtor.
        this.contatos =  new ArrayList<Contato>();
    }
    
    public void adicionarContato(String nome, String telefone, String email) {
        //Cria um novo contato e o adiciona à lista de contatos.
        Contato novoContato = new Contato(nome, telefone, email);
        contatos.add(novoContato);        
    }

    public void removerContato(String nome) {
        //procura o contato pelo nome e remove-o da lista de contatos, se encontrado.
        for (Contato contato: contatos) {
            if(contato.getNome().equals(nome)) {
                contatos.remove(contato);
                break; //sai do loop após a remoção para evitar problemas.
            }
        }
    }

    public Contato pesquisarContato(String nome){
        //procura o contato pelo nome e retona-o, se encontrado.
        for (Contato contato : contatos){
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null; // Retorna null se o contato não for encontrado.
    }
}
