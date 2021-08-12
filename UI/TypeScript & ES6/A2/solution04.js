const chatRooms = new Set([
    {name: "user1", room: "React", message: "a message from user 1"},
    {name: "user2", room: "React", message: "a message from user 2"},
    {name: "user3", room: "React", message: "a message from user 3"},
    {name: "user4", room: "Spring", message: "a message from user 4"},
    {name: "user5", room: "Spring", message: "a message from user 5"},
    {name: "user6", room: "Spring", message: "a message from user 6"}
]);

var reactUsersMap = new Map();
var springUsersMap = new Map();

var getEntriesArry = chatRooms.entries();
  
for(let i=0 ; i<chatRooms.size ; i++) {
    let chatRoom = getEntriesArry.next().value;
    if(chatRoom[0].room === "React") {
        reactUsersMap.set(chatRoom[0].name, chatRoom[0].room);
    } else {
        springUsersMap.set(chatRoom[0].name, chatRoom[0].room);
    }
}


console.log("users in React room:");
console.log(reactUsersMap);
console.log("users in Spring room:");
console.log(springUsersMap);


// Set(4) {"🍉", "🍎", "🍈", "🍏"}

const reactMessages = [];
const springMessages = [];
for(const value of chatRooms) {
    if(value.room == "React") {
        reactMessages.push(value.message);
    } else {
        springMessages.push(value.message);
    }
}
console.log("messages in React room:");
console.log(reactMessages);
console.log("messages in Spring room:");
console.log(springMessages);