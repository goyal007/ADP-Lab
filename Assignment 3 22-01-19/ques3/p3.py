class Player:	
	def read_data(self,name,scores):
		self.name = name
		self.scores = scores
		
	def average(self):
		avg = sum(self.scores)/len(self.scores)
		return avg
	
	def total_score(self):
		return sum(self.scores)
		
	def print_details(self):
		print(self.name)
		print("Total Runs -> " + str(self.total()))
		print("Average Runs -> "+ str(self.average()))
		
	def getName(self):
		return self.name
	
print("Enter the total number of matches")
matches = int(input())	
print("Enter the total number of players")
pcount = int(input())

players = [Player() for i in range(pcount)] #list comprehension
for i in range(pcount):
	name = input("Enter the name of the player")
	score = []
	print("Enter the scores for "+ str(matches)+"number of matches")
	for j in range(matches):
		val = int(input())
		score.append(val)
	players[i].read_data(name,score)
	players[i].print_details()
	print()
	
maxScore = players[0].total_score()
maxName = players[0].getName()

for i in range(1,len(players)):
	if players[i].total() > maxScore:
		maxScore = players[i].total_score()
		maxName = players[i].getName()

print("Player who scored highest total is "+maxName)
		
		
