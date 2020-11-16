package LibrarySystem;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;

    public Student(int id, String name) {
        setId(id);
        setName(name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "\n\nName: " + getName();
    }
}