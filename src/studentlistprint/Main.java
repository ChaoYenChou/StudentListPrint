package studentlistprint;

public class Main {

    public static void main(String[] args) {
        //store and print the student list
        //testing
        Student[] list = new Student[3]; //declaration array of objects
        Student s1 = new Student();
        s1.setName("Peter");
        s1.setAge(21);
        Student s2 = new Student();
        s2.setName("John");
        s2.setAge(19);
        Student s3 = new Student();
        s3.setName("Pretty");
        s3.setAge(20);
        
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        for (Student item:list){
            System.out.println(item.getName() + " " + item.getAge());
        }
    }
    
}
