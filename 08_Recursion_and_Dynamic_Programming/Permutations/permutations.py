# generate all permutations
a = ['A', 'B', 'C', 'D', 'E']


def permutation(arr, cur, v, res):
    # print(cur, v)
    if len(cur) == len(a):
        res.append(cur)
        return

    for i in range(len(a)):
        if not v[i]:
            v[i] = True
            permutation(arr, cur + arr[i], v, res)
            v[i] = False

res = []
visited = [False] * len(a)
permutation(a, "", visited, res)
print(res)
