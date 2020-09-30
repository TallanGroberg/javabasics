// Create a function that takes the number of wins, draws and losses and calculates the number of points a football team has obtained so far.

func footballPoints(_ wins: Int, _ draws: Int, _ losses: Int) -> Int {
	var winningPoints = wins * 3
	var total = winningPoints + draws
	return total
}
