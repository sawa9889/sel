package Sql;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
@Aspect
public class exec {
    private JdbcTemplate jdbc;
    @Pointcut("execution(* Threads.Writeror.flag())")
    private void method(){}

    @Autowired
    exec(DataSource source){
        this.jdbc=new JdbcTemplate(source);
    }

    @After("method()")
    void execute(){

    }

}
