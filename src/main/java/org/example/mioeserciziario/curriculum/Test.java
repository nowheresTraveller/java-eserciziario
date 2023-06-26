package org.example.mioeserciziario.curriculum;

public class Test {

    public static void main(String[] args) {
        Curriculum cv= new Curriculum("Giovanni");
        Curriculum.Job job1 = cv.addJob("cameriere",2012);
        Curriculum.Job job2 = cv.addJob("scaffalista", 2008);
        Curriculum.Job job3 = cv.addJob("programmatore",2022);
        Curriculum.Job job4= cv.new Job("Muratore", 2000);

        System.out.println(job1.next());
        System.out.println(job4.next());
    }
}
