package tp4;

public class Car {
    String Car_type;
    int year;
    String remark;

    public Car(String Car_type,
            int year,
            String remark) {
        this.Car_type = Car_type;
        this.remark = remark;
        this.year = year;
    }

    public void check_Remark() {
        if (year < 2019) {
            remark = "This car needs scanner verification";
        }
    }

    public void get_Info() {
        System.out.println("the type is : " + Car_type);
        System.out.println("the year is : " + year);
       if (year<2019) {
check_Remark();        
       }
            System.out.println("the remark is : " + remark);
        
    }

    public static void main(String[] args) {
        Car Car1 = new Car("peugot", 2006, "This car doesn't\r\n" + //
                "need a scanner verification");
        // Car1.check_Remark();
        Car1.get_Info();
    }

}
