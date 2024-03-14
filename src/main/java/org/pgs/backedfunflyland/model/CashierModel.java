    package org.pgs.backedfunflyland.model;

    import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.GenerationType;
    import jakarta.persistence.Id;
    import java.util.Date;

    @Entity
    public class CashierModel {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String username;
        private String password;
        private double salary;
        private String email;
        private String mobileNumber;
        private Date joiningDate;

        // Constructors
        public CashierModel() {}

        public CashierModel(Long id, String username, String password, double salary, String email, String mobileNumber, Date joiningDate) {
            this.id = id;
            this.username = username;
            this.password = password;
            this.salary = salary;
            this.email = email;
            this.mobileNumber = mobileNumber;
            this.joiningDate = joiningDate;
        }

        // Getters and setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getMobileNumber() {
            return mobileNumber;
        }

        public void setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
        }

        public Date getJoiningDate() {
            return joiningDate;
        }

        public void setJoiningDate(Date joiningDate) {
            this.joiningDate = joiningDate;
        }


    }
