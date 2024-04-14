import processing.core.PApplet;
import processing.core.PVector;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


            // Game properties
            boolean gameover = false;
            float s = 5;

            // Snake properties
            List<PVector> snakePositions = new ArrayList<>();
            PVector snakeDirection = new PVector(1, 0);

            // Objective properties
            PVector objPosition = new PVector(0, 0);

            @Override
            public void settings() {
                size(250, 250);
                frameRate(25);
            }

            @Override
            public void setup() {
                reset();
            }

            @Override
            public void draw() {
                if (gameover) {
                    delay(5000);
                    reset();
                    return;
                }

                background(0);

                fill(255);
                text("Score: " + (snakePositions.size() - 1), 10, 20);

                fill(0);
                stroke(255);
                rect(objPosition.x, objPosition.y, s, s);

                for (int i = snakePositions.size() - 1; i > -1; i--) {
                    PVector position = snakePositions.get(i);
                    if (i == 0) {
                        fill(0, 255, 0);
                    } else {
                        fill(255);
                    }
                    rect(position.x, position.y, s, s);
                }
            }

            @Override
            public void keyPressed() {
                if (key == 'a' && snakeDirection.x != 1) {
                    snakeDirection.x = -1;
                    snakeDirection.y = 0;
                } else if (key == 'd' && snakeDirection.x != -1) {
                    snakeDirection.x = 1;
                    snakeDirection.y = 0;
                } else if (key == 's' && snakeDirection.y != -1) {
                    snakeDirection.x = 0;
                    snakeDirection.y = 1;
                } else if (key == 'w' && snakeDirection.y != 1) {
                    snakeDirection.x = 0;
                    snakeDirection.y = -1;
                }
            }

            void reset() {
                gameover = false;
                snakePositions.clear();
                PVector c = new PVector(width / 2, height / 2);
                snakePositions.add(c);
                randomize(objPosition, 0, width - s);
            }

            boolean overlaps(PVector p1, PVector p2) {
                PVector c1 = new PVector(p1.x + s / 2, p1.y + s / 2);
                PVector c2 = new PVector(p2.x + s / 2, p2.y + s / 2);
                return PVector.dist(c1, c2) < s;
            }

            void randomize(PVector position, float a, float b) {
                position.x = random(a, b);
                position.y = random(a, b);
            }

            void moveSnake() {
                PVector head = snakePositions.get(0);
                PVector newHead = PVector.add(head, snakeDirection);
                snakePositions.add(0, newHead);
                snakePositions.remove(snakePositions.size() - 1);
                if (overlaps(newHead, objPosition)) {
                    randomize(objPosition, 0, width - s);
                }
            }

            void checkCollision() {
                PVector head = snakePositions.get(0);
                for (int i = 1; i;
        }
    }
}
