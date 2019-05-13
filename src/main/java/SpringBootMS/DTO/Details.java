package SpringBootMS.DTO;

public class Details {

    String firstname;
    String lastname;
    String occupation;
    String salary;

    public Details(String firstname,String lastname, String occupation, String salary) {

        //super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.occupation = occupation;
        this.salary = salary;
    }


        public String getFirstname() {
            return firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public String getOccupation() {
            return occupation;
        }

        public String getSalary(){
        return salary;
    }
}
