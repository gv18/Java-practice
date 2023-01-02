class Test<T, U>
{
    T obj1;
    U obj2;
    Test(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
public class Generics
{
    public static void main (String[] args)
    {
        Test <String, Integer> obj = new Test<>("GfG", 15);
        obj.print();
    }
}