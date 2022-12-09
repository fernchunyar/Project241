package main;

public class MyArrayList implements MyArrayListADT{
	
	private int total;
    private Item s[];
    int current,size;
    
    public MyArrayList() {
        List();
        
    }
    
    public void List() {
        current = -1;
        total = 50;
        
        size=0;
        s = new Item[total];
    }
    
    public void add(Item item)  {
    	
        if(isFull()){
            //throw new Exception("List is full");
        }else{
        	//current = size-1;
        	size++;
            if (size==1)
            {
                current++;
                s[current]=item;
            }
            else
            {
                for(int i=size-1;i>current +1;i--)
                    s[i]=s[i-1];
                current++;
                s[current] = item;
            }
        }
    }
    
   
    
    
   
    
    public boolean isEmpty() {
        return size == 0;
    }
    
   
    public boolean isFull() {

        return size>=total;
    }

	public Item set(int i, Item tmpj) throws Exception  {
		// TODO Auto-generated method stub
		if(isEmpty()){
            throw new Exception("List is empty");
        }else{
            s[i]=tmpj;
        }
		return tmpj;
		
	}

	public Item get(int i) throws Exception {
		// TODO Auto-generated method stub
		if(isEmpty()){
            throw new Exception("List is empty");
        }else{
            return s[i];
        }
		
		
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	

	public void clear() {
		// TODO Auto-generated method stub
		
//		size =0;
//		s = null;
//		current = -1;
		List();
		
	}

	public void remove(int y) throws Exception {
		// TODO Auto-generated method stub
		if(isEmpty()){
            throw new Exception("List is empty");
        }else{
        	current = y;//Here
            if(size==1){
            	//s[current] = null;
                current = -1;
               
            }else if(current==size-1){
            	//s[current]=null;
                current = 0;
                
            }else{
                for(int i = current;i<size-1;i++)
                    s[i]=s[i+1];
                    
                    //s[y]=null;
                    current = 0;
                }
                //s[current]=null;
                
                size--;
                current = size-1;//Hereeeeeeeeeeeeeeeeeeeee!!
                
            }
            
        }
		
		
		
		
	}
	

	


