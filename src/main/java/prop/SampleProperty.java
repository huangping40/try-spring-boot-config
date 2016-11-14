package prop;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "prefix")
@Component
public class SampleProperty {

  private String stringPropNotFound;
  public String getStringPropNotFound() {
    return stringPropNotFound;
  }

  public void setStringPropNotFound(String stringPropNotFound) {
    this.stringPropNotFound = stringPropNotFound;
  }

  private String stringProp1;

  @Value("${abc}")
  private String stringProp2;
  @Max(99)
  @Min(0)
  @Value("${abcd}")
  private Integer intProp1;

  public String getStringProp1() {
    return stringProp1;
  }

  public void setStringProp1(String stringProp1) {
    this.stringProp1 = stringProp1;
  }

  public String getStringProp2() {
    return stringProp2;
  }

  public void setStringProp2(String stringProp2) {
    this.stringProp2 = stringProp2;
  }

  public Integer getIntProp1() {
    return intProp1;
  }

  public void setIntProp1(Integer intProp1) {
    this.intProp1 = intProp1;
  }

  @Override
  public String toString() {
    return "SampleProperty [stringPropNotFound=" + stringPropNotFound + ", stringProp1="
        + stringProp1 + ", stringProp2=" + stringProp2 + ", intProp1=" + intProp1 + "]";
  }
}
