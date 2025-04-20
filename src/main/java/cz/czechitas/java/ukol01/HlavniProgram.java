package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;
    private Turtle pepa;


    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();
        pepa = new Turtle();
        pepa.setPenColor(Color.BLACK);
        zofka.penDown();
        zofka.setSpeed(100);
        zofka.setLocation(200, 150);
        nakresliSlunicko(5, 20);
        zofka.setLocation(100, 300);
        for (int i = 0; i < 5; i++) {
            nakresliDomecek();
            zofka.setLocation(zofka.getX() + 35, zofka.getY());
        }
        zofka.setLocation(100, 480);
        nakresliDomecek();
        zofka.setLocation(zofka.getX() + 350, 480);
        nakresliDomecek();
        System.out.println(zofka.getX());
        System.out.println(zofka.getY());
        zofka.setLocation(395, 580);
        nakresliPrasatko(Color.PINK);
        pepa.setLocation(205, 700);
        pismenoM(pepa);
        pismenoI(pepa);
        pismenoS(pepa);
        pismenoA(pepa);
       /* pepa.turnRight(90);
        pepa.move(20);
        pismenoI(pepa);
        pepa.turnRight(90);
        pepa.move(20);
        pismenoS(pepa);
        pepa.turnRight(90);
        pepa.move(20);
        pismenoA(pepa);*/
      /* cast 1 + 2  zofka.setLocation(1500, 500);
        nakresliPrasatko();
        zofka.penUp();
        zofka.turnRight(130);
        zofka.move(60);
        zofka.turnRight(95);
       zofka.setLocation(500, 500);
       zofka.turnRight(90);
       zofka.penDown();
       nakresli8sten();
       zofka.setLocation(800, 500);
       nakresliKolecko();
       zofka.setLocation(1000, 500);
       nakresliSlunicko();*/


    }

    //část 1
    public void nakresliPrasatko(Color barva) {
        Color staraBarva = zofka.getPenColor();
        zofka.setPenColor(Color.pink);
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
        zofka.setPenColor(staraBarva);
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

    public void nakresliKolecko(int velikost) {
        for (int i = 0; i < 36; i++) {
            zofka.move(velikost);
            zofka.turnLeft(10);

        }

    }

    public void nakresliSlunicko(int velikost, int paprsek) {
        Color staraBarva = zofka.getPenColor();
        zofka.setPenColor(Color.yellow);
        nakresliKolecko(velikost);
        for (int i = 0; i < 12; i++) {
            zofka.turnRight(90);
            zofka.move(paprsek);
            zofka.turnRight(180);
            zofka.penUp();
            zofka.move(paprsek);
            zofka.turnRight(90);
            zofka.move(velikost);
            zofka.turnLeft(10);
            zofka.move(velikost);
            zofka.turnLeft(10);
            zofka.move(velikost);
            zofka.turnLeft(10);
            zofka.penDown();


        }
        zofka.setPenColor(staraBarva);
    }

    //cast 3
    public void nakresliDomecek() {
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(90);
            zofka.move(70);
            zofka.turnRight(90);
            zofka.move(100);
        }
        zofka.turnRight(36);
        zofka.move(60);
        zofka.turnRight(108);
        zofka.move(60);
        zofka.turnRight(216);

    }

    // cast 4
    private void pismenoA(Turtle zofka) {
        zofka.penDown();
        zofka.move(60);
        zofka.turnRight(90);
        zofka.move(40);
        zofka.turnRight(90);
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.move(45);
        zofka.turnLeft(90);
    }

    private void pismenoS(Turtle zofka) {
        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnRight(90);
        zofka.move(40);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(45);
        zofka.turnLeft(90);
    }

    private void pismenoI(Turtle zofka) {
        zofka.penDown();
        zofka.move(60);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(45);
        zofka.turnLeft(90);
    }

    private void pismenoM(Turtle zofka) {
        zofka.penDown();
        zofka.move(60);
        zofka.turnRight(120);
        zofka.move(30);
        zofka.turnLeft(60);
        zofka.move(30);
        zofka.turnRight(120);
        zofka.move(60);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(45);
        zofka.turnLeft(90);
    }

}





