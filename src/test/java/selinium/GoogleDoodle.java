package selinium;

import org.openqa.selenium.WebDriver;

public class GoogleDoodle {

	public static void main(String[] args) {

		WebDriver driver = BaseClass.basecss("chrome");

		driver.get("https://searchplayground.google/paris-2024/?utm_source=doodle&utm_medium=google_oo&utm_campaign=all&gsas=1&ved=0ahUKEwjNiva4qpmIAxUDzzgGHaKXNfAQPQgB");
	}

}
