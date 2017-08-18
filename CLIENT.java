package STACK;

import java.util.Stack;

import javax.xml.soap.SAAJResult;

import JUNE8.ass6_ques10;

public class CLIENT {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		stack st = new dynamic_stack(5);
		st.push(10);

		st.push(20);

		st.push(30);

		st.push(40);

		st.push(50);

//		st.display();
//		st.DisplayRev();
		// display_reverse(st);

		// st.display();

		// stack helper = new dynamic_stack(5);

		// reverse_stack(st , helper );
		// st.display();
		//
		String str = "((a+b)+c	`````````````````````````````````						) + (c+d)";
		System.out.println(AssQues4(str));

	}

	public static void reverse_stack(stack st, stack helper) throws Exception {
		if (st.isempty()) {
			if (helper.isempty()) {
				return;
			}
			int val = helper.pop();
			reverse_stack(st, helper);
			st.push(val);

			return;
		}

		int val = st.pop();
		helper.push(val);
		reverse_stack(st, helper);

	}

	public static int[] stock(int[] arr) throws Exception {
		stack st = new dynamic_stack(arr.length);
		st.push(0);
		int[] rv = new int[arr.length];
		rv[0] = 1;
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (st.isempty())
					break;

				if (arr[i] >= arr[j]) {
					st.pop();
				}
			}
			if (st.size() != 0)
				temp = st.top();
			st.push(i);
			if (st.size() == 1) {
				rv[i] = i + 1;
			} else {
				rv[i] = st.top() - i;

			}
		}
		return rv;
	}

	public static boolean AssQues4(String str) throws Exception {
		stack duplicate = new stack(10);
		duplicate.push((int)str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			int count = 0;
			if (str.charAt(i) == ')') {
				while (duplicate.top() != '(') {
					duplicate.pop();
					count++;
				}
				if (count == 0) {
					return true;
				}
				duplicate.pop();
				
			} else {
				duplicate.push(str.charAt(i));
			}
		}

		return false;
	}
}
