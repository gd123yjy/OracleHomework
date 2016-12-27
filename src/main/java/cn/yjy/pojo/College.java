package cn.yjy.pojo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Set;

/**
 * Created by yjy on 16-12-25.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonRootName("college")
public class College {

    private int number;
    private String name;
    private int borderline;
    private int tagetEnroll;
    private int actualEnroll;

    private Set<Student> students;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBorderline() {
        return borderline;
    }

    public void setBorderline(int borderline) {
        this.borderline = borderline;
    }

    public int getTagetEnroll() {
        return tagetEnroll;
    }

    public void setTagetEnroll(int tagetEnroll) {
        this.tagetEnroll = tagetEnroll;
    }

    public int getActualEnroll() {
        return actualEnroll;
    }

    public void setActualEnroll(int actualEnroll) {
        this.actualEnroll = actualEnroll;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public int hashCode() {
        return getNumber();
    }

    @Override
    public boolean equals(Object obj) {
        try {
            return ((College)obj).getNumber() == this.getNumber();
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
