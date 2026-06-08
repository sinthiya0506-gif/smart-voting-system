import java.util.Scanner;

class SmartVotingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] candidates = {"sinthu", "Vijay", "Priya"};
        int[] votes = {0, 0, 0};

        boolean hasVoted = false;

        System.out.println("===== SMART VOTING SYSTEM =====");

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("You are not eligible to vote.");
        } else {

            System.out.println("\nCandidates List:");
            for (int i = 0; i < candidates.length; i++) {
                System.out.println((i + 1) + ". " + candidates[i]);
            }

            if (!hasVoted) {
                System.out.print("Choose candidate number to vote: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        votes[0]++;
                        break;
                    case 2:
                        votes[1]++;
                        break;
                    case 3:
                        votes[2]++;
                        break;
                    default:
                        System.out.println("Invalid choice");
                        return;
                }

                hasVoted = true;
                System.out.println(name + ", Your vote submitted successfully!");
            } else {
                System.out.println("You already voted!");
            }

            System.out.println("\n===== RESULT =====");
            for (int i = 0; i < candidates.length; i++) {
                System.out.println(candidates[i] + " : " + votes[i] + " votes");
            }
        }

        sc.close();
    }
}