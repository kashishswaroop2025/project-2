import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PolicyDemo {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Policy> policies = new ArrayList<Policy>();
        int smokerCount = 0;
        int nonSmokerCount = 0;

        File file = new File("PolicyInformation.txt");
        Scanner input = new Scanner(file);

        while (input.hasNextLine()) {
            int number = Integer.parseInt(input.nextLine());
            String provider = input.nextLine();
            String firstName = input.nextLine();
            String lastName = input.nextLine();
            int age = Integer.parseInt(input.nextLine());
            String smokingStatus = input.nextLine();
            double height = Double.parseDouble(input.nextLine());
            double weight = Double.parseDouble(input.nextLine());

            Policy p = new Policy(number, provider, firstName, lastName, age, smokingStatus, height, weight);
            policies.add(p);
        }

        input.close();

        for (int i = 0; i < policies.size(); i++) {
            Policy p = policies.get(i);

            System.out.println("Policy Number: " + p.getPolicyNumber());
            System.out.println("Provider Name: " + p.getProviderName());
            System.out.println("Policyholder's First Name: " + p.getPolicyholderFirstName());
            System.out.println("Policyholder's Last Name: " + p.getPolicyholderLastName());
            System.out.println("Policyholder's Age: " + p.getPolicyholderAge());
            System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + p.getSmokingStatus());
            System.out.println("Policyholder's Height: " + p.getHeight() + " inches");
            System.out.println("Policyholder's Weight: " + p.getWeight() + " pounds");
            System.out.printf("Policyholder's BMI: %.2f\n", p.getBMI());
            System.out.printf("Policy Price: $%.2f\n", p.getPolicyPrice());
            System.out.println();

            if (p.getSmokingStatus().equalsIgnoreCase("smoker")) {
                smokerCount++;
            } else {
                nonSmokerCount++;
            }
        }

        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}
