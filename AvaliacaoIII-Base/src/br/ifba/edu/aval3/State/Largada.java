package br.ifba.edu.aval3.State;

// State
public class Largada implements FaseState {

    @Override
    public FaseState mudarFase() {
        return new Pista();
    }
}
