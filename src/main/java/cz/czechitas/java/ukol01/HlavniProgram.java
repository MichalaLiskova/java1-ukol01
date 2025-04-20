package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;


    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();
        zofka.penDown();
        zofka.setSpeed(100);
        zofka.setLocation(1500,500);
         nakresliPrasatko();
         zofka.penUp();
         zofka.turnRight(130);
         zofka.move(60);
         zofka.turnRight(90);
         zofka.move(100);

        // nakresliSluniko();
        //nakresli8sten();


    }

    //část 1
    public void nakresliPrasatko() {
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(100);
        //roh tedˇnožičky přední
        nakresliNozicky();
        zofka.move(-100);
        nakresliNozicky();
        zofka.turnLeft(180);
        zofka.turnRight(40);
        zofka.move(45);
        zofka.turnRight(95);
        zofka.move(45);

    }

    public void nakresliNozicky() {
        zofka.turnRight(60);
        zofka.move(20);
        zofka.turnRight(180);
        zofka.move(20);
        zofka.turnLeft(120);
        zofka.move(20);
        zofka.turnRight(180);
        zofka.move(20);
        zofka.turnRight(60);
    }

    // cast 2

    public void nakresli8sten() {
        for (int i = 0; i < 8; i++) {         //vyvoláním fori - nadefinováním i - 8 je proto, že máme programátorskou jedničku
            zofka.move(45);
            zofka.turnRight(45);
        }
    }

        public void nakresliKolecko () {
            for (int i = 0; i < 36; i++) {
                zofka.move(10);
                zofka.turnLeft(10);

            }

        }

        public void nakresliSlunicko () {
            nakresliKolecko();
            for (int i = 0; i < 18; i++) {
                zofka.turnRight(90);
                zofka.move(50);
                zofka.turnRight(180);
                zofka.penUp();
                zofka.move(50);
                zofka.turnRight(90);
                zofka.move(10);
                zofka.turnLeft(10);
                zofka.move(10);
                zofka.turnLeft(10);
                zofka.penDown();


            }

        }

    }




