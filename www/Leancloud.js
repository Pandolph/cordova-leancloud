var exec = require('cordova/exec')

var Leancloud = function () {
    this.name = "Leancloud";
};

Leancloud.prototype.api = function (succ,error,opt,option) {
  exec(succ, error, "Leancloud", opt,[option]);
};

module.exports = new Leancloud();
