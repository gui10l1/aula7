package aula.pkg7;

public class Usuario {
    private Tarefa t1;
    
    private String email1;
    private String senha1;
    
//    void colocarEmail(String email){
//        email1 = email;
//    }
//    
//    void colocarSenha(String senha){
//        senha1 = senha;
//    }
//    
//    String pegarEmail(){
//        return email1;
//    }
//    
//    String pegarSenha(){
//        return senha1;
//    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email) {
        this.email1 = email;
    }

    public String getSenha1() {
        return senha1;
    }

    public void setSenha1(String senha) {
        this.senha1 = senha;
    }
    
    public void setTarefa(Tarefa t){
        t1 = t;
    }
 
    public Tarefa getTarefa(){
        return t1;
    }
}
