class BubbleSort
  {
   public static void main(String[]args)
   {
   	int temp;
        int arr[]={2,4,6,8,9,1,2,0};
        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                  temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                }
            }
        }
       for(int i=0;i<arr.length;i++)
       {
   		System.out.println(arr[i]);
   		}
   }
}