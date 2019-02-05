string =input("enter the string:")
l=len(string)
dic={}
c=0
for i in range(l):
	if(dic.get(string[i])==None):
		dic[string[i]]=1
	elif dic[string[i]]==1:
		print("not a perfect string")
		c=1
		break
if c==0:
	print("perfect string")
