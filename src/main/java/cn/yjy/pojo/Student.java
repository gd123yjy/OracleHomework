package cn.yjy.pojo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Date;

/**
 * Created by yjy on 16-12-25.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonRootName("student")
public class Student {

    //student表
    private int number;
    private String name;
    private char gender;
    private int grade;
    //student_will表
    private boolean autoAdjust;
    private College aspiration1;
    private College aspiration2;
    //student_enroll表
    private boolean enroll;
    private College enrollCollege;
    private int enrollAspiration;
    private Date enrollDate;
    private String operator;

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isAutoAdjust() {
        return autoAdjust;
    }

    public void setAutoAdjust(boolean autoAdjust) {
        this.autoAdjust = autoAdjust;
    }

    public College getAspiration1() {
        return aspiration1;
    }

    public void setAspiration1(College aspiration1) {
        this.aspiration1 = aspiration1;
    }

    public College getAspiration2() {
        return aspiration2;
    }

    public void setAspiration2(College aspiration2) {
        this.aspiration2 = aspiration2;
    }

    public boolean isEnroll() {
        return enroll;
    }

    public void setEnroll(boolean enroll) {
        this.enroll = enroll;
    }

    public College getEnrollCollege() {
        return enrollCollege;
    }

    public void setEnrollCollege(College enrollCollege) {
        this.enrollCollege = enrollCollege;
    }

    public int getEnrollAspiration() {
        return enrollAspiration;
    }

    public void setEnrollAspiration(int enrollAspiration) {
        this.enrollAspiration = enrollAspiration;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public int hashCode() {
        return getNumber();
    }

    @Override
    public boolean equals(Object obj) {
        try {
            return ((Student)obj).getNumber() == this.getNumber();
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
