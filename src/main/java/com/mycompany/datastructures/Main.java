/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue(20);
        
        int position = 0;
        int input = 1;
        while (input != 0){
            input = sc.nextInt();
            if (input == 0){
                break;
            }
            else{
                queue.append(input, position);
                position++;
            }  
        }
        System.out.println("");
        while (!queue.isEmpty()){
            System.out.println(queue.get());
        }
    }
}
