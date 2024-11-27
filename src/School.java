package com.company;

import java.util.Comparator;
import java.lang.String;
/**
 * The School class represents a school with information about its desks, floors, age, rooms, and average marks.
 * It also provides methods to access these properties and includes comparators for sorting by average marks and age.
 */
public class School {

    private int desks;
    private int numoffloors;
    private int age;
    private int rooms;
    private int avgmarks;
    /**
     * Gets the number of desks in the school.
     *
     * @return the number
     */
    public int GetDesks(){
        return desks ;
    }
    /**
     * Gets the number of floors in the school.
     *
     * @return the number
     */
    public int GetNumoffloors(){
        return numoffloors;
    }
    /**
     * Gets the age of the school.
     *
     * @return the number
     */
    public int GetAge(){
        return age;
    }
    /**
     * Gets the rooms of the school.
     *
     * @return the number
     */
    public int GetRooms(){
        return rooms;
    }
    /**
     * Gets the age of the school.
     *
     * @return the number
     */
    public int GetAvgmarks(){
        return avgmarks;
    }
    /**
     * Constructor to initialize the School object with desks, floors, age, rooms, and average marks.
     *
     * @param desks the number of desks in the school
     * @param numoffloors the number of floors in the school
     * @param age the age of the school in years
     * @param rooms the number of rooms in the school
     * @param avgmarks the average marks of students
     */
    public School(int desks ,int numoffloors,int age,int rooms ,int avgmarks){
        this.desks=desks;
        this.numoffloors=numoffloors;
        this.age=age;
        this.rooms=rooms;
        this.avgmarks=avgmarks;
    }



    /**
     * Returns a string representation of the School object with details about desks, floors, age, rooms, and average marks.
     *
     * @return a string
     */
    public String toString() {
        return "Кількість парт = " + this.desks +
                " Кількість поверхів = " + this.numoffloors +
                " Кількість років з моменту відкриття = " + this.age +
                " Кількість кімнат = " + this.rooms +
                " Середня оцінка = " + this.avgmarks;
    }
    /**
     * Comparator to sort School objects by average marks in descending order.
     */
    public static Comparator<School> avgmarksComparator = (e1, e2) -> (e2.GetAvgmarks() - e1.GetAvgmarks());
    /**
     * Comparator to sort School objects by age in ascending order.
     */
    public static Comparator<School> ageComparator = (e1, e2) -> (e1.GetAge() - e2.GetAge());
}

