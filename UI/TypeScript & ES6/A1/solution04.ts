const result = (myArr) => {
    for(const i of myArr) {
        let len = i.length;
        
        let obj = {
            name: i,
            length: len
        };
        newArr.push(obj);
    }
    return(newArr);
}
let newArr = [];
let myArr = ["orange", "apple", "mango"];
const sol = result(myArr);
console.log(myArr);
console.log(sol);