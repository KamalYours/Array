public class Demo 
{
    
    public static void main(String[] args) {

        int array[]={10,25,14,52,20,20,10,25,20};
        int [] de=new int[array.length];
        int v=-1;
        for (int i = 0; i<array.length; i++)
        {
            int count=1;
            for (int j=i+1;j<array.length;j++)
            {
                if (array[i]==array[j])
                {
                    
                    count++;
                    de[j]=v;
                }
            }
            if (de[i]!=v)
            {
                de[i]=count;
                
            }
            for (int k=0;i<de.length;i++)
            {
                if (de[k]!=v)
                    System.out.println(""+array[k]+"|"+de[k]);
            }
        }
        
    }
}
