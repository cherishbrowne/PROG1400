package Polymorphism.Shapes;

public class Square extends Shape {

    private int width;

    public Square(int width) {
        this.width = width;

        String line = "";
        for (int i = 0; i < width; i++) {
            line += "*";
        }
        lines.add(line);
        for (int i = 0; i < width-2; i++) {
            line = "*";
            for (int j = 0; j < width-2; j++) {
                line += " ";
            }
            line += "*";
            lines.add(line);
        }
        line = "";
        for (int i = 0; i < width; i++) {
            line += "*";
        }
        lines.add(line);
    }

    @Override
    public void draw() {
        for (String line: lines) {
            System.out.println(line);
        }
    }

    @Override
    public void drawLine(int index) {
        if (index >= lines.size()) {
            System.out.print("     ");
        } else {
            System.out.print(lines.get(index));
        }
    }
}