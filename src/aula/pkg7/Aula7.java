
package aula.pkg7;

import java.util.Scanner;



public class Aula7 {
    static Scanner sc = new Scanner(System.in);
    
    
    public static void main(String[] args) { 
        //Variáveis
        
        Usuario u = new Usuario();
        Tarefa t = new Tarefa();
        
        String email;
        String senha;
        
        String assunto;
        String nome;
        String data;
        boolean realizada;
        
        //Processamento
        
        //*Usuario
        
        System.out.println("Insira o email: ");
        email = sc.nextLine();
        
        System.out.println("Insire a senha: ");
        senha  = sc.nextLine();
        
        u.setEmail1(email);
        u.setSenha1(senha);
        u.setTarefa(t);
        
        
        //*Tarefa
        
        System.out.println("Insira o assunto da tarefa:");
        assunto = sc.nextLine();
        
        System.out.println("Insira o nome da tarefa:");
        nome = sc.nextLine();
        
        System.out.println("Insira a data de finalização da tarefa:");
        data = sc.nextLine();
        
        t.setNome(nome);
        t.setAssunto(assunto);
        t.setData(data);
        
        
        //Saída
        
        //Usuario
        
        System.out.println("Email: " + u.getEmail1());
        System.out.println("Senha: " + u.getSenha1());
        System.out.println("Tarefa: " + u.getTarefa());
        
        //Tarefa
        
        System.out.println("Nome da tarefa: " + t.getNome());
        System.out.println("Assunto da tarefa: " + t.getAssunto());
        System.out.println("Data de finalização: " + t.getData());
    }   
    
}
