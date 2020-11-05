function sumMissingNumbers(arr) {

    arr.sort((x,y) => x - y)
    let count = 0;
    for (let i = arr[0]; i < arr[arr.length -1]; i++) {
        arr.indexOf(i) === - 1 ? count += i : count;
    }
	return count
}





console.log(sumMissingNumbers([1, 3, 5, 7, 10]) )
// 2 + 4 + 6 + 8 + 9 = 29

console.log(sumMissingNumbers([10, 7, 5, 3, 1]) )
//  = 29
console.log(sumMissingNumbers([10, 20, 30, 40]))
// =  1575