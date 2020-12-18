import java.util.*;

public class BinarySearchTree<Key extends Comparable<Key>, Value>  {
    private Node root;
    int size = 0;             // root of BST

    private class Node {
        private Key key;           
        private Value val;        
        private Node left, right;  // left and right subtrees

        public Node(Key key, Value val) {
            this.key = key;
            this.val = val;
        }
    }

    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        return false;
    }

    public int size() {
      return size;
    }

    public Value get(Key key) {
        if(key == null){
            System.out.println("argument to get value() is null");
        }
        Node x = root;
        while(x.key != key){
            int cmp = key.compareTo(x.key);
            if(cmp < 0)         x = x.left;            
            else if(cmp > 0)    x = x.right;
        }
        if(x.key == key){
            System.out.println(x.val);
        }
        return x.val;
    }

  
    public void put(Key key, Value val) {
        Node newest = new Node(key,val);
        if(root == null){
            root = newest;
        }
        else{
            Node x = root;
            Node parent;
            while(true){
                parent = x;
                int cmp = key.compareTo(x.key);
                if(cmp < 0){
                    x = x.left;
                    if(x == null){
                        parent.left = newest;
                        size = size + 1;
                        return;
                    }
                    else if(x.key == key){
                        x.val = val;
                        return;
                    }
                }
                else if(cmp > 0){
                    x = x.right;
                    if(x == null){
                        parent.right = newest;
                        size = size + 1;
                        return;
                    }
                    else if(x.key == key){
                        x.val = val;
                        return;
                    }
                }
            }
        }
        size = size + 1;
      
    }

    public Key min() {
       if(isEmpty()){
        throw new NoSuchElementException("call min() is with empty symbol table");
       }
       else{
            Node x = root;
            if(x.left != null){
                x = x.left;
            }
            return x.key;
       }
    } 

    public Key floor(Key key){
        if(isEmpty()){
            System.out.println("calls floor() with empty symbol table");
        }
        Node x = root;
        Node parent = null;
        while(x != null){
            parent = x;
            int cmp = key.compareTo(parent.key);
            if(key == null)     System.out.println("calls floor() with a null key");
            if(cmp == 0)        return parent.key;
            if(cmp < 0)         x = parent.left;
            else if(cmp > 0)    x = parent.right;
            
                int cm = key.compareTo(x.key);
                if(cm < 0 )     return parent.key;
                else            x = parent.right;
            
        }
        return parent.key;
    }

    public Key select(Key key,Value val){
        if(isEmpty()){
            System.out.println("calls floor() with empty symbol table");
        }
        Node x = root;
        Node parent = null;
        while(x != null){
            parent = x;
            int cmp = key.compareTo(parent.key);
            if(key == null)     System.out.println("calls floor() with empty symbol table");
            if(cmp > 0)         x = parent.right;  
            else if(cmp < 0)    x = parent.left;
                
                int cm = key.compareTo(parent.key);
                if(cm > 0 )     return x.key;  
                else            x = parent.left;
            
        }
        return parent.key;
    }
    
    public void keys(Key lo, Key hi){
        if(lo == null || hi == null){
            System.out.println("key is null");
        }
        Node x = root;
        Node parent;
        while(x != null) {
            parent = x;
            if(parent == null)          return; 
            
            int cmp = lo.compareTo(parent.key);
            int cm = hi.compareTo(parent.key); 
            if (cmp < 0)                x = parent.left;
            if (cmp <= 0 && cm >= 0)    System.out.print(parent.key + " ");  
            if (cm > 0)                 x = parent.right;
        }
    }


public static void main(String[] main){
	BinarySearchTree <String,Integer> obj= new BinarySearchTree <String,Integer>();
	obj.put("Ada",1);
	obj.put("Ballerina",3);
	obj.get("Ada");
	obj.put("Html",5);
	obj.put("Java",7);
	obj.get("Java");
	System.out.println(obj.size());
	System.out.println(obj.min());
	System.out.println(obj.floor("Ballerina"));
	//System.out.println(obj.select(3));
	obj.keys("Ada"," Java");
	obj.put("Java",8);
	obj.put("Dart",9);
	obj.get("Java");
	System.out.println(obj.size());
	//System.out.println(obj.deleteMIn());
	obj.keys("Ballerina", "Java");
	//System.out.println(obj.delete("Java"));

	}
}

