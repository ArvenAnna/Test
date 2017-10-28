package chemicalElement;

enum  TransitionMetals {
    Hf(72),
    Ta(73),
    W(74),
    Re(75),
    Os(76),
    Ir(77),
    Pt(78),
    Au(79);

    private int elecrtonegatyvity;

    private TransitionMetals(int elecrtonegatyvity){
        this.elecrtonegatyvity = elecrtonegatyvity;
    }

    public int getElecrtonegatyvity() {
        return elecrtonegatyvity;
    }

}
