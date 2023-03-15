class lowercase_vowel
  {
   public static void main(String[] args)
     {
         String s="mine computer";
            char c[]=s.toCharArray();
               char uppervowel;
           for(int i=0;i<c.length;i++)
             {
             if (c[i] == 'a' || c[i] == 'e' || c[i]== 'i' || c[i] == 'o' || c[i] == 'u') 
              {
                uppervowel = Character.toUpperCase(c[i]);
                c[i]=uppervowel;
              }
              System.out.println(c[i]);
             }
     }
  }