public class Square implements methodsOfShape {
    private int heigthSquare;

    public int getHeigthSquare() {
        return heigthSquare;
    }

    public void setHeigthSquare(int heigthSquare) {
        this.heigthSquare = heigthSquare;
    }

    Square(int heigthSquare) {
        this.heigthSquare = heigthSquare;
    }


    @Override
    public double areasShape() {
        return heigthSquare + heigthSquare + heigthSquare + heigthSquare;
    }

    @Override
    public double perimetrShape() {
        return heigthSquare * heigthSquare;
    }

    @Override
    public void pantingShape() {
        System.out.println("You painting my square");
    }
}
