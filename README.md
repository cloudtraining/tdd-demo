# Test Driven Development (TDD) Hands On

## Exercise
practice pair programming using TDD and taking turns at  driver/navigator.  build from bottom up one class at a time and switch who is driver and navigator.
## Model

### `Person`
- description: this is the model class in the MVC paradigm
- attributes:
        `firstName`
        `lastName`
- behavior:
        `formatFullName`

### `PersonReopository`
- description: this would be the DAO layer but is hard coded to return a fixed amount of `Person` in our example.  this is a spring @Repository
- attributes:
- behavior:
        `findAllByLastName`

### `PersonService`
- description: service layer to make call to repo layer. this is a spring @Service.
- attributes:
        `personReopository`
- behavior:
        `findAllByLastName`

### `PersonController`
- description: rest controller layers to support `get` calls from `/personController/findAllPeopleWithLastName.  this is a spring @RestController
- attributes:
        `personService`
- behavior:
        `findAllPeopleWithLastName`
