package tp5.Strudent_Degetize;

import java.util.Random;

public class Student {
    int note;
    int id;
    String name;

    public Student(int note,
            int id,
            String name) {
        this.id = new Random().nextInt(1000);
        this.name = name;
        this.note = note;
    }

}
