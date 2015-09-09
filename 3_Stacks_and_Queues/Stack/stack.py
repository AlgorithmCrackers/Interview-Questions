# should support 
# 1) PUSH - adding the element at the end of the list
# 2) POP - removing and returning the element at the end of the list
# 3) PEEK - displaying the element at the end of list
class Stack(object):
	def __init__(self):
		self.container = []

	#adding into the stack
	def push(self, item):
		self.container.append(item)

	#removing an element
	def pop(self):
		if(len(self.container) == 0):
			#stack is empty
			print "empty stack can not be poped"
			return ''
		return self.container.pop()

	# Showing the last added element
	def peek(self):
		if(len(self.container) == 0):
			#stack is empty
			print "empty stack can not be peeked"
			return ''
		return self.container[len(self.container) - 1] # return the last element from the list


	def display(self):
		print self.container

	def isEmpty(self):
		return len(self.container) == 0


def main():
	s = Stack()
	s.push(1)
	s.push(2)
	s.push(3)
	assert s.pop() == 3
	assert s.pop() == 2
	assert s.pop() == 1
	print "all is well :)"

if __name__ == '__main__':
	main()

