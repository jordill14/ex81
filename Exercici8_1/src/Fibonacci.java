/*
 * Fibonacci.java        1.0 22/09/2015
 *
 * class Fibonacci
 *
 * Copyright 2015 Jordi Llonch Neira <jordill14@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Fibonacci {
	public static void main(String[] args) {
		//Auto-generated method stub
		ArrayList<Integer> Fibonacci = new ArrayList<Integer>(25);
		Fibonacci.add(0);// enter the 1st elemnt of the list
		Fibonacci.add(1);// 2nd elemnt
		int currIndex;
		
		System.out.println("\nBUCLE NORMAL FINS AL TAMANY\n");
		for (currIndex = 2; currIndex < 25; currIndex++){// --- currIndex set the limit  as first 25 items
			Fibonacci.add(((Integer) Fibonacci.get(currIndex - 2)) + ((Integer) Fibonacci.get(currIndex - 1)));
			System.out.println(Fibonacci.get(currIndex) + " ");
		}
		
		System.out.println("\nFOR-EACH\n");
		for ( Integer s : Fibonacci  ) {
			System.out.println(s); //“imprimeixo l’objecte”
		}
		 
		System.out.println("\nAMB ITERATOR\n");
		Iterator<Integer> n = Fibonacci.iterator();
		while(n.hasNext()) {
			System.out.println(n.next());
		}
		
		//Determina la posició del valor "2584"
		int pos = 2584;
		System.out.println("\nLa posició 2584 apareix el número: " + Fibonacci.indexOf(pos) + "\n");
		
		//hi és el valor "4311"?
		boolean wanted = Fibonacci.contains(4311);
			if(wanted) {
				System.out.println("El valor 4311 apareix en l'arrayList");
			} else {
				System.out.println("El valor 4311 no apareix en l'arrayList");
			}
	}
}
