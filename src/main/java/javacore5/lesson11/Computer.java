/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore5.lesson11;

/**
 *
 * @author Павел
 */                 // Мы больше не сможем вставить другие классы, которые не являются наследником Инпута или самим Инпутом
public class Computer<T extends Input, V extends Output> {

    private T input;
    private V output;
    
    public Computer(T input) {
        this.input = input;
    }
    
    public Computer(T input, V output) {
        this.input = input;
        this.output = output;
    }

    public V getOutput() {
        return output;
    }

    public void setOutput(V output) {
        this.output = output;
    }
       
    public T getInput() {
        return input;
    }
    
    public void setInput(T input) {
        this.input = input;
    }
    
}
