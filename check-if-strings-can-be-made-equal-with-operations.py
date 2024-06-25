
def canBeEqual(s1,s2):
        k1=list(s1)
        l1=k1.copy()
        k2=list(s2)
        l2=k2.copy()
        temp=k1[0]
        k1[0]=k1[2]
        k1[2]=temp
        if(''.join(k1)==s2 or''.join(k2)==s1):
            return True
        k1=l1.copy()
        temp=k1[1]
        k1[1]=k1[3]
        k1[3]=temp
        if(''.join(k1)==s2 or''.join(k2)==s1):
            return True
        k1=l1.copy()
        temp=k1[0]
        k1[0]=k1[2]
        k1[2]=temp
        temp=k1[1]
        k1[1]=k1[3]
        k1[3]=temp
        if(''.join(k1)==s2 or''.join(k2)==s1):
            return True
        temp=k2[0]
        k2[0]=k2[2]
        k2[2]=temp
        if(''.join(k1)==s2 or''.join(k2)==s1):
            return True
        temp=k2[1]
        k2[1]=k2[3]
        k2[3]=temp
        if(''.join(k1)==s2 or''.join(k2)==s1):
            return True
        return False
s1=input()
s2=input()
k=canBeEqual(s1,s2)
print(k)
        
        
        
        
