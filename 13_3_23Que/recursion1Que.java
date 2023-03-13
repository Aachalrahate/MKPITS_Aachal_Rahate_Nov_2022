class rec1{
	void fun(int x){
		if(x==10){
			System.out.println(x);
			return ;
			}
			else{
				fun(x+1);
				}
		}
	}
	class recursion1Que{
		public static void main(String[]args){
			rec1 a=new rec1();
			a.fun(5);
			}
		}