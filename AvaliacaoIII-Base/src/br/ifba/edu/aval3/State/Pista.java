package br.ifba.edu.aval3.State;

public class Pista implements FaseState{

    @Override
    public FaseState mudarFase() {
        return new PosProva();
    }
}
