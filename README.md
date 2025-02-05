# Stock API Tracker

## Overview
Stock API Tracker is a Spring Boot application that provides real-time stock market data using external APIs. The application allows users to fetch stock prices, historical data, and company information.

## Features
- Retrieve real-time stock prices
- Fetch historical stock data
- Search for company details
- RESTful API endpoints for easy integration
- Caching for optimized performance
- Error handling and logging

## Technologies Used
- Java (Spring Boot)
- REST API
- OpenAPI/Swagger for documentation
- H2/PostgreSQL (optional, if data storage is required)
- Caching mechanism (Redis or in-memory caching)
- Lombok (for reducing boilerplate code)
- Maven (for dependency management)

## Installation & Setup

### Prerequisites
- Java 17+ (Ensure JDK is installed)
- Maven
- (Optional) Redis for caching

### Steps
1. Clone the repository:
   ```sh
   git clone https://github.com/codebyAbhishekBharti/Stock_API_Track.git
   cd Stock_API_Track
   ```
2. Install dependencies:
   ```sh
   mvn clean install
   ```
3. Configure API keys (if using external stock data providers)
   - Update `application.properties` or `application.yml` with API keys
   ```properties
   stock.api.key=YOUR_API_KEY
   ```
4. Run the application:
   ```sh
   mvn spring-boot:run
   ```

## API Endpoints
| Endpoint | Method | Description |
|----------|--------|-------------|
| `/api/stocks/{symbol}` | GET | Get real-time stock price |
| `/api/stocks/{symbol}/history?range={days}` | GET | Get historical stock data |
| `/api/companies/{symbol}` | GET | Fetch company details |

## Example Usage
To fetch real-time stock data for Apple (AAPL):
```sh
curl -X GET "http://localhost:8080/api/stocks/AAPL" -H "Accept: application/json"
```

## Contributing
Contributions are welcome! Feel free to open an issue or submit a pull request.

## License
This project is licensed under the MIT License.

## Contact
For any queries, reach out to **Abhishek Kumar Bharti**
- GitHub: [codebyabhishekbharti](https://github.com/codebyabhishekbharti)
- LinkedIn: [abhishek-bharti-dev](https://linkedin.com/in/abhishek-bharti-dev)

