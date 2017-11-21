/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interview.Arrays;
import java.util.ArrayList;

class ArrayListEx{
    
    public static final int data = 4; 
   
    
    class Data{
        int ID; 
        String name; 
        int age; 
        char sex; 
        
/**
 * Constructor for Data class 
 * @param id
 * @param name
 * @param age
 * @param sex 
 */
        public Data(int id, String name, int age, char sex) {
            this.ID = id; 
            this.name = name; 
            this.age = age; 
            this.sex = sex; 
            
        }
        
    }       
        /**
         * 
         * @param id
         * @param name
         * @param age
         * @param sex 
         */
        public void arrayToArrayList(int []id, String []name, int []age,char[]sex){
            ArrayList <Data> list = new ArrayList<>(); 
            for(int i = 0; i < data; i++){
                list.add(new Data(id[i], name[i], age[i], sex[i]));
            }
            printValue(list); 
        
    }
        /**
         * 
         * @param list 
         */

        public void printValue(ArrayList<Data> list) {
            System.out.println("ID\tNAME\tAge\tSex");
            System.out.println("---\t----\t----\t----");
            
            for(int i = 0; i < data ; i ++){
                Data getData = list.get(i);
                System.out.println(getData.ID + "\t" + getData.name + "\t" + 
                                   getData.age + "\t"+getData.sex);
           }
        }
        
        public static void main(String[] args) {
        int [] id = {122,121,120,190,121}; 
        String [] name = {"Lea","Metti","Dawit","Bety","Dave"}; 
        int [] age = {19,19,20,25,28}; 
        char [] sex = {'F','F','M','F','M'}; 
        
        ArrayListEx list = new ArrayListEx(); 
        
        list.arrayToArrayList(id, name, age, sex);
    }
        
    }
   
    
