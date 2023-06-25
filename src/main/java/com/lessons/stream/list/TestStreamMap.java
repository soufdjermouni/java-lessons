package com.lessons.stream.list;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamMap {

    public static void main(String[] args) {

        List<String> alpha = Arrays.asList("a", "b", "c", "d");
        List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);

        List<Staff> staff = Arrays.asList(
                new Staff("mkyong", 30, new BigDecimal(10000)),
                new Staff("jack", 27, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000))
        );
        List<String> collect2 = staff.stream().map(x -> x.getName()).collect(Collectors.toList());
        System.out.println(collect2);

    }

    public static class Staff {

        private String name;
        private int age;
        private BigDecimal salary;

        public Staff(String name, int age, BigDecimal salary) {
            this.name = name;
            this.age=age;
            this.salary=salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BigDecimal getSalary() {
            return salary;
        }

        public void setSalary(BigDecimal salary) {
            this.salary = salary;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
