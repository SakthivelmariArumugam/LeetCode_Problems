def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        k=list()
        m=set(nums1)
        for i in m:
            if i in nums1 and i in nums2:
                c=nums1.count(i)
                d=nums2.count(i)
                if(c==d):
                    for j in range(0,c):
                        k.append(i)
                elif c<d:
                    for j in range(0,c):
                        k.append(i)
                else:
                    for j in range(0,d):
                        k.append(i)
        return k
list1=[1,2,2,1]
list2=[2,2]
m=intersect(list1,list2)
print(m)
