package DroidProject01;

import java.util.List;

public class Tests {
    public static void main(String[] args) {
        // Instantiate PortalOperations and test the methods
        PortalOperations operations = new PortalOperations();

        // Test 1: Add Employers for testing
        Employer employer1 = new Employer(1, "Employer 1");
        Employer employer2 = new Employer(2, "Employer 2");

        operations.addEmployer(employer1);
        operations.addEmployer(employer2);

        // Validate if employers were added
//        if (operations.getEmployers().size() == 2) {
//            System.out.println("Test 1 Passed: Employers added!");
//        } else {
//            System.out.println("Test 1 Failed: Issue adding employers!");
//        }

        // Test 2: Add job listings and check if they're added
        operations.addJobListing(1, "Internship 1", "Description for Internship 1");
        operations.addJobListing(1, "Internship 2", "Description for Internship 2");

        // Validate if job listings were added
        if (operations.getJobListingsForEmployer(1).size() == 2) {
            System.out.println("Test 2 Passed: Job listings added!");
        } else {
            System.out.println("Test 2 Failed: Issue adding job listings!");
        }

        // Test 3: Apply for a job and validate
        operations.apply(1, "John", "john@example.com", "link-to-resume");

        // Check if the applicant has been added
        if (!operations.getApplicantsForJobListing(1).isEmpty()) {
            System.out.println("Test 3 Passed: Applicant added!");
        } else {
            System.out.println("Test 3 Failed: Issue adding applicant!");
        }

  
    }
}