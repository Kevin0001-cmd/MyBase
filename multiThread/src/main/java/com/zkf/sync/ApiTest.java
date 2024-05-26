package com.zkf.sync;

import org.junit.Test;

public class ApiTest {

    @Test
    public void test_sync() {

    }

    class User {
        private int num;

        public synchronized int addUser() {
            num++;
            return num;
        }
    }

    static class Student {
        private static int num;

        public static synchronized int addStudent() {
            num++;
            return num;
        }
    }

    public int addPerson() {
        Person person = new Person();
        int num = 0;
        synchronized (person) {
            person.setId(num++);
        }
        return num;
    }
}
