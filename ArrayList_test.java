public class ArrayList_test{
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.pop();
		obj.resize();
		System.out.println("toString " +obj.toString());
		System.out.println("The Size of new Array is " +obj.size());

		System.out.println("Testcase3 passed");
	}
}