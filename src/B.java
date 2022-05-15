public class B implements I{
    @Override
    public void m1() {
        System.out.println("M1");
    }

    @Override
    public void m2() {
        System.out.println("M2");
    }
    public static void main(String[] args)
    {
     B obj=new B();
     obj.m1();
     obj.m2();
     obj.m3();
     I.m4();
    }



}
