package tp4;

public class Employer {
    String name;
    String yearOfJoining;
    Number salery;
    String adress;

    public Employer(String name,
            String yearOfJoining,
            Number salery,
            String adress) {
        this.name = name;
        this.salery = salery;
        this.adress = adress;
        this.yearOfJoining = yearOfJoining;
    }

    public void get_Info() {
        System.err.println("the name is : " + name);
        System.out.println("the salery is :" + salery);
        System.out.println("the year of  joining is  : " + yearOfJoining);
        System.err.println("the adress is :" + adress);
    }

    public static void main(String[] args) {
        Employer Employer1 = new Employer("samy", "2018", 2000, "Alger");
        Employer Employer2 = new Employer("moh", "2020", 2550, "usa");
        Employer Employer3 = new Employer("kamara", "2012", 4000, "france");
        System.out.println("-----------------------");
        Employer1.get_Info();
        System.out.println("-----------------------");
        Employer2.get_Info();
        System.out.println("-----------------------");
        Employer3.get_Info();

    }

}
