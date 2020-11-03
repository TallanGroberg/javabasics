function sumMissingNumbers(arr) {

    let sorted = arr.sort((x,y) => x - y)
    let missing = []
    for (let i = sorted[0]; i < sorted[sorted.length -1]; i++) {
        const element = i;
        if(sorted.indexOf(element) === - 1) {
            missing.push(element)
        }
        
    }
	return missing.reduce( (f,t) => f + t, 0)
}

// const sumMissingNumbers = a => {
// 	let tot = 0;
// 	for (let i = Math.min(...a) + 1, j = Math.max(...a); i < j; i++)
// 		if (!a.includes(i)) tot += i;
// 	return tot;
// }

// const sum = arr => arr.reduce((total, num) => total + num, 0);

// const sumMissingNumbers = arr => {
//   const min = Math.min(...arr);
//   const max = Math.max(...arr);

//   return (max - min + 1) * ((min + max) / 2) - sum(arr);
// };

console.log(sumMissingNumbers([1, 3, 5, 7, 10]) )
// 2 + 4 + 6 + 8 + 9 = 29

console.log(sumMissingNumbers([10, 7, 5, 3, 1]) )
//  = 29
console.log(sumMissingNumbers([10, 20, 30, 40]))
// =  1575