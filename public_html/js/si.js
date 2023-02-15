class SIUnit {

    constructor() {
        this.prefixes = {};
        this.prefixes["-12"] = "p";
        this.prefixes["-9"] = "n";
        this.prefixes["-6"] = "u";
        this.prefixes["-3"] = "m";
        this.prefixes["0"] = "";
        this.prefixes["3"] = "k";
        this.prefixes["6"] = "M";
    }

    getsikeyvalue() {
        return Object.keys(this.prefixes).reduce((ret, key) => {
            ret[ this.prefixes[key]] = Math.pow(10,parseInt(key));
            return ret;
        }, {});
    }
    selectsikeyvalue(arr) {
        let dat = this.getsikeyvalue();
        let out = {};
        for (let i in arr) {
            if (dat.hasOwnProperty(arr[i])) {
                out[arr[i]] = dat[arr[i]];
            }
        }
        return out;
    }
    tosistring(value){
       let tval = Math.abs(value);
        const  negsign = value < 0;

        let order = 0;
        if (tval == 0) {
            return "0";
        }
        while (tval > 1000.0) {
            tval /= 1000.0;
            order += 3;
        }
        while (tval < 1.0) {
            tval *= 1000.0;
            order -= 3;
        }
        tval=tval.toFixed(2);
        if (this.prefixes.hasOwnProperty(order.toString())) {
            if (negsign) {
                return "-" + tval+ this.prefixes[order];
            }
            return tval + this.prefixes[order];
        }
        return value;  
    }
}

