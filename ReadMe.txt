Page Object Model

It is not a framework but rather a design pattern which helps to maintain the code and avoid duplication of code
Basic premise is that the elements are stored seperately for each page in a different class file. Eg. HomePage.java, LoginPage.java, etc. These files also include methods which can be used to perform standard operations belonging to those elements like login,  logout, etc. These files are kind of Object repository.
The testcases are written in separate class files where in the testcases, we just mention the elements and methods written in the page class files.
Most important benefit of using this is that if there is any change in the page elements, we just need to make those changes in the page files and nothing needs to be changed in the testcases.

There are 2 ways to implement this
1. Without PageFactory Class: here we use By class to identify elements. 
// To identify the elements and store them in page class file
By username = By.id("login1");

//To create an object of the page class in the testcase class file
LoginPage login = new LoginPage(driver);

2. With PageFactory Class: here we use the pagefactory class which has a method to initialize all the webelements stored under the page class file.

// To identify the elements and store them in page class file
@FindBy(id="password") WebElement password;
@FindBy(how=How.NAME,using="proceed") WebElement loginButton;

//To create an object of the page class in the testcase class file
LoginPageWithPageFactory login = PageFactory.initElements(driver, LoginPageWithPageFactory.class);

Main Advantage of Using PageFactory
It allows you to store element in cache lookup.  This results in quicker execution of testcases. Though this should only be used if we are sure that those elements are not going to be changed in the future. 
Caching is done through this method.
@FindBy(id="login1") 
@CacheLookup
WebElement username;


Browser Factory
This is not related to page Object model and can be implemented in any framework.
It helps to take name of browser as input from the user while running testcases.
Also it saves on the duplication of code related to setting up the browser exe file path and opening up browser, setting up implicit wait, maximizing window, etc

#This is a dummy line. Need to be ignored.
