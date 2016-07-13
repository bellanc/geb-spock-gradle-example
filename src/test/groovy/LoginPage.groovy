import geb.Page;

class LoginPage extends Page {

    static url = "http://manifestsc.com"

    static content = {
        news { $("a", text: "NEWS") }
        opportunities { $("a", text: "OPPORTUNITIES")

        }
    }

}
