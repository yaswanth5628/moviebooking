package model;
public class Customer extends Person {
    private int customerId;
    private String phone;
    public Customer() {
    }
    public Customer(int customerId, String name, int age, String phone) {
        super(name, age);
        this.customerId = customerId;
        this.phone = phone;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void display() {
        super.display();
        System.out.println("Customer ID : " + customerId);
        System.out.println("Phone : " + phone);
    }
}