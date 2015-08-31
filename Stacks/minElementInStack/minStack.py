import Stack as st

# Idea :
# use another stack to store the minimum elements

class minStack(object):
	def __init__(self):
		self.minStack = st.Stack()
		self.stack = st.Stack()

	def push(self, item):
		# when the stack is empty
		if(self.stack.isEmpty()):
			self.stack.push(item)
			self.minStack.push(item)
			return
		else:
			self.stack.push(item)
			curMin = self.minStack.peek()
			# if curMin is greater than the new item add the new item as min
			# else again add curmin
			if(curMin > item):
				self.minStack.push(item)
			else:
				self.minStack.push(curMin)

	def pop(self):
		# remove the element from the minStack
		self.minStack.pop()
		return self.stack.pop()

	# takes O(1) since we just need to get the top element of stack for getting the min elements
	def min(self):
		#returns the current minimum
		return self.minStack.peek()


def main():
	print 'testing min stack'
	stack = minStack()
	stack.push(5) # [5]
	assert stack.min() == 5
	stack.push(4) # [5, 4]
	assert stack.min() == 4
	stack.push(8) # [5, 4, 8]
	assert stack.min() == 4
	stack.push(3) # [5, 4, 8, 3]
	assert stack.min() == 3
	stack.pop()
	assert stack.min() == 4
	print 'all is well :)'

if __name__ == "__main__":
	main()