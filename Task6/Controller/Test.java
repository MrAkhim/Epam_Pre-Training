package by.epam.preTraining.task6.controller;

import by.epam.preTraining.task6.model.MyQueueArray;
import by.epam.preTraining.task6.model.MyStackArray;
import by.epam.preTraining.task6.model.Polindrom;
import by.epam.preTraining.task6.view.View;

public class Test {
	public static void main(String[] args) {
		try {
			MyStackArray<Integer> st = new MyStackArray<>();
			st.push(10);
			st.push(20);
			st.push(30);
			View.show(st.size());
			View.show(st.pop() + " " + st.pop() + " " + st.pop());

			MyQueueArray<Integer> que = new MyQueueArray<>();
			que.enqueue(10);
			que.enqueue(20);
			que.enqueue(30);
			View.show(que.dequeue() + " " + que.dequeue() + " " 
			+ que.dequeue());

			String str = "sum summus mus";
			View.show(Polindrom.checkPalindrome(str));
		} catch (Exception a) {
			View.show(a.getMessage());
		}
	}
}
