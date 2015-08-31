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

	

