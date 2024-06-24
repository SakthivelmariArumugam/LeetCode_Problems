n=int(input())
count=0
while(n>0):
    s=n%2
    if(s==1):
        count+=1
    n=n//2
print(count)
