class Student:
	def __init__(self):
		self._rollno=0
		self._name=""
		self._marks=[0.0,0.0,0.0,0.0]
		self._grade=0.0
	def _calculate(self):
		self._grade=sum(self._marks)/len(self._marks)
	def readData(self,roll,name,marks):
		self._rollno=roll
		self._name=name
		self._marks=marks
		self._calculate()
	def displayData(self):
		print("Roll No: ", self._rollno)
		print("Name: ", self._name)
		print("Marks: ", self._marks)
		print("Grade: ", self._grade)
	#good 
	def __lt__(self, other):
		return self._name < other._name
	def sortName(self, students):
		return sorted(students)
		
if __name__=="__main__":
	s=[]
	for i in range(5):
		s.append(Student())
	s[0].readData(1100,"Abhishek",[86.0,77.0,89.0,81.0])
	s[1].readData(1663,"Swaraj",[43.0,64.0,72.0,56.0])
	s[2].readData(1092,"Pawan",[65.0,82.0,77.0,69.0])
	s[3].readData(1100,"Ashish",[55.0,94.0,72.0,96.0])
	s[4].readData(1098,"Utsav",[77.0,64.0,99.0,76.0])
	s=s[0].sortName(s)
	for i in range(5):
		s[i].displayData()
