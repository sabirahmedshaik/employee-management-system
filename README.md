<h2>REST APIs Employee Management System using Spring Boot</h2>

Spring Boot Project Architecture:
<h2>Post Client ⬄ Controller ⬄ Server ⬄ DAO ⬄ DB</h2>

Rest Client should be able to:
<ol>
<li>Get a list of employee</li>
<li>Get a single employee by id</li>
<li>Create a new employee</li>
<li>Update an existing employee</li>
<li>Delete an employee</li>
</ol>

REST APIs for Employee Resource:

|  HTTP Method  |       URL Path     |  Status Code  |           Description            |
| :-------------|:-------------------| :-------------| :--------------------------------|
| Get           | /api/employees     |  200 (OK)     | Get all employees                |
| Get           | /api/employees/{id}|  200 (OK)     | Get single employee by id        |
| Post          | /api/employees     |  201 (Created)| Create a new employee            |
| Put           | /api/employees/{id}|  200 (OK)     | Update existing employee with id |
| Delete        | /api/employees/{id}|  200 (OK)     | Delete and employee by id        |
