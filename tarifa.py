x=int(input())
if(1<=x<=100):
  n=int(input())
  if(1<=n<=100):
    ch=True
    sum=x
    for i in range(n):
      p=int(input())
      if(0<=p<=10000):
        sum+=x-p
      else:
        ch=False
        break
    if(ch): print(sum)

