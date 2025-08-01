package br.ifba.edu.aval3.State;

// State
public class MomentoLargada implements FaseState {

    @Override
    public FaseState mudarFase() {
        return new Pista();
    }
}
