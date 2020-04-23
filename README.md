# Cucumber JVM, Appium, Spring DI , Cross Mobile Platform

This is an example maven framework project demonstrating, the use of Cucumber JVM, Springs dependency injection with Appium Driver for testing KickStarter opensource native iOS/Android app.

<h2>Dependency Injection</h2>
The project has been setup in a way such each platforms page object is driven from a single page, which defines both iOS and Android locators.


I have created a custom page object Spring annotation 
```
@Target(TYPE)
@Retention(RUNTIME)
@Component
public @interface PageObject {
}
```
```
@Override
public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
  if (bean.getClass().isAnnotationPresent(PageObject.class)) {
      PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, Duration.ofSeconds(10)), bean);
   }
   return bean;
 }
```
Marking a class ```@PageObject``` will initailise all Appium page elements, removing the need to add an constructor to page object classes.

<h2>Page Objects</h2>

Page objects classes define a single method with iOS ```@iOSXCUITFindBy``` and Android ```@AndroidFindBy``` annotation.
Whenever an Android driver is being instantiated for my test, the ```@AndroidFindBy``` annotation will be used; when the iOS driver is being instantiated, the ```@iOSXCUITFindBy``` annotation will be used.
```
@PageObject
public class MagicTabPage extends TabBar {

    @AndroidFindBy(id = "login_tout_button")
    @iOSXCUITFindBy(id = "Sign up or Log in")
    public List <MobileElement> signUpOrLogIn;
```

<h2>Usage</h2>

<h3>iOS</h3>

Depending on your available iOS simluator list, which you can find by running ```xcrun simctl list```
replace ```iPhone 8``` with an available device.

```mvn clean test -Dplatform.name=ios -Dplatform.version=13.3 -Ddevice.name="iPhone 8" -Davd.name=""```

<h3>Android</h3>
If you don't have an Android emulator already setup you can download here https://developer.android.com/studio, after downloading follow the steps to setup an avd https://developer.android.com/studio/run/managing-avds


```mvn clean test -Dplatform.name=android -Dplatform.version=10 -Ddevice.name=emulator-5554 -Davd.name=Pixel_3a_XL_API_28```

This framework is setup to also run on real devices.


Test run reports are generated in root directory named `report` this can be opened in any browser.
