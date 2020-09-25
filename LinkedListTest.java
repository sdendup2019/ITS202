public class LinkedListTest{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();


		list.addFirst(1);
		list.addLast(2);
		list.addLast(3);

		// System.out.println(obj1.size());
		assert(list.isEmpty() == false);
		assert(list.size() == 3);
		assert(list.first() == 1);
		assert(list.last() == 3);
		assert(list.removeFirst() == 1);
		assert(list.size() == 2);
		assert(list.first() == 2);
		System.out.println("All Test Cases Passed");
	}
}