package com.interview.codinggame.algorithm;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BraRobotiqueCarton {

    public static void main(String[] args) {

    }

    enum Command {
        RIGHT, LEFT, PICK, PLACE;
    }

    static String solve(int clawPos, int[] boxes, boolean boxInClaw) {
        int nbPiles = boxes.length;
        int nbBoitesTotal = Arrays.stream(boxes).sum();
        int nbBoitesParPile = nbBoitesTotal / nbPiles;
        int nbPilesPleines = nbBoitesTotal % nbPiles;

        int pileCourante = clawPos;
        int nbBoitesCourant = boxInClaw ? 1 : 0;
        Command[] commands = new Command[200];
        int nbCommands = 0;

        while (true) {
            if (nbBoitesCourant == 0) {
                if (nbPilesPleines > 0) {
                    if (pileCourante < nbPiles - 1) {
                        pileCourante++;
                        commands[nbCommands++] = Command.RIGHT;
                    } else {
                        pileCourante--;
                        commands[nbCommands++] = Command.LEFT;
                    }
                    nbPilesPleines--;
                    nbBoitesCourant = nbBoitesParPile + 1;
                    commands[nbCommands++] = Command.PICK;
                } else {
                    if (pileCourante > 0) {
                        pileCourante--;
                        commands[nbCommands++] = Command.LEFT;
                    } else {
                        break;
                    }
                }
            } else {
                int nbBoitesRestantes = nbBoitesTotal - (nbCommands - 1);
                if (nbBoitesCourant == nbBoitesParPile && nbBoitesRestantes <= nbPiles) {
                    break;
                } else if (nbBoitesCourant < nbBoitesParPile && (pileCourante > 0 || nbPilesPleines > 0)) {
                    if (pileCourante > 0) {
                        pileCourante--;
                        commands[nbCommands++] = Command.LEFT;
                    } else {
                        pileCourante++;
                        commands[nbCommands++] = Command.RIGHT;
                        nbPilesPleines--;
                    }
                    nbBoitesCourant++;
                    commands[nbCommands++] = Command.PICK;
                } else if (pileCourante < nbPiles - 1) {
                    pileCourante++;
                    commands[nbCommands++] = Command.RIGHT;
                    commands[nbCommands++] = Command.PLACE;
                    nbBoitesCourant--;
                } else {
                    pileCourante--;
                    commands[nbCommands++] = Command.LEFT;
                    commands[nbCommands++] = Command.PLACE;
                    nbBoitesCourant--;
                }
            }
        }

        return Arrays.stream(commands, 0, nbCommands)
                .map(Command::toString)
                .collect(Collectors.joining(" "));
    }

}


