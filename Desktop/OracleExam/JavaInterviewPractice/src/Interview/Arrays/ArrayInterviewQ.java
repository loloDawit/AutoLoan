/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interview.Arrays;

import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dawitabera
 */
public class ArrayInterviewQ {
    
    public static void main(String[] args) {
        BSTree tree = new BSTree(); 
        
        
        int [] array = new int []{23,45,125,160,178,545,721}; 
        int [] array2 = new int []{23,45,125,112,12,545,121,1}; 
        int [] array3 = new int [] {12,2,90,1,4,15,23,78,13};
        int n = array.length; 
        boolean found = find(array, 1); 
       // root = data.addArrayToBSTree(test, 0, n-1);
                
        System.out.println(" :" + found);
        
        int missing = findMissing(array, array2); 
        System.out.println("Missing number is: " + missing);
        System.out.println("Duplicate: " + findDubplicate(array));
        
        BSTree.rootNode = tree.addArrayToBSTree(array, 0, n-1); 
        System.out.println("Proder traversal of the the BST: ");
        tree.preOrder(BSTree.rootNode);
        System.out.println("");
        
        System.out.println("Inorder traversal of the BST");
        tree.inOrder(BSTree.rootNode);
        System.out.println("");
        System.out.print("array before sort: [");
        for(int i = 0; i < array3.length; i++){
            System.out.print(array3[i] + " ");
        }
        System.out.println("]");
        System.out.print("array after sort: [");
        sort(array3);
        for(int i = 0; i < array3.length; i++){
            
            System.out.print(array3[i] + " ");
        }
        System.out.println("]");
    }
    // time complexity is O(n) 
    public static boolean find(int [] array, int x){
        
        for(int i=0; i < array.length; i++){
            if(array[i] == x)
                return true; 
        }
        return false; 
        
    }
    
    
    // find the max 
    public static int findMax(int [] array){
        int max=0; 
        
        for(int i = 0; i< array.length; i++){
            for(int k = i+1; i < array.length; i++){
                if(array[k] > array [i]){
                    max = array[k]; 
                }
            }
        }
        
        return max; 
        
    }
    // find missing number 
    public static int findMissing(int [] array, int [] array2){
        int missing = 0; 
        int sum = 0; 
        for(int i =0; i < array.length; i++){
            sum += array[i];
            
        }
        System.out.println("sum1: "+ sum);
        int sum2 = 0; 
        for(int k = 0; k < array2.length; k++){
            
            sum2 += array2[k]; 
            
        }
        System.out.println("sum2: "+ sum2);
        missing  = sum - sum2; 
        return missing; 
    }
    
    // find duplicate 
    
    public static boolean findDubplicate(int [] array){
        boolean found = false; 
        
        for(int i =0; i < array.length ; i++){
            for(int k = i + 1; k < array.length; k++){
                if( k != i && array[k] == array[i]){
                    found = true; 
                    System.out.println("Found duplicate @ index: [" + i + "]");
                }
        }
        
    }
    return found; 
    }
    
    
    // sort array 
    
    public static int[] sort(int [] array){
        int swap = 0; 
        
        for (int i = 0; i < array.length-1; i++){
            for(int k = i+1; k < array.length-1-i; k++){
                if(array[k] > array[k+1]){
                    swap = array[k];
                    array[k] = array[k+1];
                    array[k+1] = swap; 
                }
            }
        }
        return array;
    }
}
