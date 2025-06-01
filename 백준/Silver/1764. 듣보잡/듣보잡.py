N, M = map(int, input().split())

neverHeard = set()
for i in range(N):
    neverHeard.add(input())

neverSeen = set()
for i in range(M):
    neverSeen.add(input())

neverHS = sorted(list(neverHeard & neverSeen))

print(len(neverHS))
for name in neverHS:
    print(name)