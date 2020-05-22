package Example6;

import java.util.Objects;

public class Student02 {
    private String name;

    public Student02() {
    }

    public Student02(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student02 student02 = (Student02) o;
        return Objects.equals(name, student02.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
