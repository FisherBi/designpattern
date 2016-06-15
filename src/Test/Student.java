package Test;

import java.io.Serializable;

/**
 * Created by fisbii on 16-6-14.
 */
public class Student implements Serializable {
    int age;
    String name;
    Student(int age, String name){
        this.age = age;
        this.name = name;
    }
}
