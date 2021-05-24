# Account Information API
Java Springboot API
 ##### Developed By: 
[Rushabh Pancholi](https://www.linkedin.com/in/rushabh-pancholi-62235b166/)

**Title**
----
 
* **URL**

  For all accounts:  http://localhost:8081/accounts/ <br/>
  For all transactions: http://localhost:8081/transaction/ <br/>
  For specific account transaction: http://localhost:8081/transaction/acc?no=321143048
  
  Method:`GET`

* **Success Response:**

  * **Code:** 200 Ok <br />
    **Sample Content:** `{ "accountNumber": 123456789,
            "accountName": "SGSavings123",
            "accountType": "Savings",
            "balanceDate": "11/11/2011",
            "currencyType": "SGD",
            "openingBalance": 22222.22 }`
 
* **Error Response:**

  * **Code:** 500 Internal Server Error <br />

* **Usage Instruction Steps:**
 1. Download the project.
 2. Install all the dependencies: Springboot and Maven
 3. Run the project, look for "application started" message in console.
 4. Open browser or postman: hit the api, get the JSON response.

Thanks for reading.
