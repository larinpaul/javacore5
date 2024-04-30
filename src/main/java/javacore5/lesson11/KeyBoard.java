/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore5.lesson11;

/**
 *
 * @author Павел
 */
public class KeyBoard implements Input {

    @Override
    public void input() {
        System.out.println("Ввод с клавиатуры");
    }
    
    public void exit() {
        System.out.println("Нажали ctrl alt delete");
    }
    
}
