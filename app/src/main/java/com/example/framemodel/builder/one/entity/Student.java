package com.example.framemodel.builder.one.entity;

public class Student {
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String toString() {
        return name + "-" + age + "-" + sex;
    }
    public Student(){}
    public Student(Student temp){
        this.name = temp.name;
        this.age = temp.age;
        this.sex = temp.sex;
    }
    public static class Builder {
        Student student;

        public Builder() {
            student = new Student();
        }

        public Builder setName(String name) {
            student.name = name;
            return this;
        }

        public Builder setAge(int age) {
            student.age = age;
            return this;
        }

        public Builder setSex(String sex) {
            student.sex = sex;
            return this;
        }

        public Student create() {
            Student student1 = new Student(student);
            return student1;
        }
    }
}
