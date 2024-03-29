## TestingBot - Java & JUnit

TestingBot provides a grid of browsers and mobile devices to run Automated tests.
This example demonstrates how to use Java with JUnit to run a test on a Real Mobile Device.

### Environment Setup

1. Setup
	* Clone this repository
	* Install dependencies `mvn install`

2. TestingBot Credentials
    * Add your TestingBot Key and Secret as environmental variables. You can find these in the [TestingBot Dashboard](https://testingbot.com/members/).
    ```
    $ export TB_KEY=<your TestingBot Key>
    $ export TB_SECRET=<your TestingBot Secret>
    ```

## Running Tests
* To run a single test, run `mvn test -P single`

You will see the test result in the [TestingBot Dashboard](https://testingbot.com/members/)

### Resources
##### [TestingBot Documentation](https://testingbot.com/support/mobile/java.html)

##### [Appium Documentation](https://appium.io/)