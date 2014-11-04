def has_redundant(s):
    stack = [0]
    for c in s:
        if c == '(':
            stack.append(0)
        elif c == ')':
            if stack.pop() == 0: # if there are braces without alphanum char inbetween
                return True
        else:
            stack[-1] += 1 # if a alphanum char occurs increment the last elem of the list
    # Treat (expr) as redundant
    return stack.pop() == 0 # (expr)+expr returns false

def main():
    assert has_redundant("()")
    assert has_redundant("(a+b)")
    assert not has_redundant("(a+b)+c")
    assert has_redundant("((a+b))+c")
    print "\nAll asserts PASSED!!, Yaaaaaay!!\n"
 
if __name__ == "__main__":
    main()

