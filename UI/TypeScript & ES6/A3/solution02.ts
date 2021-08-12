class Account {
    constructor(public id: number, public name1: string, public bal1: number){

    }
}

class SavingsAccount extends Account {

    constructor(public id: number, public name1: string, public bal1: number, public interest: number, public credit: number) {
        super(id, name1, bal1);
    }

    bal( bal1,intrest,credit ) {
        this.bal1 = bal1;
        this.interest = intrest;
        this.credit = credit;
        return this.bal1 * this.interest * this.credit;

    }
}

class CurrentAccount extends Account {
    constructor(public id: number, public name1: string, public bal1: number, public interest: number, public credit: number) {
        super(id, name1, bal1);
    }
    
    bal2( bal,intrest,credit ) {
        this.bal1 = bal;
        this.interest = intrest;
        this.credit = credit;
        return this.bal1 * this.interest * this.credit * 0.5;

    }
}


var acc1 = new SavingsAccount(101, "A", 100, 10, 5);
var acc2 = new CurrentAccount(102, "B", 200, 20, 15);

console.log(acc1.bal(100, 10, 5));

console.log(acc2.bal2(200, 20, 15));
