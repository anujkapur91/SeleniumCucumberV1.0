$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/featureFile2.feature");
formatter.feature({
  "name": "Login to Amazon two",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login With Correct Credentials 1",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Launches Amazon Webpage \"\u003cBrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User Navigates to Login Link",
  "keyword": "When "
});
formatter.step({
  "name": "User logins with Username  and Password",
  "keyword": "Then ",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "anujkapur91@gmail.com",
        "Rockye08$"
      ]
    },
    {
      "cells": [
        "anujkapur19@gmail.com",
        "Rockye08$"
      ]
    }
  ]
});
formatter.step({
  "name": "User types \"\u003cProduct\u003e\" \"\u003cModel\u003e\" name and searches and selects the first listing",
  "keyword": "Then "
});
formatter.step({
  "name": "User goes to cart and removes the product",
  "keyword": "Then "
});
formatter.step({
  "name": "User Logs Out",
  "keyword": "Then "
});
formatter.step({
  "name": "User closes Browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Browser",
        "Product",
        "Model"
      ]
    },
    {
      "cells": [
        "FireFox",
        "OnePlus",
        "7T"
      ]
    },
    {
      "cells": [
        "Chrome",
        "OnePlus",
        "7t pro"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login With Correct Credentials 1",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launches Amazon Webpage \"FireFox\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.user_Launches_Amazon_Webpage_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Navigates to Login Link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_Navigates_to_Login_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logins with Username  and Password",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "anujkapur91@gmail.com",
        "Rockye08$"
      ]
    },
    {
      "cells": [
        "anujkapur19@gmail.com",
        "Rockye08$"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_logins_with_Username_and_Password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"OnePlus\" \"7T\" name and searches and selects the first listing",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_types_name_and_searches_and_selects_the_first_listing(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User goes to cart and removes the product",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_goes_to_cart_and_removes_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Logs Out",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_Logs_Out()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User closes Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_closes_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login With Correct Credentials 1",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launches Amazon Webpage \"Chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.user_Launches_Amazon_Webpage_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Navigates to Login Link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_Navigates_to_Login_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logins with Username  and Password",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "anujkapur91@gmail.com",
        "Rockye08$"
      ]
    },
    {
      "cells": [
        "anujkapur19@gmail.com",
        "Rockye08$"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_logins_with_Username_and_Password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"OnePlus\" \"7t pro\" name and searches and selects the first listing",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_types_name_and_searches_and_selects_the_first_listing(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User goes to cart and removes the product",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_goes_to_cart_and_removes_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Logs Out",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_Logs_Out()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User closes Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_closes_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login With Correct Credentials 2",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Launches Amazon Webpage \"\u003cBrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User Navigates to Login Link",
  "keyword": "When "
});
formatter.step({
  "name": "User logins with Username  and Password",
  "keyword": "Then ",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "anujkapur91@gmail.com",
        "Rockye08$"
      ]
    },
    {
      "cells": [
        "anujkapur19@gmail.com",
        "Rockye08$"
      ]
    }
  ]
});
formatter.step({
  "name": "User types \"\u003cProduct\u003e\" \"\u003cModel\u003e\" name and searches and selects the first listing",
  "keyword": "Then "
});
formatter.step({
  "name": "User goes to cart and removes the product",
  "keyword": "Then "
});
formatter.step({
  "name": "User Logs Out",
  "keyword": "Then "
});
formatter.step({
  "name": "User closes Browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Browser",
        "Product",
        "Model"
      ]
    },
    {
      "cells": [
        "FireFox",
        "OnePlus",
        "7T"
      ]
    },
    {
      "cells": [
        "Chrome",
        "OnePlus",
        "7t pro"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login With Correct Credentials 2",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launches Amazon Webpage \"FireFox\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.user_Launches_Amazon_Webpage_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Navigates to Login Link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_Navigates_to_Login_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logins with Username  and Password",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "anujkapur91@gmail.com",
        "Rockye08$"
      ]
    },
    {
      "cells": [
        "anujkapur19@gmail.com",
        "Rockye08$"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_logins_with_Username_and_Password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"OnePlus\" \"7T\" name and searches and selects the first listing",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_types_name_and_searches_and_selects_the_first_listing(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User goes to cart and removes the product",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_goes_to_cart_and_removes_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Logs Out",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_Logs_Out()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User closes Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_closes_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login With Correct Credentials 2",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launches Amazon Webpage \"Chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.user_Launches_Amazon_Webpage_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Navigates to Login Link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_Navigates_to_Login_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logins with Username  and Password",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "anujkapur91@gmail.com",
        "Rockye08$"
      ]
    },
    {
      "cells": [
        "anujkapur19@gmail.com",
        "Rockye08$"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_logins_with_Username_and_Password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"OnePlus\" \"7t pro\" name and searches and selects the first listing",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_types_name_and_searches_and_selects_the_first_listing(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User goes to cart and removes the product",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_goes_to_cart_and_removes_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Logs Out",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_Logs_Out()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User closes Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_closes_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});