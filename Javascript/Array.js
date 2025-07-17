const arr=[1,2,3,4,5]
console.log(arr[4]);
arr.map((i) => {
    console.log(i);
})

console.log("for each loop")
arr.forEach((i) => {
    console.log(i);
})

let num = arr.filter(i => i % 2 == 0);

console.log(num);