package com.geeksforgeeks.practice;

import java.util.Stack;

public class SolveBODMASexpression {
	public static void main(String[] args) {
		System.out.println(new SolveBODMASexpression().solveExpression("90 + 7 * 50/50 + (50)"));
	}

	int solveExpression(String expression) {
		char[] elements = expression.toCharArray();
		Stack<Integer> values = new Stack<>();
		Stack<Character> operators = new Stack<>();

		for (int i = 0; i < elements.length; i++) {

			if (elements[i] == ' ') {
				continue;
			}

			StringBuilder sb = new StringBuilder();
			if (i < elements.length && elements[i] >= '0' && elements[i] <= '9') {
				while (i < elements.length && elements[i] >= '0' && elements[i] <= '9') {
					sb.append(elements[i++]);
				}
				i--;
				values.push(Integer.parseInt(sb.toString()));
			}

			else if (elements[i] == '(') {
				operators.push(elements[i]);
			}

			else if (elements[i] == ')') {
				while (operators.peek() != '(') {
					values.push(applyOperation(operators.pop(), values.pop(), values.pop()));
				}
				operators.pop();
			}

			else if (elements[i] == '+' || elements[i] == '-' || elements[i] == '*' || elements[i] == '/') {
				if (!operators.isEmpty() && hasPrecidence(elements[i], operators.peek())) {
					values.push(applyOperation(operators.pop(), values.pop(), values.pop()));
				}
				operators.push(elements[i]);
			}
		}
		
		while(!operators.isEmpty()) {
			values.push(applyOperation(operators.pop(), values.pop(), values.pop()));
		}
		
		return values.pop();
	}

	int applyOperation(char operator, int operand2, int operand1) {
		switch (operator) {
		case '+':
			return operand1 + operand2;
		case '-':
			return operand1 - operand2;
		case '*':
			return operand1 * operand2;
		case '/':
			if (operand2 == 0)
				throw new ArithmeticException("division by zero not possible!");
			return operand1 / operand2;
		}
		return 0;
	}

	boolean hasPrecidence(char currentOperator, char previousOperator) {
		if (previousOperator == '(' || previousOperator == ')') {
			return false;
		} else if ((currentOperator == '*' || currentOperator == '/')
				&& (previousOperator == '+' || previousOperator == '-')) {
			return false;
		}
		return true;
	}
}
