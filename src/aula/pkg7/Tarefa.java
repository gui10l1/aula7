package aula.pkg7;


public class Tarefa {
    private String assuntoTarefa;
    private String nomeTarefa;
    private String dataTarefa;
    private boolean tarefaRalizada;
    
    public void setAssunto(String assunto){
        assuntoTarefa = assunto;
    }
    
    public void setNome(String nome){
        nomeTarefa = nome;
    }
    
    public void setData(String data){
        dataTarefa = data;
    }
    
    public String getAssunto(){
        return assuntoTarefa;
    }
    
    public String getNome(){
        return nomeTarefa;
    }
    
    public String getData(){
        return dataTarefa;
    }
    
    
}
