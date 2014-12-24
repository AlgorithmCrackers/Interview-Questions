def has_redundant(s):
    stack = [0]
    for c in s:
        if c == '(':
            stack.append(0)
        elif c == ')':
            if stack.pop() == 0:
                return True
        else:
            stack[-1] += 1
    # Treat (expr) as redundant
    return stack.pop() == 0

assert has_redundant("()")
assert has_redundant("(a+b)")
assert not has_redundant("(a+b)+c")
assert has_redundant("((a+b))+c")