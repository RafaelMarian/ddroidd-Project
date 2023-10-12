package DroidProject01;

import java.util.ArrayList;
import java.util.List;

public class Employer {

    private int id;
    private String name;
    private List<JobListing> jobListings;

    // Default constructor
    public Employer() {
        this.jobListings = new ArrayList<>();
    }

    // Parameterized constructor
    public Employer(int id, String name) {
        this.id = id;
        this.name = name;
        this.jobListings = new ArrayList<>();
    }

    // Getter and Setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<JobListing> getJobListings() {
        return jobListings;
    }

    public void setJobListings(List<JobListing> jobListings) {
        this.jobListings = jobListings;
    }

    // Method to add a job listing
    public void addJobListing(JobListing jobListing) {
        if (jobListing != null) {
            this.jobListings.add(jobListing);
        }
    }

    // Method to remove a job listing
    public void removeJobListing(JobListing jobListing) {
        if (jobListing != null) {
            this.jobListings.remove(jobListing);
        }
    }

    @Override
    public String toString() {
        return "Employer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jobListings=" + jobListings +
                '}';
    }
}
