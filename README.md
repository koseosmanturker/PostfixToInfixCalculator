# PostfixToInfixCalculator
Working from left to right, scan each character of the postfix expression, and take one of the following two actions.
If the character is an operand, push it to the stack.
If the character is an operator, pop the top value from the stack for its right operand and pop the next top value from the stack for its left operand. Finally, insert the operator between its operands, place the infix string within a set of parenthesis, and then push the infix string back to the stack.
Repeat the above scanning and subsequent actions until all postfix characters have been handled. If the postfix expression was valid, you should be left with a single element in the stack, which is the infix equivalent of the postfix expre
