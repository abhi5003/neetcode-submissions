class Solution:
    def evalRPN(self, tokens: List[str]) -> int:

        if not tokens:
            return -1

        stack = []

        for token in tokens:

            if token == "+":
                stack.append(stack.pop() + stack.pop())

            elif token == "-":
                first = stack.pop()
                second = stack.pop()
                stack.append(second - first)

            elif token == "*":
                stack.append(stack.pop() * stack.pop())

            elif token == "/":
                first = stack.pop()
                second = stack.pop()

                # Python's // rounds toward negative infinity,
                # so use int() to truncate toward zero.
                stack.append(int(second / first))

            else:
                stack.append(int(token))

        return stack.pop()

