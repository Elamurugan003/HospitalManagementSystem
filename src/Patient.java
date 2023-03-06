/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elamurugan
 */
public class Patient {
    private int age , id ;
    private String name , gender , address , contact ;
    
    public Patient(){
        this.age = 0;
        this.id = 0;
        this.name = "";
        this.gender = "";
        this.address = "";
        this.contact = "";
    }

    public Patient(int age, int id, String name, String gender, String address, String contact) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.contact = contact;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Patient{" + "age=" + age + ", id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", contact=" + contact + '}';
    }   
    
}
