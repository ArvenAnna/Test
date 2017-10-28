package chemicalElement;

enum  MetalSare {
    Ai(13),
    in(49),
    Sn(50);

    private int elecrtonegatyvity;

    private MetalSare(int elecrtonegatyvity){
        this.elecrtonegatyvity = elecrtonegatyvity;
    }

    public int getElecrtonegatyvity() {
        return elecrtonegatyvity;
    }
}
