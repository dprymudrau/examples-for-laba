package com.solvd.course.designpatterns.classicbuilder;

public class User {
    private int age;
    private String firstName;
    private String lastName;

    private User() {

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

    public static Builder builder() {
        return new User().new Builder();
    }

    public class Builder {
        private Builder() {

        }

        public Builder setAge(int age) {
            User.this.age = age;
            return this;
        }

        public Builder setFirstName(String firstName) {
            User.this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            User.this.lastName = lastName;
            return this;
        }

        public User build() {
            return User.this;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
