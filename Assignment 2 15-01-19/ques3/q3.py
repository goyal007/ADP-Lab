class Student:
		
	def __calculate(self):
		total = 0
		for val in self.__marks:
			total += val
		if total >= 360:
			self.__grade = 'AA'
		elif total >= 320:
			self.__grade = 'AB'
		elif total >= 280:
			self.__grade = 'BB'
		elif total >= 220:
			self.__grade = 'BC'
		elif total >= 150:
			self.__grade = 'CC'
		else:
			self.__grade = 'CD'
	
	def readData(self,rollno,name,marks):
		self.__rollno = rollno
		self.__name = name
		self.__marks = marks
		self.__calculate()
		
	def displayData(self):
		print("Roll Num: "+ str(self.__rollno))
		print("Name: "+ self.__name)
		print("grade: "+ self.__grade)
		
	def sortName(obj):
		for i in range(len(obj)):
			for j in range(len(obj)-1):
				if obj[j].__name > obj[j+1].__name:
					obj[j],obj[j+1] = obj[j+1],obj[j]
		for i in range(len(obj)):
			print(obj[i].__rollno,obj[i].__name,obj[i].__grade)
		
st1 = Student()
st1.readData(1,"swaraj",[33,11,29,77])
st1.displayData()
print("-----------")
st2 = Student()
st2.readData(2,"abhishek",[91,98,80,42])
st2.displayData()
print("-----------")
st3 = Student()
st3.readData(3,"chinmay",[88,89,87,86])
st3.displayData()
print("-----------")
obj = []
obj.append(st1)
obj.append(st2)
obj.append(st3)

Student.sortName(obj)
