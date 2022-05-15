public interface I
{
    void m1();
    void m2();
    default void m3()
    {
        System.out.println("This is a Default Method");
    }
    static void m4()
{
    System.out.println("This is a static Method");
}
    }

