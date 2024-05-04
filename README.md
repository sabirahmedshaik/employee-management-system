REST APIs Employee Management System using Spring Boot
***********************************************************
Spring Boot Project Architecture:

Post Client ⬄ Controller ⬄ Server ⬄ DAO ⬄ DB
***********************************************************
Rest Client should be able to:
➪ Get a list of employee
➪ Get a single employee by id
➪ Create a new employee
➪ Update an existing employee
➪ Delete an employee
**********************************
REST APIs for Employee Resource

|  HTTP Method  |       URL Path     |  Status Code  |           Description            |
| :-------------|:-------------------| :-------------| :--------------------------------|
| Get           | /api/employees     |  200 (OK)     | Get all employees                |
| Get           | /api/employees/{id}|  200 (OK)     | Get single employee by id        |
| Get           | /api/employees     |  201 (Created)| Create a new employee            |
| Get           | /api/employees/{id}|  200 (OK)     | Update existing employee with id |
| Get           | /api/employees/{id}|  200 (OK)     | Delete and employee by id        |

*********************************************************************************************
