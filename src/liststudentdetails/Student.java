/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liststudentdetails;

/**
 *
 * @author SAHNAVAZ CHOKSI
 */
public class Student {
    private String name;
    private int sid;
    private float fee;

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public int getSid() {
        return sid;
    }
}
