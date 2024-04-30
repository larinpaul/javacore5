/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore5.lesson11;


public class Tv implements Output {

    @Override
    public void show() {
        System.out.println("Телевизор показывает");
    }
    
    public void soundOff() {
        System.out.println("Выключили звук у телевизора");
    }
    
}
