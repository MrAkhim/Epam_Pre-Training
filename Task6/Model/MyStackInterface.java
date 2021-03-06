package by.epam.preTraining.task6.model;

import by.epam.preTraining.task6.exceptions.StackEmptyException;
import by.epam.preTraining.task6.exceptions.StackOverflowException;

public interface MyStackInterface<E> {
	void push(E element) throws StackOverflowException;

	E pop() throws StackEmptyException;

	E peek() throws StackEmptyException;

	int size();

	boolean isEmpty();

	boolean isFull();
}