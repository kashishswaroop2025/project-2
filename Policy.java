public class Policy {
    // Fields
    private int policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String smokingStatus;
    private double height;
    private double weight;

    // No-arg constructor
    public Policy() {
        policyNumber = 0;
        providerName = "";
        policyholderFirstName = "";
        policyholderLastName = "";
        policyholderAge = 0;
        smokingStatus = "";
        height = 0.0;
        weight = 0.0;
    }

    // Constructor with arguments
    public Policy(int number, String provider, String firstName, String lastName, int age, String status, double h, double w) {
        policyNumber = number;
        providerName = provider;
        policyholderFirstName = firstName;
        policyholderLastName = lastName;
        policyholderAge = age;
        smokingStatus = status;
        height = h;
        weight = w;
    }

    // Set methods
    public void setPolicyNumber(int number) {
        policyNumber = number;
    }

    public void setProviderName(String provider) {
        providerName = provider;
    }

    public void setPolicyholderFirstName(String firstName) {
        policyholderFirstName = firstName;
    }

    public void setPolicyholderLastName(String lastName) {
        policyholderLastName = lastName;
    }

    public void setPolicyholderAge(int age) {
        policyholderAge = age;
    }

    public void setSmokingStatus(String status) {
        smokingStatus = status;
    }

    public void setHeight(double h) {
        height = h;
    }

    public void setWeight(double w) {
        weight = w;
    }

    // Get methods
    public int getPolicyNumber() {
        return policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getPolicyholderFirstName() {
        return policyholderFirstName;
    }

    public String getPolicyholderLastName() {
        return policyholderLastName;
    }

    public int getPolicyholderAge() {
        return policyholderAge;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // Method to calculate BMI
    public double getBMI() {
        return (weight * 703) / (height * height);
    }

    // Method to calculate the policy price
    public double getPolicyPrice() {
        double price = 600.0;

        if (policyholderAge > 50) {
            price = price + 75.0;
        }

        if (smokingStatus.equalsIgnoreCase("smoker")) {
            price = price + 100.0;
        }

        double bmi = getBMI();
        if (bmi > 35) {
            price = price + (bmi - 35) * 20;
        }

        return price;
    }
}
