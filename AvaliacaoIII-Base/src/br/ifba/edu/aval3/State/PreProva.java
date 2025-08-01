package br.ifba.edu.aval3.State;

public class PreProva implements FaseState{

    @Override
    public FaseState mudarFase(){
        return new Largada();
    }

}