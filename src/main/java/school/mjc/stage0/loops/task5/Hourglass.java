package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print("8");
        }
        System.out.println();

        for (int i = 1; i <= height / 2 - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < height - 2 * i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

        if (height % 2 != 0) {
            for (int i = 0; i < height / 2; i++) {
                System.out.print(" ");
            }
            System.out.println("8");
        }

        for (int i = height / 2 - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < height - 2 * i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

        for (int i = 0; i < height; i++) {
            System.out.print("8");
        }
        System.out.println();
    }
}
