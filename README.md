spring application with postgres

user roles and base64 password encryption
Person needs data and username+password
GET/car/** only visible when authenticated

OpenAPI: http://localhost:8080/swagger-ui.html

GET Persons:
http://localhost:8080/persons
POST Person:
http://localhost:8080/persons
{
"name": "vly Vly",
"age": 22,
"username": "vlys",
"password": "bigpassword"
}

authenticate in postman:
GET: http://localhost:8080/car
Authorization: Username: vlys Password: bigpassword
Body, raw, -> /
get list of all cars