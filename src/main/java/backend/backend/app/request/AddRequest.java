package backend.backend.app.request;

import java.time.LocalDate;

public class AddRequest {
    private String fullName;
    private String cin;
    private LocalDate birthDate;
    private LocalDate employmentDate;
    private String email;
    private String password;
    private String address;
    private String role;

    // Constructors
    public AddRequest() {
    }

    public AddRequest(String fullName, String cin, LocalDate birthDate, LocalDate employmentDate, String email, String password, String address, String role) {
        this.fullName = fullName;
        this.cin = cin;
        this.birthDate = birthDate;
        this.employmentDate = employmentDate;
        this.email = email;
        this.password = password;
        this.address = address;
        this.role = role;
    }

    // Getters and Setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // toString method (optional for debugging)
    @Override
    public String toString() {
        return "AddRequest{" +
                "fullName='" + fullName + '\'' +
                ", cin='" + cin + '\'' +
                ", birthDate=" + birthDate +
                ", employmentDate=" + employmentDate +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
