var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Account = /** @class */ (function () {
    function Account(id, name1, bal1) {
        this.id = id;
        this.name1 = name1;
        this.bal1 = bal1;
    }
    return Account;
}());
var SavingsAccount = /** @class */ (function (_super) {
    __extends(SavingsAccount, _super);
    function SavingsAccount(id, name1, bal1, interest, credit) {
        var _this = _super.call(this, id, name1, bal1) || this;
        _this.id = id;
        _this.name1 = name1;
        _this.bal1 = bal1;
        _this.interest = interest;
        _this.credit = credit;
        return _this;
    }
    SavingsAccount.prototype.bal = function (bal1, intrest, credit) {
        this.bal1 = bal1;
        this.interest = intrest;
        this.credit = credit;
        return this.bal1 * this.interest * this.credit;
    };
    return SavingsAccount;
}(Account));
var CurrentAccount = /** @class */ (function (_super) {
    __extends(CurrentAccount, _super);
    function CurrentAccount(id, name1, bal1, interest, credit) {
        var _this = _super.call(this, id, name1, bal1) || this;
        _this.id = id;
        _this.name1 = name1;
        _this.bal1 = bal1;
        _this.interest = interest;
        _this.credit = credit;
        return _this;
    }
    CurrentAccount.prototype.bal2 = function (bal, intrest, credit) {
        this.bal1 = bal;
        this.interest = intrest;
        this.credit = credit;
        return this.bal1 * this.interest * this.credit * 0.5;
    };
    return CurrentAccount;
}(Account));
var acc1 = new SavingsAccount(101, "A", 100, 10, 5);
var acc2 = new CurrentAccount(102, "B", 200, 20, 15);
console.log(acc1.bal(100, 10, 5));
console.log(acc2.bal2(200, 20, 15));
//# sourceMappingURL=solution02.js.map