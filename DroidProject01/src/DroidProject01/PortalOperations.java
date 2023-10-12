package DroidProject01;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PortalOperations {
    private List<Employer> employers;

    public PortalOperations() {
        this.employers = new ArrayList<>();
    }

    // Validate and add a new job listing to the employer
    public void addJobListing(int employerId, String jobTitle, String jobDescription) {
        Employer employer = findEmployerById(employerId);
        if (employer != null) {
            JobListing jobListing = new JobListing();
            jobListing.setId(generateJobListingId());  // Assuming a method to generate unique IDs
            jobListing.setEmployerId(employerId);
            jobListing.setJobTitle(jobTitle);
            jobListing.setJobDescription(jobDescription);
            employer.getJobListings().add(jobListing);
        }
    }

    // Validate input and add an applicant to the job listing
    public void apply(int jobListingId, String name, String email, String resumeLink) {
        JobListing jobListing = findJobListingById(jobListingId);
        if (jobListing != null) {
            Aplicant applicant = new Aplicant();
            applicant.setId(generateApplicantId());  // Assuming a method to generate unique IDs
            applicant.setName(name);
            applicant.setEmail(email);
            applicant.setResumeLink(resumeLink);
            applicant.setJobListingId(jobListingId);
            jobListing.getApplicants().add(applicant);
        }
    }

    // Return job listings for a given employer
    public List<JobListing> getJobListingsForEmployer(int employerId) {
        return findEmployerById(employerId).getJobListings();
    }

    // Return all applicants for a given employer
    public List<Aplicant> getApplicantsForEmployer(int employerId) {
        return findEmployerById(employerId).getJobListings()
            .stream()
            .flatMap(job -> job.getApplicants().stream())
            .collect(Collectors.toList());
    }

    // Return applicants for a given job listing
    public List<Aplicant> getApplicantsForJobListing(int jobListingId) {
        JobListing jobListing = findJobListingById(jobListingId);
        if (jobListing != null) {
            return jobListing.getApplicants();
        }
        return new ArrayList<>();
    }

    // Delete a specific job listing
    public void deleteJobListing(int jobListingId) {
        for (Employer employer : employers) {
            Optional<JobListing> jobToRemove = employer.getJobListings()
                .stream()
                .filter(job -> job.getId() == jobListingId)
                .findFirst();

            jobToRemove.ifPresent(employer.getJobListings()::remove);
        }
    }

    // Utility method to find an employer by its ID
    private Employer findEmployerById(int employerId) {
        return employers.stream()
            .filter(employer -> employer.getId() == employerId)
            .findFirst()
            .orElse(null);
    }

    // Utility method to find a job listing by its ID
    private JobListing findJobListingById(int jobListingId) {
        for (Employer employer : employers) {
            for (JobListing job : employer.getJobListings()) {
                if (job.getId() == jobListingId) {
                    return job;
                }
            }
        }
        return null;
    }

    // Assume a method to generate a unique ID for a job listing
    private int generateJobListingId() {
        return employers.stream()
            .mapToInt(employer -> employer.getJobListings().size())
            .sum() + 1;
    }

    // Assume a method to generate a unique ID for an applicant
    private int generateApplicantId() {
        int count = 0;
        for (Employer employer : employers) {
            for (JobListing job : employer.getJobListings()) {
                count += job.getApplicants().size();
            }
        }
        return count + 1;
    }

    public void addEmployer(Employer employer) {  
    	employers.add(employer);    
    	}

}
