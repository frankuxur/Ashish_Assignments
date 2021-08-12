var result = function (myArr) {
    for (var _i = 0, myArr_1 = myArr; _i < myArr_1.length; _i++) {
        var i = myArr_1[_i];
        var len = i.length;
        var obj = {
            name: i,
            length: len
        };
        newArr.push(obj);
    }
    return (newArr);
};
var newArr = [];
var myArr = ["orange", "apple", "mango"];
var sol = result(myArr);
console.log(myArr);
console.log(sol);
//# sourceMappingURL=solution04.js.map