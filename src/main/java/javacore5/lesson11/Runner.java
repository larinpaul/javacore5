/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore5.lesson11;

import java.util.ArrayList;

/**
 *
 * @author Павел
 */
public class Runner {
    
    public static void main(String[] args) {
        
        KeyBoard keyBoard = new KeyBoard();
        Computer<KeyBoard, Monitor> computer = new Computer<>(keyBoard);
        KeyBoard input = computer.getInput();
        input.exit();
        
        Computer<KeyBoard, Tv> keyBoardComputer = new Computer<>();
        keyBoardComputer.setInput(keyBoard);
        
        Computer<Mouse, Monitor> mouseComputer = new Computer<>();
        mouseComputer.getInput().scroll();
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
    }
    

    
}
