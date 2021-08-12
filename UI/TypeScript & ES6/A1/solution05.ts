const username = "frankie";

function add() {
    arr.push("A");
    arr.push("B");
    arr.push("C");
}


const userFriends = (username, ...friends) {
    console.log(username);

    for(let i of friends) {
        console.log(i);
    }
};

const arr = [];
add();
userFriends(username, ...arr);

const printCapitalNames = (...names) => {
    for(let i of names) {
        console.log(i);
    }
}

printCapitalNames("orange", "apple", "avocado", "mango", "berry");
