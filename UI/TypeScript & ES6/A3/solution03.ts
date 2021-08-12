interface Printable {
    id: number,
    name: string
}

let circle: Printable = {
    id: 101,
    name: "circle one"
}

let employee: Printable = {
    id: 104,
    name: "employee one"
}

let printAll = (c,e) => {
    print(c);
    print(e);
} 

let print = (obj) => {
    console.log(obj);
}

printAll(circle, employee);