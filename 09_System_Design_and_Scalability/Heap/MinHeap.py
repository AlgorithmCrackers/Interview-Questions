class Heap(object):
    def __init__(self):
        self.arr = [None] # ind 0 is None

    def is_empty(self):
        return len(self.arr) <= 1

    def heappush(self, val):
        self.arr.append(val)
        self.__swim(len(self.arr)-1)
        # print("after push", self.arr[1:])

    def heappop(self):
        ret = self.arr[1]
        self.arr[1] = self.arr[-1]
        self.arr = self.arr[:-1]
        self.__sink(1)
        # print("after pop", self.arr[1:])
        return ret

    def __swim(self, idx):
        parent = idx//2
        while parent >= 1 and self.arr[idx] < self.arr[parent]:
            self.arr[parent], self.arr[idx] = self.arr[idx], self.arr[parent]
            idx = parent
            parent = idx//2
    def __sink(self, idx):
        lc, rc = idx*2, idx*2+1
        while idx < len(self.arr) and lc < len(self.arr):
            if rc >= len(self.arr): rc = lc
            min_idx = lc if self.arr[lc] < self.arr[rc] else rc
            min_child = self.arr[min_idx]
            if self.arr[idx] <= min_child: break
            self.arr[idx], self.arr[min_idx] = self.arr[min_idx], self.arr[idx]
            if lc == rc: break
            idx = lc if self.arr[lc] < self.arr[rc] else rc
            lc, rc = idx * 2, idx * 2 + 1

minheap = Heap()
for a in [5,2,3,1,4,4]:
    minheap.heappush(a)
while not minheap.is_empty():
    print(minheap.heappop())
