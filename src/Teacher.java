/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;

public class Teacher extends Person {
    ArrayList<String> courses = new ArrayList<>();

    public Teacher(String name, String address) {
        super(name, address);
    }

    public boolean addCourse(String course) {
        if (!courses.contains(course)) {
            courses.add(course);
            return true;
        }
        return false;
    }

    public boolean removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }
}
