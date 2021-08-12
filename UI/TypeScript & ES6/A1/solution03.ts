let Order = {
    id: 101,
    title: "pizza",
    price: "220",
    printOrder: function() {
        return (this.id);
    },
    printPrice: function() {
        return (this.price);
    }
}

console.log(Order);


const new_obj = Object.assign({}, Order);

console.log(new_obj);
