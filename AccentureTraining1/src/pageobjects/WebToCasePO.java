package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="WebToCasePO"                                
     , summary=""
     , relativeUrl=""
     , connection="WebTesting"
     )             
public class WebToCasePO {

	@TextType()
	@FindBy(xpath = "//input[@id='input_14_1']")
	public WebElement contactName;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Email']/following-sibling::div//input[@type='text']")
	public WebElement email;
	@ChoiceListType()
	@FindBy(xpath = "//select[@id='input_14_4']")
	public WebElement priority;
	@TextType()
	@FindBy(xpath = "//input[@id='input_14_6']")
	public WebElement Phone;		
	@TextType()
	@FindBy(xpath = "//input[@id='input_14_5']")
	public WebElement Subject;
	@ButtonType()
	@FindBy(xpath = "//input[@id='gform_submit_button_14']")
	public WebElement Submitbutton;	
}
