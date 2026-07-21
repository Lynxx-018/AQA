# MTS.by Automated Tests

Automated test suite for the **"Онлайн пополнение без комиссии"** (Online Recharge without Commission) block on the MTS.by website.

## Test Coverage

- ✅ Block header text verification
- ✅ Payment system logos presence and count
- ✅ "Подробнее о сервисе" link functionality
- ✅ Form submission flow leading to payment page
- ✅ Error handling for empty phone number
- ✅ Error handling for empty amount

## Tech Stack

- Java 17
- Selenium WebDriver
- TestNG
- WebDriverManager
- Maven

## Setup and Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/mts-tests.git
   cd mts-tests
