package java_short_video.collections_patika.treeSet;

public class Student {

    private String name;
    private int note;

    public Student(String name, int note) {
        setName(name);
        setNote(note);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
