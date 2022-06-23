

import org.junit.runner.RunWith
import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber

@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features",glue="",tags="@ActionToRoles,@Approvals,@Alerts,@Approvals,@Password,@ClientLogo,@HeaderImage,@ivy-config,@LogoUpload,@MyProfileEdit,@PasswordChange,@PasswordReset,@Tenant,@ThemeChange,@UserInterface", plugin=["pretty","html:Reports/Cucumber/cucumberreport.html"],monochrome = true)
//@CucumberOptions(features="Include/features",glue="", plugin=["pretty","html:Reports/Cucumber/cucumberreport.html"],monochrome = true)
class Runner {
}