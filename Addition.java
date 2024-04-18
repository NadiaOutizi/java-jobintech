public class Addition {
    public static void main(String[] args){
        
        System.out.println("hello");
               // float[] x= new float[3];
               // x[0]=2.0f;
               // x[1]=3.0f;
               // x[2]=5.0f;
               // float[] x = {2.0f,3.0f,5.0f};
               // float sum =0.0f;
               // for(int index = 0; index<x.length;index++)
               //     sum+=x[index];
               //     System.out.println(sum);
        float[] x = {2.0f,3.0f,5.0f};
        float sum =0.0f;
        for(float i:x)
         sum+=i;
         System.out.println("the result is "+sum);
        
    }
}