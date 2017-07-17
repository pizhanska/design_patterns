package com.cdp.patterns.creational.builder;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    private Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private int age;
        private String gender;

        public Builder(){
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder gender(String gender){
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(firstName, lastName, age, gender);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getFullName(){
        return getFirstName() + " "
                + getLastName();
    }

    @Override
    public String toString(){
        return getFirstName() + " "
                + getLastName() + ", "
                + getAge() + ", "
                + getGender() + "\n";
    }
}
