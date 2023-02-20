class MinQuery {
    docready(cb) {
        window.addEventListener('DOMContentLoaded', function (e) {
            cb(e);
        });
    }
    s(q) {
        let arr = [];
        [].forEach.call(document.querySelectorAll(q), function (dom) {
            arr.push(dom);
        });
        return  new MinQuery_Chain(arr);
    }
}

class MinQuery_Chain {

    constructor(dom) {
        this.dom = dom;
    }
    attr(...args) {
        if (args.length == 1) {
            let out = [];
            this.dom.forEach(function (item) {
                out.push(item.getAttribute(args[0]));
            });
            return out;
        } else if (args.length == 2) {
            this.dom.forEach(function (item) {
                if (args[1] == null) {
                    item.removeAttribute(args[0]);
                } else {
                    item.setAttribute(args[0], args[1]);
                }

            });

        }
        return this;
    }
    addoption(array) {
        this.dom.forEach(function (item) {
            if (item.tagName == "SELECT") {
                if (Array.isArray(array)) {
                    for (let i in array) {
                        const option = item.appendChild(document.createElement("option"));
                        option.innerHTML = array[i];
                        option.value = array[i];
                    }
                } else {
                    for (let k in array) {
                        const option = item.appendChild(document.createElement("option"));
                        option.innerHTML = k;
                        option.value = array[k];
                    }
                }
            }
        });
        return this;
    }
    click(cb) {
        this.dom.forEach(function (item) {
            item.addEventListener("click", cb);
        });
        return this;
    }
    html(text) {
        this.dom.forEach(function (item) {
            item.innerHTML = text;
        });
    }
    tab(q, attr, cb) {
        this.dom.forEach(function (item) {
            item.addEventListener("click", function () {
                const attrname = this.tabs.attr;
                const attrvalue = this.getAttribute(attrname);
                [].forEach.call(this.tabs.dom, function (dom) {
                    if (dom.getAttribute(attrname) == attrvalue) {
                        dom.style.display = "";
                        if (getComputedStyle(dom, null).getPropertyValue("display") == "none") {
                            dom.style.display = "revert";
                        }

                    } else {
                        dom.style.display = "none";
                    }
                });
                if (typeof cb === "function") {
                    cb(attrvalue);
                }
            });
            item.tabs = {};
            item.tabs.dom = document.querySelectorAll(q);
            item.tabs.attr = attr;
        });
        this.dom[0].click();
        return this;
    }
    val(...args) {
        if (args.length == 0) {
            let out = [];
            this.dom.forEach(function (item) {
                out.push(item.value);
            });
            return out;
        } else if (args.length == 1) {
            this.dom.forEach(function (item) {
                item.value(args[0]);
            });
        }
        return this;
    }
    valbyname() {
        let out = {};
        this.dom.forEach(function (item) {
            if (item.getAttribute("name") !== null) {
                const  name = item.getAttribute("name");
                if (out.hasOwnProperty(name)) {
                    out[name] = out[name] + "," + item.value;
                } else {
                    out[name] = item.value;
                }
            }
        });
        return out;
    }
}
