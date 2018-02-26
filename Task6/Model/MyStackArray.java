package by.epam.preTraining.task6.model;

import by.epam.preTraining.task6.exceptions.StackEmptyException;
import by.epam.preTraining.task6.exceptions.StackOverflowException;

public class MyStackArray<E> implements MyStackInterface {

	private int capacity = 100;
	private E[] array;
	private int size;
	private int top;

	public MyStackArray() {
		size = capacity;
		array = (E[]) new Object[size];
		top = -1;
	}

	public MyStackArray(int size) {
		array = (E[]) new Object[this.size = size];
		top = -1;
	}

	@Override
	public int size() {
		return top + 1;
	}

	@Override
	public boolean isEmpty() {
		return top < 0;
	}

	@Override
	public boolean isFull() {
		return top + 1 == size;
	}

	@Override
	public E peek() throws StackEmptyException {
		if (isEmpty()) {
			throw new StackEmptyException("The stack is empty!");
		}
		return array[top];
	}

	@Override
	public E pop() throws StackEmptyException {
		if (isEmpty()) {
			throw new StackEmptyException("The stack is empty!");
		}
		return array[top--];
	}

	public void push(Object element) throws StackOverflowException {
		if (isFull()) {
			throw new StackOverflowException("The stack is overflown!");
		}
		array[++top] = (E) element;
	}
}
