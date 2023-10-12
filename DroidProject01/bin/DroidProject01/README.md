# Internship Application Portal

## Description
The Internship Application Portal is designed to bridge the gap between employers seeking interns and applicants looking for internship opportunities. The portal revolves around three primary data structures: `Employer`, `JobListing`, and `Applicant`.

## Features
- Employers can post and manage multiple job listings.
- Job listings are tied to a specific employer and display essential job details such as title and description.
- Applicants can apply to specific job listings, attaching their details and resume link.

## Setup and Installation

### Prerequisites
- Ensure you have Java installed (Java 8 or later is recommended).
- [Optional] A database setup if persistence is integrated.

### Installation Steps
1. Clone the repository: `git clone [repository-url]`
2. Navigate to the project directory: `cd internship-application-portal`
3. Compile the code: `javac *.java` (Or use a build tool if integrated)
4. Run the application: `java Main` (Assuming `Main` is the entry point)

## How to Use

### For Employers:
1. **Create an Employer**: Instantiate an `Employer` object and set its attributes.
```java
Employer employer = new Employer();
employer.setName("XYZ Corp.");
```

2. **Add a Job Listing**: Call the `addJobListing` method on the Employer object.
```java
JobListing job = new JobListing(1, "Software Intern", "Description here");
employer.addJobListing(job);
```

3. **View All Job Listings**: Retrieve the list of job listings associated with an employer.
```java
List<JobListing> listings = employer.getJobListings();
```

4. **Delete a Job Listing**: Use the `removeJobListing` method on the Employer object.
```java
employer.removeJobListing(job);
```

### For Applicants:

1. **Apply for a Job**: Create an `Applicant` object and apply using the `apply` method on the JobListing object.
```java
Applicant applicant = new Applicant();
applicant.setName("John Doe");
applicant.setEmail("john.doe@example.com");
applicant.setResumeLink("http://example.com/resume.pdf");

job.addApplicant(applicant);
```

2. **View All Applicants for a Job**: Retrieve the list of applicants for a specific job listing.
```java
List<Applicant> applicants = job.getApplicants();
```

## Testing
Unit tests are provided for validation logic, especially for the `apply` method. Ensure to run tests regularly to avoid regressions.

## Future Enhancements
- Integrate with a database for persistent storage.
- Add user authentication and authorization for added security.
- Expose functionalities through a REST API for broader integration possibilities.

