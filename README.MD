
# Search bar exercise

Project made to exercise algorithm to search of a string in an array of [data](https://www.cp.pt/passageiros/pt/consultar-horarios/estacoes). As the user types each character, the display show all valid choices for the next character and list of possible matching items.


## Tecnologies and libs

 - [Spring Boot](https://spring.io/projects/spring-boot)


## Run Locally

- Clone the project

```bash
  git clone https://github.com/luisscarlos/search-bar-api
```

- Import to your preferred IDE
- Run the file ClevertiApplication.java
- Open http://localhost:8080 in your browser

## Routes
| Method  | Path  | Description  |
| ------------ | ------------ | ------------ |
| GET  |  / | List all items |
| GET  | /search/{name}  | List items that matches with param  |

## License

[MIT](https://choosealicense.com/licenses/mit/)

