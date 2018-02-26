package by.epam.preTraining.task6.model;

import by.epam.preTraining.task6.exceptions.StackEmptyException;
import by.epam.preTraining.task6.exceptions.StackOverflowException;

public interface MyQueueInterface<E> {

	void enqueue(E element) throws StackOverflowException;

	E dequeue() throws StackEmptyException;

	E peek()throws StackEmptyException; 

	int size();

	boolean isEmpty();

	boolean isFull();
}