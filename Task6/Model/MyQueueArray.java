package by.epam.preTraining.task6.model;

import java.util.Arrays;

import by.epam.preTraining.task6.exceptions.StackEmptyException;
import by.epam.preTraining.task6.exceptions.StackOverflowException;

public class MyQueueArray<E> implements MyQueueInterface {

	private int capacity = 100;
	private E[] array;
	private int currentElementsAmount;
	private int size;
	private int head;
	private int tail;

	public MyQueueArray() {
		array = (E[]) new Object[this.size = capacity];
		tail = -1;
		head = 0;
		currentElementsAmount = 0;
	}

	public MyQueueArray(int size) {
		array = (E[]) new Object[this.size = size];
		tail = -1;
		head = 0;
		currentElementsAmount = 0;
		// Arrays.fill(array, "-1");
	}

	@Override
	public int size() {
		return currentElementsAmount;
	}

	@Override
	public boolean isEmpty() {
		return currentElementsAmount == 0;
	}

	@Override
	public boolean isFull() {
		return currentElementsAmount == size - 1;
	}

	@Override
	public E peek() throws StackEmptyException {
		if (isEmpty()) {
			throw new StackEmptyException("The stack is empty!");

		}
		return array[head];
	}

	@Override
	public E dequeue() throws StackEmptyException {
		if (!isEmpty()) {
			E temp = array[head++];
			// array[head-1]="-1";
			if (head == size) {
				head = 0;
			}
			currentElementsAmount--;
			return temp;
		} else
			throw new StackEmptyException("The stack is empty!");
	}

	public void enqueue(Object element) throws StackOverflowException {

		if (tail == size - 1) {
			throw new StackOverflowException("The stack is full!");
		}
		array[++tail] = (E) element;
		currentElementsAmount++;
	}
}
