const fruits = ["apple", "mango", "banana", "berry"];

const [one, two, three, four] = fruits;

console.log(three);

const organization = {
    name: "kiki",
    address: {
        street: "lane99",
        district: "wonderland",
        zip: 100001
    }
};  

const {name, address: {zip: zipcode}} = organization;

console.log(zipcode);