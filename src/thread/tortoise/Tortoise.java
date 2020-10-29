/*   Created by IntelliJ IDEA.
 *   Author: Kashish Sharma
 *   Date: 29/10/2020
 *   Time: 9:30 PM
 *   File: Tortoise.java
 */
package thread.Tortoise;

import javax.swing.*;

public class Tortoise extends Thread {

    private static final int MILE_STONES = 5;

    public Tortoise() {
        super("Tortoise");

    }

    @Override
    public void run() {
        for (int pointReached = 0; pointReached < MILESTONES; pointReached++) {
            switch (pointReached) {
                case 0:
                    System.out.println("The Tortoise just began his race from start line!");
                    break;
                case 1:
                    System.out.println("The Tortoise reached the Cool River!");
                    break;
                case 2:
                    System.out.println("The Tortoise reached the Mountain Hill!");
                    break;
                case 3:
                    System.out.println("The Tortoise reached the Big Oak Tree!");
                    System.out.println("The Tortoise feels tired so going to sleep!");
                    try {
                        Thread.sleep(15000L);
                    } catch (InterruptedException e) {
                        System.err.println("The Tortoise just woke up!");
                    }
                    break;
                case 4:
                    System.out.println("The Tortoise reached the finish line!");
                    break;
            }
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                System.err.println("The Tortoise went wrong!");
            }
        }
        JOptionPane.showConfirmDialog(
                null,
                "Tortoise completed the race!",
                "Tortoise",
                JOptionPane.OK_CANCEL_OPTION
        );

    }
}
