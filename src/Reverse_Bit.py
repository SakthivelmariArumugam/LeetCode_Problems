n=int(input())
s=""
while n>0:
  k=n%2
  s=str(k)+s
  n=n//2
sum=0
k=1
count=0
if len(s)<32:
    m1=32-len(s)
    l1="0"*m1
s=l1+s
for j in range(0,len(s)):
    if count>32:
      break
    r=int(s[j])
    sum=sum+(r*k)
    k=k*2
    count=count+1
        
print(sum)
        

        