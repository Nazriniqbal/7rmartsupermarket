package utilities;

import com.github.javafaker.Faker;

public class FakerUtility {
	
	Faker faker=new Faker();
	public String generateName()
	{
		return faker.name().fullName();
		
	}
	
public String generateAddress()
{
	return faker.address().fullAddress();
}
public String generateUrl()
{
	return faker.internet().url();
}
public String generatePhoneNumber()
{
	return faker.phoneNumber().cellPhone();
}
public String generateInternet()
{
	return faker.internet().emailAddress();
}
public void generateDate()
{
	 faker.date().birthday();
}
public String generateColor()
{
	return faker.color().name();
}
public String generateCompanyLogo()
{
	return faker.company().logo();
}


}
