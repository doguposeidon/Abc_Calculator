package Sayfalar;

import org.openqa.selenium.WebDriver;

public class GirisYapSayfasi extends Sayfa {
    public final String emailAdresi="//input[@placeholder='Username']";
    public final String sifre="//input[@placeholder='Password']";
    public final String girisYapTusu="//div[@class='css-146c3p1 r-jwli3a r-1b43r93']";
    public final String opencalculator="//div[@class='css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1awozwy r-169ebfh r-z2wwpe r-h3s6tt r-1777fci r-tsynxw r-11c0sde r-13qz1uu']";


    public GirisYapSayfasi(WebDriver driver) {
        super(driver);
    }
}
