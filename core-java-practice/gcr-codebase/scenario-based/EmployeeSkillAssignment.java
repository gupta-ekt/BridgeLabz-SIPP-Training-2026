import java.util.Scanner;

public class EmployeeSkillAssignment {

    static void findTeams(int[] skills, int target, int index,
                          int currentSum, String team) {

        if (currentSum == target) {
            System.out.println("[" + team + "]");
            return;
        }

        if (index == skills.length || currentSum > target) {
            return;
        }

        if (team.equals("")) {
            findTeams(skills, target, index + 1,
                    currentSum + skills[index],
                    String.valueOf(skills[index]));
        } else {
            findTeams(skills, target, index + 1,
                    currentSum + skills[index],
                    team + "," + skills[index]);
        }

        findTeams(skills, target, index + 1,
                currentSum,
                team);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] skills = new int[n];

        System.out.println("Enter skill scores:");

        for (int i = 0; i < n; i++) {
            skills[i] = sc.nextInt();
        }

        System.out.print("Enter target skill: ");
        int target = sc.nextInt();

        System.out.println("Possible Teams:");

        findTeams(skills, target, 0, 0, "");

        sc.close();
    }
}