
public class DataTest extends DataBase{

	DataTest(long MAX) {
		super(MAX);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		DataTest test=new DataTest(10);
		test.insert(5, "5");
		test.insert(6, "6");
		test.insert(9, "9");
		test.insert(1, "1");
		test.insert(7, "7");
		System.out.println(test.getRoot().left.obj);
		System.out.println(test.getRoot().right.right.left.obj);
		test.delete(6);
		System.out.println(test.search(6)==null);
		System.out.println(test.getRoot().right.obj);
	}

}
