package ru.orgis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("Player may using slots between 0 to %d,"
                        + "enter number to fire"
                + " -1 to quit%n",
        player.getSlotsCount() - 1
        );

        int slot;

        slot = scanner.nextInt();
        player.shotWithWeapon(slot);

        System.out.println("Game over!");
    }
}