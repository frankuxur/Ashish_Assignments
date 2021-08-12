var __spreadArray = (this && this.__spreadArray) || function (to, from) {
    for (var i = 0, il = from.length, j = to.length; i < il; i++, j++)
        to[j] = from[i];
    return to;
};
var username = "frankie";
function add() {
    arr.push("A");
    arr.push("B");
    arr.push("C");
}
var userFriends = function (username) {
    var friends = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        friends[_i - 1] = arguments[_i];
    }
    console.log(username);
    for (var _a = 0, friends_1 = friends; _a < friends_1.length; _a++) {
        var i = friends_1[_a];
        console.log(i);
    }
};
var arr = [];
add();
userFriends.apply(void 0, __spreadArray([username], arr));
var printCapitalNames = function () {
    var names = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        names[_i] = arguments[_i];
    }
    for (var _a = 0, names_1 = names; _a < names_1.length; _a++) {
        var i = names_1[_a];
        console.log(i);
    }
};
printCapitalNames("orange", "apple", "avocado", "mango", "berry");
//# sourceMappingURL=solution05.js.map