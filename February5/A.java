public class A {
    public static void main(String[] args) {
        try
        {
            /*
             * int i=10,j=0,k; k=i/j; System.out.println(k);
             */
            /*
             * String s= null; System.out.println(s.length());
             */
            /*
             * String s="veera"; int i=Integer.parseInt(s); System.out.println(i);
             */
            int ar[]= {5,1,4,2,3};
            System.out.println(ar[5]);
        }
        /*
         * catch(ArrayIndexOutOfBoundsException a) { a.printStackTrace();
         * System.out.println("catch1"); }
         */
        catch (NumberFormatException  e) {
            e.printStackTrace();
            System.out.println("catch2");
        }
        catch(NullPointerException n)
        {
            n.printStackTrace();
            System.out.println("catch3");
        }
        catch(ArithmeticException a)
        {
            a.printStackTrace();
            System.out.println("catch4");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("catch5");
        }
        finally {
            System.out.println("finally....");
        }
    }
}