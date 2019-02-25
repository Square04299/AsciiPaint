/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g45502.atl.asciipaint.model;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author G45502
 */
public class View {

    private final Scanner in;
    private final AsciiPaint asciiPaint;

    /**
     * create a view with an asciipaint.
     *
     * @param asciiPaint The asciipaint.
     */
    public View(AsciiPaint asciiPaint) {
        in = new Scanner(System.in);
        this.asciiPaint = asciiPaint;
    }

    /**
     * Define the size of the drawing.
     *
     * @return An asciipaint.
     */
    public AsciiPaint defineSizeDrawing() {
        String[] answer;
        Boolean badAnswer;
        int numParam = 2;
        int width = 0, height = 0;
        do {
            System.out.println("Put width and height size for your draw [10 20]: ");
            answer = in.nextLine().split(" ");
            badAnswer = answer.length != numParam;
            if (!badAnswer) {
                try {
                    width = Integer.parseInt(answer[0]);
                    height = Integer.parseInt(answer[1]);
                } catch (NumberFormatException e) {
                    badAnswer = true;
                    System.out.println("You need to put 2 integer."
                            + Arrays.toString(answer));
                }
            }
        } while (badAnswer);
        return new AsciiPaint(width, height);
    }

    /**
     * Show asciipaint with shapes.
     */
    public void show() {
        for (int i = 0; i < asciiPaint.getHeight(); i++) {
            for (int j = 0; j < asciiPaint.getWidth(); j++) {
                try {
                    System.out.print(asciiPaint.getColorAt(j, i));
                } catch (IllegalArgumentException e) {
                    System.out.print("-");
                }
            }
            System.out.print("\n");
        }
    }

    /**
     * Show all commands
     */
    public void introduce() {
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("|   You can add, move, delete shapes,    |");
        System.out.println("|  display drawing and stop the program  |");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("| add rectangle x y width height color   |");
        System.out.println("| add circle x y radius color            |");
        System.out.println("| add square x y side color              |");
        System.out.println("| show                                   |");
        System.out.println("| stop                                   |");
        System.out.println("| clear                                  |");
        System.out.println("| delete x y                             |");
        System.out.println("| move x y                               |");
        System.out.println("| help                                   |");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
    }

    /**
     * Test parameter for square and circle.
     *
     * @param answer The command.
     * @return The command with checked parameters.
     */
    public String[] addSquareOrCircle(String[] answer) {
        Boolean badAnswer;
        int numParam = 6;
        do {
            badAnswer = (answer.length != numParam);
            if (!badAnswer) {
                try {
                    Integer.parseInt(answer[2]);
                    Integer.parseInt(answer[3]);
                    Integer.parseInt(answer[4]);
                    char charAt = answer[5].charAt(0);
                } catch (NumberFormatException e) {
                    badAnswer = true;
                    System.out.println("You need to put 3 integer and 1 char."
                            + Arrays.toString(answer));
                }
            } else {
                System.out.println("Bad parameter. "
                        + "Put x y side/radius and color. [2 3 1 s] : ");
                answer = in.nextLine().split(" ");
                answer[answer.length - 1] = answer[3];
                answer[answer.length - 2] = answer[2];
                answer[answer.length - 3] = answer[1];
                answer[answer.length - 4] = answer[0];
            }
        } while (badAnswer);
        return answer;
    }

    /**
     * Add a square into an asciipaint.
     *
     * @param command The command to add square.
     */
    public void addSquare(String[] command) {
        String[] answer = addSquareOrCircle(command);
        asciiPaint.newSquare(Integer.parseInt(answer[2]),
                Integer.parseInt(answer[3]),
                Integer.parseInt(answer[4]),
                answer[5].charAt(0));
        System.out.println("The square has been added.");

    }

    /**
     * Add a circle into an asciipaint.
     *
     * @param command The command to add circle.
     */
    public void addCircle(String[] command) {
        String[] answer = addSquareOrCircle(command);
        asciiPaint.newCircle(Integer.parseInt(answer[2]),
                Integer.parseInt(answer[3]),
                Integer.parseInt(answer[4]),
                answer[5].charAt(0));
        System.out.println("The circle has been added.");
    }

    /**
     * Add a rectangle into an asciipaint.
     *
     * @param command The command to add rectangle.
     */
    public void addRectangle(String[] answer) {
        int numParam = 7, x = 0, y = 0, width = 0, height = 0;
        Boolean badAnswer;
        char color = '-';
        do {
            badAnswer = (answer.length != numParam);
            if (!badAnswer) {
                try {
                    x = Integer.parseInt(answer[2]);
                    y = Integer.parseInt(answer[3]);
                    width = Integer.parseInt(answer[4]);
                    height = Integer.parseInt(answer[5]);
                    color = answer[6].charAt(0);
                } catch (NumberFormatException e) {
                    badAnswer = true;
                    System.out.println("You need to put 4 integer and 1 char."
                            + Arrays.toString(answer));
                }
            } else {
                System.out.println("Put x y width height and color. [2 3 1 4 r] : ");
                answer = in.nextLine().split(" ");
                answer[answer.length - 1] = answer[4];
                answer[answer.length - 2] = answer[3];
                answer[answer.length - 3] = answer[2];
                answer[answer.length - 4] = answer[1];
                answer[answer.length - 6] = answer[0];
            }
        } while (badAnswer);
        asciiPaint.newRectangle(x, y, width, height, color);
        System.out.println("The rectangle has been added.");
    }

    /**
     * Process commands.
     */
    public void insertCommand() {
        Boolean stop = false;
        String[] command = new String[7];
        do {
            System.out.println("Insert command : ");
            command = in.nextLine().split(" ");
            switch (command[0].toLowerCase()) {
                case "add":
                    addShape(command);
                    break;
                case "stop":
                    stop = true;
                    break;
                case "show":
                    show();
                    break;
                case "help":
                    introduce();
                    break;
                case "clear":
                    resetAscii();
                    break;
            }
        } while (!stop);

    }

    /**
     * Add shapes into asciipaint.
     *
     * @param command The command.
     */
    private void addShape(String[] command) {
        switch (command[1].toLowerCase()) {
            case "rectangle":
                addRectangle(command);
                break;
            case "square":
                addSquare(command);
                break;
            case "circle":
                addCircle(command);
                break;
        }
    }

    /**
     * Clear all shapes of the asciipaint.
     */
    public void resetAscii() {
        for (int i = 0; i < asciiPaint.getHeight(); i++) {
            for (int j = 0; j < asciiPaint.getWidth(); j++) {
                try {
                    asciiPaint.removeShapeAt(i, j);
                } catch (IllegalArgumentException e) {
                }
            }
        }
    }
}
