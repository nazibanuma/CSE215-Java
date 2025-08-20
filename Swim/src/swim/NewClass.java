/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swim;

/**
 *
 * @author User
 */
public class NewClass {

    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin(false);
        try {
            dolphin.swim();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
