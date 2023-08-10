# News API with Spring Boot

This is a Spring Boot project that provides an API for managing news articles and categories.

## API Endpoints

### News

- Retrieve All News Articles

  - URL: `/api/news`
  - Method: GET
  - Description: Retrieve a list of all news articles.

- Retrieve a Single News Article

  - URL: `/api/news/{id}`
  - Method: GET
  - Description: Retrieve a single news article.
  - Path Variable:
    - `id` (Long): The ID of the news article to retrieve.

- Create a New News Article

  - URL: `/api/news`
  - Method: POST
  - Description: Create a new news article.
  - Request Body Parameters:
    - `title` (string): The title of the news article.
    - `shortDescription` (string): A short description of the news article.
    - `content` (string): The content of the news article.
    - `categoryCode` (string): The code of the category to which the news article belongs.

- Update a News Article

  - URL: `/api/news/{id}`
  - Method: PUT
  - Description: Update an existing news article.
  - Path Variable:
    - `id` (Long): The ID of the news article to update.
  - Request Body Parameters (same as create):


- Delete News Articles

  - URL: `/api/news`
  - Method: DELETE
  - Description: Delete multiple news articles.
  - Request Body:
    - `ids` (array of Long): The IDs of the news articles to delete.

### Category

- Retrieve All Categories

  - URL: `/api/category`
  - Method: GET
  - Description: Retrieve a list of all categories.

- Create a New Category

  - URL: `/api/category`
  - Method: POST
  - Description: Create a new category.
  - Request Body Parameters:
    - `name` (string): The name of the category.
    - `code` (string): The code of the category.

- Update a Category

  - URL: `/api/category/{id}`
  - Method: PUT
  - Description: Update an existing category.
  - Path Variable:
    - `id` (Long): The ID of the category to update.
  - Request Body Parameters (same as create):

- Delete Categories

  - URL: `/api/category`
  - Method: DELETE
  - Description: Delete multiple categories.
  - Request Body:
    - `ids` (array of Long): The IDs of the categories to delete.

## Author

This project was created by Nguyen Huu Loc.

Feel free to contribute to the project by submitting pull requests or reporting issues.
