package com.Comparable;

import org.jetbrains.annotations.NotNull;

public class Emp implements Comparable {
    String name;
    int age;
    int id;

    public Emp(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Emp e = (Emp) o;

        /*
          if (this.age>e.age)  return 1;
          else if (this.age<e.age)  return -1;
          return 0;
        */

        //  return this.age - e.age;      // for int values of age

          return this.id - e.id;        // for int values of if

       // return this.name.compareTo(e.name);  // for string value
    }
}
