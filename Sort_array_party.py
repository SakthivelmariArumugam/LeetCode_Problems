nums[1,2,3,4,5,6,7,8]
odd=list()
even=list()
for i in nums:
    if(i%2!=0):
        odd.append(i) 
    else:
        even.append(i)
odd.append(-1)
even.append(-2)
k=list()
for i in range(0,len(nums)):
    if(i%2==0):
        k.append(even[0])
        del even[0]
    else:
        k.append(odd[0])
        del odd[0]
print(k)
