package tp4;

public class StudentG {
    public static class Address {

        String street_name;
        String city;
        String contry;
        String poste_Code;

        public Address(String street_name,
                String city,
                String contry,
                String poste_Code) {
            this.city = city;
            this.contry = contry;
            this.poste_Code = poste_Code;
            this.street_name = street_name;
        }

        public void get_Info() {
            System.out.println("Address Information:");
            System.out.println("Street Name: " + street_name);
            System.out.println("City: " + city);
            System.out.println("Country: " + contry);
            System.out.println("Postal Code: " + poste_Code);
        }
    }

    public static class Student {
        String name;
        String phone;
        String email;
        int idNumber;
        double average;
        Address address;

        public Student(String name,
                String phone,
                String email,
                int idNumber,
                double average, Address address) {
            this.average = average;
            this.email = email;
            this.idNumber = idNumber;
            this.name = name;
            this.phone = phone;
            this.address = address;
        }

        public void get_Info() {
            System.out.println("Student Information:");
            System.out.println("Name: " + name);
            System.out.println("Phone: " + phone);
            System.out.println("Email: " + email);
            System.out.println("ID Number: " + idNumber);
            System.out.println("Average Mark: " + average);
            address.get_Info();
        }

        public static void main(String[] args) {
            Address address_1 = new Address("sanJose", "calefornia", "usa", "12345");
            Address address_2 = new Address("kolly9", "nevada", "usa", "15664");
            Student Student_1 = new Student("kosmo", "234567", "kosmo@yaho.com", 7634, 12.56, address_2);
            Student Student_2 = new Student("pepe", "212577", "pepe@yaho.com", 6543, 15.33, address_1);
            Student_2.get_Info();
            System.out.println("-------------------------");
            Student_1.get_Info();
        }

    }
}