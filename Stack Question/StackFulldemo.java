 class stackfulldemo
  {
   int []arry;
   int topOfStack;

   stackfulldemo(int size)
    {
     arry=new int[size];
     topOfStack=-1;
     System.out.println("Stack created with size= +size");
    }

   public boolean isEmpty()
    {
	 if(topOfStack == -1)
	  {
        return true;
      }
else
     {
	  return false;
     }
  }


  public boolean isFull()
    {
	 if(topOfStack==arry.length-1)
	  {
		return true;
	  }
	   else
	     {
			  return false;
		 }
	}

	public void push(int value)
	 {
		if(isFull())
		 {
		  System.out.println("stack is full");
		  return;
		 }
		 else
		    {
			  arry[topOfStack=1]=value;
              topOfStack++;
              System.out.println("The value is successfully inserted");
              }
	      }

	      //////////// pop method

	      public int pop()
	       {
			   if(isEmpty())
			    {
					System.out.println("Stack is empty");
					return -1;
				}
				 else
				   {
					int topstack=arry[topOfStack];
					topOfStack--;
					return topstack;
				   }
		   }

     public static void main(String[]args)
      {
       stackfulldemo stck=new stackfulldemo(12);
       boolean check=stck.isEmpty();
       System.out.println(check);
       System.out.println(stck.pop());
       stck.push(23);
       stck.push(13);
       stck.push(29);
      }
  }