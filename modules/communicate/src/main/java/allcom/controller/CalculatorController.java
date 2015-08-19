package allcom.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ljy on 15/5/12.
 * class 上的@RequestMapping("/aaa")注释和方法上的@RequestMapping("/greeting")要叠加
 * http://localhost:8080/aaa/greeting?name=ljy  才能正常访问；若果class上没有@RequestMapping("/aaa")，则
 * 访问http://localhost:8080/greeting?name=ljy 即可
 */

@RestController
public class CalculatorController {


    private static Logger log = LoggerFactory.getLogger(CalculatorController.class);

    // ex04-calculator.html
    @RequestMapping(value = "/calculator")
    public RetMessage generalInterface(
            @RequestParam(value="amt",required = true) float amt,
            @RequestParam(value = "apr",required = true) float apr,
            @RequestParam(value = "yrs",required = true) int yrs,
            @RequestParam(value = "zip",required = true) String zip,
            HttpServletRequest request
    ) {
        log.info("In calculator,amt is:"+amt +"; apr is:"+apr +"; yrs is:"+yrs +"; zip is:"+zip);
        RetMessage ret = null;




        return ret;
    }

}
