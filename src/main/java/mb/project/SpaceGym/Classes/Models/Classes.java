package mb.project.SpaceGym.Classes.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "Classes")
public class Classes {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int classId;

    private String name;
    private Category category;
    private long personId;

    public Classes() {
    }

    public Classes(int id, long personId, Category category, String name) {
        this.classId = id;
        this.personId = personId;
        this.category = category;
        this.name = name;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
