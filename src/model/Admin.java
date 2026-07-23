package model;

public class Admin extends Person {

    private int adminId;

    public Admin() {
    }

    public Admin(int adminId, String name, int age) {
        super(name, age);
        this.adminId = adminId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public void display() {
        super.display();
        System.out.println("Admin ID : " + adminId);
    }
}