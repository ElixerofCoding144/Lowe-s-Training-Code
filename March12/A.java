/*no argument
 * interface In1
 */
/*{
	public void show();
}
public class A {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int c = 99;
		/*In1 i1 = new In1() {
			@Override
			public void show() {
				System.out.println(c);
			}
		};
		i1.show();
		*/
		/*In1 i1 = ()->{
			System.out.println(c);
		};
		i1.show();
	}
}
*/
/*@FunctionalInterface
interface In1
{
	public String show(String eName);
}
public class A {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int c = 99;
	
		In1 i1 = (eName)->{
			return "Hi..."+eName;
		};
		System.out.println(i1.show("Antara"));
		In1 i2 = eName->{
			return "Welcome..."+eName;
		};
		System.out.println(i2.show("Chakrabarti"));
	}
}
*/
interface In1
{
	public int calc(int p, int q);
}
public class A {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int c = 99;
	
		In1 i1 = (p,q)->(p*q+5);
		System.out.println(i1.calc(6,7));
		In1 i2 = (w,d) ->
		{
			return w+d;
		}
		System.out.println(i2.calc(3,6));
	}
}

