package DroidProject01;

import java.util.ArrayList;
import java.util.List;

public class JobListing {

    private int id;
    private int employerId;
    private String jobTitle;
    private String jobDescription;
    private List<Aplicant> applicants;

    // Default constructor
    public JobListing() {
        this.applicants = new ArrayList<>();
    }

    // Parameterized constructor
    public JobListing(int id, int employerId, String jobTitle, String jobDescription) {
        this.id = id;
        this.employerId = employerId;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.applicants = new ArrayList<>();
    }

    // Getter and Setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployerId() {
        return employerId;
    }

    public void setEmployerId(int employerId) {
        this.employerId = employerId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public List<Aplicant> getApplicants() {
        return applicants;
    }

    public void setApplicants(List<Aplicant> applicants) {
        this.applicants = applicants;
    }

    // Method to add an applicant to the job listing
    public void addApplicant(Aplicant applicant) {
        if (applicant != null) {
            this.applicants.add(applicant);
        }
    }

    // Method to remove an applicant from the job listing
    public void removeApplicant(Aplicant applicant) {
        if (applicant != null) {
            this.applicants.remove(applicant);
        }
    }

    @Override
    public String toString() {
        return "JobListing{" +
                "id=" + id +
                ", employerId=" + employerId +
                ", jobTitle='" + jobTitle + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", applicants=" + applicants +
                '}';
    }
}
