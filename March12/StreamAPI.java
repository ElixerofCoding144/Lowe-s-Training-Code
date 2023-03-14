import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Stream API  allows functional style operation - filter fetch collect the data*/


public class StreamAPI {
	int cid;
	String cName;
	int age;
	public StreamAPI(int cid, String cName, int age) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.age = age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <StreamAPI> c1 = new ArrayList<>();
		c1.add(new StreamAPI(1, "Jaya", 36));
		c1.add(new StreamAPI(2, "Umesh", 83));
		c1.add(new StreamAPI(3, "Raja", 52));
		c1.add(new StreamAPI(4, "Amal", 69));
		/*
		List <Integer> ca = new ArrayList<>();
		
		 for(Cust cc:c1)//fetching
		{
			if(cc.age>50)//filtering
			{
				ca.add(cc.age);//collect
			}
		}
		System.out.println(ca);*/
		/*List <Integer> ca = c1.stream().filter(c->c.age>60)
				.map(c->c.age)
				.collect(Collectors.toList());
		System.out.println(ca);*/
		StreamAPI ca = c1.stream().max((c1, c2) ->c1.age>c2.age?1:-1).get();
		System.out.println("Senior.."+ca.cid+" "+ca.cName+" "+ca.age);
		StreamAPI ca = c1.stream().min((c1, c2) ->c1.age>c2.age?1:-1).get();
		System.out.println("Senior.."+ca.cid+" "+ca.cName+" "+ca.age);
		/*
		 * max((c1, c2) ->c1.age>c2.age -> filtering
		 * 1 first record to -1 end of the record -> fetching
		 * get() -> collect
		 */
				System.out.println(ca);
	}

}
