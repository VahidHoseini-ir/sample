package com.example.mobile1;

public class student {
    private String name;
    private String family;
    private String major;
    private String age;
    private String idNumber;

    public student(String name, String family, String major, String age, String idNumber) {
        this.name = name;
        this.family = family;
        this.major = major;
        this.age = age;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", major='" + major + '\'' +
                ", age='" + age + '\'' +
                ", idNumber='" + idNumber + '\'' +
                '}';
    }
}
