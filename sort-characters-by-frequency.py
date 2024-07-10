def frequencySort(s):
        k=list(s)
        m=list(set(k))
        s='a';
        string=""
        while(len(m)!=0):
            big=0;
            for i in m:
                r=k.count(i)
                if(r>big):
                    big=r
                    s=i
            for j in range(big):
                string=string+s
            m.remove(s)
        return string

input_String=input()
output_String=frequencySort(input_String)
print(output_String)

        
        
