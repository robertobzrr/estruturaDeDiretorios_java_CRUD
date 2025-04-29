package model;
import enums.Classificacao;
import model.interfaces.Folha;


public final class Professor extends Pessoa implements Folha {
    private String especializacao;
    //get e set para especializacao


    public String getEspecializacao(){
        return especializacao;
    }
    public void setEspecializacao(String especializacao){
        this.especializacao = especializacao;
    }



    @Override
    public void quem_sou_eu() {
        System.out.println(Classificacao.Professor);
    }

    @Override
    public String toString() {
        return super.toString()+ "especialização=" + especializacao;
    }

    @Override
    public void calculaSalario() {
        System.out.println("(horas trabalhadas x valor hora)");
    }
}