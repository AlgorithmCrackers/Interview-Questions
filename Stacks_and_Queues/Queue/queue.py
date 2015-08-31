class Queue(object):
	def __init__(self):
		self.container = []

	# [1, 2] => [1, 2, 3]
	# adds element at the starting
	def enqueue(self, item):
		self.container.append(item)

	# [1, 2, 3] => [2, 3]
	# removes the element at starting
	def dequeue(self):
		if(self.isEmpty()):
			print 'deque operation is not permitted in the emplty container'
			return
		else:
			return self.container.pop(0)


	def isEmpty(self):
		return len(self.container) == 0

	def display(self):
		print self.container

def main():
	q = Queue()
	q.enqueue(1)
	q.enqueue(2)
	q.enqueue(3)
	q.display()
	assert q.dequeue() == 1
	assert q.isEmpty() == False
	assert q.dequeue() == 2
	assert q.dequeue() == 3
	assert q.isEmpty() == True
	print 'all is well :)'

if __name__ == '__main__':
	main()
