import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 20;

    int ballSpeed1 = 0;
    int ballSpeed2 = 0;
    int ballSpeed3 = 0;
    int ballSpeed4 = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }


    @Override
    public void draw() {
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();

    }

    private void drawCircle1() {
        ellipse(ballSpeed1, HEIGHT / 5 , DIAMETER, DIAMETER);
        ballSpeed1++;

    }

    private void drawCircle2() {
        ellipse(ballSpeed2, 2 * (HEIGHT / 5) , DIAMETER, DIAMETER);
        ballSpeed2+=2;

    }

    private void drawCircle3() {
        ellipse(ballSpeed3, 3 * (HEIGHT / 5) , DIAMETER, DIAMETER);
        ballSpeed3+=3;
    }

    private void drawCircle4() {
        ellipse(ballSpeed4, 4 * (HEIGHT / 5) , DIAMETER, DIAMETER);
        ballSpeed4+=4;
    }

}
