package practice.recursion;

public class TowersOfHanoi {

    public static void solveTowersOfHanoi(int n, char sourceRod, char destinationRod,
                                          char tempRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + sourceRod + " to rod " + destinationRod);
            return;
        }

        // Move n-1 disks from sourceRod to tempRod using destinationRod as auxiliary
        solveTowersOfHanoi(n - 1, sourceRod, tempRod, destinationRod);

        // Move the nth disk from sourceRod to destinationRod
        System.out.println("Move disk " + n + " from rod " + sourceRod + " to rod " + destinationRod);

        // Move n-1 disks from tempRod to destinationRod using sourceRod as auxiliary
        solveTowersOfHanoi(n - 1, tempRod, destinationRod, sourceRod);
    }

    public static void main(String[] args) {
        int numberOfDisks = 3; // You can change this number to solve for a different number of disks
        solveTowersOfHanoi(numberOfDisks, 'A', 'C', 'B');
    }
}

