import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BaseBallGame {

    @Test
    public void getTheScore(){
        Integer result = 0;
//        String[] ops = {"5","2","C","D","+"};
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < ops.length; i++) {
            int number = 0;
            try{
                number = Integer.parseInt(ops[i]);
                values.add(number);
            }catch(Exception e){

            }
            if(ops[i].equals("C") && !values.isEmpty()){
                values.remove(values.size()-1);
                continue;
            }
            if(ops[i].equals("D") && !values.isEmpty()){
                int lastOne = values.get(values.size()-1) * 2;
                values.add(lastOne);
                continue;
            }
            if(ops[i].equals("+") && values.size() > 2){
                int lastOne = values.get(values.size()-1) + values.get(values.size()-2);
                values.add(lastOne);
            }
        }

        for (Integer num :
                values) {
            result += num;
        }

//        Assertions.assertEquals(result, 30);
        Assertions.assertEquals(27, result);
    }
}
