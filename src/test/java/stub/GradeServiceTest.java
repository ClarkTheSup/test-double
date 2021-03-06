package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.mockito.Mockito.when;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    GradeService gradeService;
    GradeSystemStub gradeSystemStub;

    @BeforeEach
    public void setup() {
        gradeSystemStub = new GradeSystemStub();
        gradeService = new GradeService(gradeSystemStub);
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        int studentId = 1;
        double result = gradeService.calculateAverageGrades(studentId);
        Assertions.assertEquals(90.0, result);
    }
}
