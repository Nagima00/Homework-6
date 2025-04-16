// README.md
Homework-6: Behavioral Design Patterns

Task 1: Chain of Responsibility
In this task, we implemented the Chain of Responsibility design pattern as a Tech Support Request Handler. Each support level either handles the issue itself or escalates it to the next level.

User Issues:
- FAQBotHandler: "password_reset"
- JuniorSupportHandler: "refund_request", "billing_issue"
- SeniorSupportHandler: "account_ban", "data_loss"

Task 2: Command Pattern
In this task, we implemented the Command Pattern design pattern in a Smart Home Remote Control application. Each command is executed for specific devices.

Devices:
- Light: Turn on/off the light
- Thermostat: Set the temperature

Commands:
- TurnOnLightCommand: Turn on the light
- SetThermostatCommand: Set the temperature
