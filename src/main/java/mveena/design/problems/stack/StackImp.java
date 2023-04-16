package mveena.design.problems.stack;
import java.util.*;

public class StackImp {
	   List<StackNode> elemList = null;
	    
	    public StackImp() {
	        elemList = new ArrayList<>();
	    }
	    
	    public void push(int val) {
	        if(elemList.isEmpty()) {
	        	StackNode node = new StackNode(val, val);
	          elemList.add(node); 
	        } else {
	            int existingMinValue = this.getMin();
	            if(existingMinValue <val) {
	            	StackNode node = new StackNode(val, existingMinValue); 
	               elemList.add(node); 
	            } else {
	            	StackNode node = new StackNode(val, val); 
	               elemList.add(node); 
	            }
	           
	        }
	    }
	    
	    public void pop() {
	        if(elemList.isEmpty()) {
	           throw new RuntimeException("Stack is empty");  
	        }            
	         elemList.remove(elemList.size()-1);  
	    }
	    
	    public int top() {
	       if(elemList.isEmpty()) {
	           throw new RuntimeException("Stack is empty");  
	        }      
	         return elemList.get(elemList.size()-1).val();  
	    }
	    
	    public int getMin() {
	       if(elemList.isEmpty()) {
	           throw new RuntimeException("Stack is empty");  
	        }
	         return elemList.get(elemList.size()-1).minVal();  
	  
	    }
}
