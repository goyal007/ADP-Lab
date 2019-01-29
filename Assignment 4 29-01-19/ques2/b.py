class Bank:
	def __init__(self,a):
		self.balance=a
	def deposit(self,amt):
		self.balance=amt+self.balance
		return self.balance
	def withdraw(self,amt):
		if(self.balance>=amt):
			self.balance=self.balance-amt
			return self.balance
		else:
			print("Not sufficient balance:")
			return 0
	def show(self):
		print("account balance is::",self.balance)
b1=Bank(12000)
b1.show()
t=int(input("enter amount to deposit:"))
c1=b1.deposit(t)
print("balance after deposit is:",c1)
#b1.show()
t2=int(input("enter amountt to withdraw:"))
c2=b1.withdraw(t2)
if(c2!=0):
	print("balance after withdraw  is:",c2)
#b1.show()


t2=int(input("enter amountt to withdraw:"))
c2=b1.withdraw(t2)
if(c2!=0):
	print("balance after withdraw is:",c2)
