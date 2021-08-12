class Account {

    bal1( prevNo,curNo) {
        this.prevNo = prevNo;
        this.curNo =curNo;
        return this.prevNo + this.curNo;

    }
}

    let ob = new Account();
    let n1=0, n2=1, nextTerm;
    for(i=0 ; i<10 ; i++) {
        document.writeln(n1 + ",   ");
        nextTerm = ob.bal1(n1, n2);
        n1 = n2;
        n2 = nextTerm;
    }
