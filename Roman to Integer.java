class Solution {//for shorter code, you can use hash map( faster than about 70% speed)
    public int romanToInt(String s) {
          
        
        int total=0;
        
        
        for(int i=s.length()-1;i>=0;i--)
        {
            char current=s.charAt(i);
            char prev = i+1<s.length() ? s.charAt(i+1):'*';
            
           if((prev=='V'&&current=='I')||(prev=='X'&&current=='I'))
           {
               total=total-1;
           }else if((prev=='L'&&current=='X')||(prev=='C'&&current=='X'))
           {
               total=total-10;
           }else if((prev=='D'&&current=='C')||(prev=='M'&&current=='C'))
           {
               total=total-100;
           }else if(current=='I')
           {
               total=total+1;
           }else if(current=='V')
           {
               total=total+5;
           }else if(current=='X')
           {
               total=total+10;
           }else if(current=='L')
           {
               total=total+50;
           }else if(current=='C')
           {
               total=total+100;
           }else if(current=='D')
           {
               total=total+500;
           }else if(current=='M')
           {
               total=total+1000;
           }
            
          
            
            
            
           
            
            
            
        }
        
        return total;
        }
    
    }