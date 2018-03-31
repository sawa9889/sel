package output;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Outputer {

    @Pointcut("execution(* Threads.Writeror.flag())")
    private void method(){}

    @After("method()")
    public void findPost(){
        String str="";

        //read from file
        // for each id find text,link,pictures and write it to str

        mainOutput.getOut().add(str);
    }
}
