
package ClassAbstractTP6.classes;

import ClassAbstractTP6.abstractclasses.Employee;
import ClassAbstractTP6.interfaces.Manager;

public class Tester  implements Manager {

    private String project;
    private String name;
    private int age;

    public Tester(String name, int age,String project) {
        this.name = name;
        this.age = age;
        this.project = project;
    }
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

 
    public void setAge(int age) {
        this.age = age;
    }
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public void approveLeave(String employeeName) {
        System.out.println("Leave approved for developer: " + employeeName);
    }

    public void testProject() {
        System.out.println("Testing project: " + project);
    }
    
    public void manage() {
        System.out.println("Managing the testing process for project: " + project);
    }

    public void displayTesterDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    
        System.out.println("Assigned Project: " + project);

        
    }
}
