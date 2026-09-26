package businessLayer.firstProgram.DependencyInjection2;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Student {
  private String stdName;
  private int rollNo;
  private String stdAddress;
  private int stdPhone;

}
