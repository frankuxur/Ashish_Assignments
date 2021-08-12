const armstrongNo = [153, 370, 371, 407, 1634, 8208, 9474, 54748];

function createIterator(array) {
    let count = 0;
    return {
        next: function() {
            return count<array.length?
            {value: array[count++], done: false}:
            {value: undefined, done: true};
        }
    }
}

let getNextArmstrong = createIterator(armstrongNo);

console.log(getNextArmstrong.next());
console.log(getNextArmstrong.next());
console.log(getNextArmstrong.next());
console.log(getNextArmstrong.next());
console.log(getNextArmstrong.next());
console.log(getNextArmstrong.next());
console.log(getNextArmstrong.next());
console.log(getNextArmstrong.next());
console.log(getNextArmstrong.next());