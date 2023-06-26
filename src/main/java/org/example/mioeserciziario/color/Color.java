package org.example.mioeserciziario.color;

public class Color {

    public static final Color RED = new Color(255, 0, 0);
    public static final Color GREEN = new Color(0, 255, 0);
    public static final Color BLUE = new Color(255, 255, 255);

    private int r;
    private int g;
    private int b;

    private Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public static Color make(int r, int g, int b) {
        if (r == 0 && g == 255 & b == 0) {
            return Color.GREEN;
        } else if (r == 255 && g == 0 & b == 0) {
            return Color.RED;
        } else if (r == 255 && g == 255 & b == 255) {
            return Color.BLUE;
        }
        return new Color(r, g, b);
    }

    public String toString() {
        if (r == 0 && g == 255 & b == 0) {
            return "verde";
        } else if (r == 255 && g == 0 & b == 0) {
            return "rosso";
        } else if (r == 255 && g == 255 & b == 255) {
            return "blue";
        }
        return "(" + r + ", " + g + ", " + b + ")";
    }

    @Override
    public boolean equals(Object obj) {
        Color newColor = ((Color) obj);
        if (r == newColor.r && g == newColor.g && b == newColor.b)
            return true;

        return false;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }
}
