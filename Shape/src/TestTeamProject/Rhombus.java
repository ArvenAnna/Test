package TestTeamProject;

    // НЕ ТРОГАТЬ!!!
    // Собственность ~@NPG@~
    // P.S. Свой код восстановлю, а вот чужой испорчу)))

public class Rhombus implements Constructable {
    private int heightRhombus;
    private int angleRhombus;

    public int getHeightRhombus() {
        return heightRhombus;
    }

    public void setHeightRhombus(int heightRhombus) {
        this.heightRhombus = heightRhombus;
    }

    public int getAngleRhombus() {
        return angleRhombus;
    }

    public void setAngleRhombus(int angleRhombus) {
        this.angleRhombus = angleRhombus;
    }

    @Override
    public double areaShape() {
        return (heightRhombus * heightRhombus * Math.sin(angleRhombus));
    }

    @Override
    public double perimetrShape() {
        return heightRhombus * 4;
    }

    @Override
    public void paintingShape() {
        System.out.println("You painting ~@NPG@~'s Rhombus");
    }
}
