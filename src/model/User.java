package model;

import java.util.Date;

// Builder Pattern
public class User {
    private final int id;
    private final String role;
    private final String firstName;
    private final String prefix;
    private final String surName;
    private final int bsnNumber;
    //private final Date birthDate;
    public static class UserBuilder {
        private int id;
        private String role;
        private String firstName;
        private String prefix;
        private String surName;
        private int bsnNumber;
        private Date birthDate;


        public UserBuilder(int id) {
            this.id = id;
        }
        public UserBuilder id(int val) {
            id = val;
            return this;
        }

        public UserBuilder role(String val) {
            role = val;
            return this;
        }

        public UserBuilder firstName(String val) {
            firstName = val;
            return this;
        }

        public UserBuilder prefix(String val) {
            prefix = val;
            return this;

        }

        public UserBuilder surName(String val) {
            surName = val;
            return this;
        }

        public UserBuilder bsnNumber(int val) {
            bsnNumber = val;
            return this;
        }




        public User build() {
            return new User(this);
        }
    }
    private User (UserBuilder userBuilder) {
        id = userBuilder.id;
        role = userBuilder.role;
        firstName = userBuilder.firstName;
        prefix = userBuilder.prefix;
        surName = userBuilder.surName;
        bsnNumber = userBuilder.bsnNumber;

    }
}
