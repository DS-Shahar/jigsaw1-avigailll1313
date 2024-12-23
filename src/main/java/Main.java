import java.util.*;

public class aaa {

	public static Node<Integer> q(Node<Integer> l1) {
		Node<Integer> P = l1.getNext();
		Node<Integer> a = l1;
		int x = 0;
		while (l1.hasNext()) {
			 x= l1.getValue();
			
				if (P.getNext().getValue().equals(x)) {
					P.setNext(P.getNext().getNext());
				}

			l1.getNext();
			P.getNext();

		}
		return (a);
	}

	public static void main(String arg[]) {
		int[] a = { 2, 3, 4, 7, 3, 5 };
		Node<Integer> h = new Node<Integer>(-1);
		Node<Integer> p = h;
		Node<Integer> x;
		for (int i = 0; i < a.length; i++) {
			x = new Node<Integer>(a[i]);
			p.setNext(x);
			p = p.getNext();
		}
		
		System.out.println(h.getNext());
		System.out.println(q(p));
	}

