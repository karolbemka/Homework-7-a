package com.infoshareacademy.model;

        import static java.util.stream.Collectors.toList;

        import java.util.List;
        import javax.persistence.Column;
        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.GenerationType;
        import javax.persistence.Id;
        import javax.persistence.ManyToMany;
        import javax.persistence.Table;
        import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TECHERS")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pesel")
    private String pesel;

    @Column(name = "name", length = 20)
    @NotNull
    private String name;

    @Column(name = "surname", length = 20)
    @NotNull
    private String surname;

    @ManyToMany(mappedBy = "teachers")
    private List<Student> courses;


    public Teacher() {
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Student> getCourses() {
        return courses;
    }

    public void setCourses(List<Student> courses) {
        this.courses = courses;
    }


        @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Course{");
        sb.append("id=").append(pesel);
        sb.append(", name='").append(name).append('\'');
        sb.append(", students=").append(courses
                .stream()
                .map(Student::getId)
                .collect(toList())
        );
        sb.append('}');
        return sb.toString();
    }



//    public Course(String name) {
//        this.name = name;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public List<Student> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<Student> students) {
//        this.students = students;
//    }
//
//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("Course{");
//        sb.append("id=").append(id);
//        sb.append(", name='").append(name).append('\'');
//        sb.append(", students=").append(students
//                .stream()
//                .map(Student::getId)
//                .collect(toList())
//        );
//        sb.append('}');
//        return sb.toString();
//    }

}