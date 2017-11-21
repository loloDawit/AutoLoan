/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interview.Arrays;

/**
 *
 * @author dawitabera
 */
class TreeNode {
    int data; 
    TreeNode leftNode; 
    TreeNode rightNode; 

    public TreeNode(int x) {
        data = x; 
        leftNode = rightNode = null;
    }
    
}    

class BSTree{
    static TreeNode rootNode; 
    
    public TreeNode addArrayToBSTree(int [] array, int start, int end){
        if(start > end){
            return null; 
        }
        int midPoint = (start + end)/2; 
        TreeNode node = new TreeNode(array[midPoint]); 
        node.leftNode = addArrayToBSTree(array, start, midPoint-1); 
        node.rightNode = addArrayToBSTree(array, midPoint+1, end); 
        
        return node; 
    }
    
    void preOrder(TreeNode rootNode){
        
        if(rootNode == null){
            return;
        }
        
        System.out.print(rootNode.data + " ");
        preOrder(rootNode.leftNode);
        preOrder(rootNode.rightNode);
        
    }
    
    void inOrder(TreeNode rootNode){
        if(rootNode == null){
            return;
        }
        inOrder(rootNode.leftNode);
        System.out.print(rootNode.data + " ");
        inOrder(rootNode.rightNode);
        
    }
            
}
