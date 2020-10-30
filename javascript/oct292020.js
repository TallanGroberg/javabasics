function zipIt(women, men) {
    let pairs = women.length === men.length 
    ? women.map((woman, i) => [woman, men[i]]) 
    : "sizes don't match"
    return pairs;
}

console.log(zipIt(["Elise", "Mary"], ["John", "Rick"]))
//  ➞ [["Elise", "John"], ["Mary", "Rick"]]

console.log(zipIt(["Ana", "Amy", "Lisa"], ["Bob", "Josh"]))
//  ➞ "sizes don't match"

console.log(zipIt(["Ana", "Amy", "Lisa"], ["Bob", "Josh", "Tim"]))
//  ➞ [["Ana", "Bob"], ["Amy", "Josh"],["Lisa", "Tim"]]

/*when you run into a situation where you want to zipper in two arrays, you can make sure that the lengths are the same and map through either one. On the map you can have 2 arguments, first, is the interation and the second is the incrementals reference count. by using the reference count, you can say add these two arrays together.
the beauty of doing this instead of a forloop. 
*/