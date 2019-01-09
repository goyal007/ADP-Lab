#input should be of the form a+bj

i=complex(input())
j=complex(input())

print('number-1',i.real,i.imag)
print('number-2',j.real,j.imag)

#print(type(i)) 
#print(i)
k=i+j
print("after adding")
print(k)
k=i-j
print("after subtracting")
print(k)
k=i*j
print("after multiplying");
print(k)
k=i/j
print("after dividing");
print(k)
'''
X=[int(x) for x in input().split(' ')]
Y=[int(y) for y in input().split(' ')]

a=X[0]
b=X[1]
c=Y[0]
d=Y[1]
print("after adding")
print(str(a+c)+"+i"+str(b+d))
print("after subtracting")
print(str(a-c)+"+i"+str(b-d))


if b*d<0:
	print("after multiplying");
	print(str((a*c)-(b*d))+"+i"+str((a*d)+(b*c)));	
	
	print("after dividing");
	print(str(float(((a*c)-(b*d))/(c*c-d*d)))+"+i"+str(float(((a*d)+(b*c))/(c*c-d*d))));
	
elif b*d>0:
	print("after multiplying");
	print(str((a*c)-(b*d))+"+i"+str((a*d)+(b*c)));	
		
	print("after dividing");
	print(str(float(((a*c)-(b*d))/(c*c-d*d)))+"+i"+str(float(((a*d)+(b*c))/(c*c-d*d))));

'''
