package SpringBootMS.controller;

import SpringBootMS.DTO.Details;
import org.springframework.web.bind.annotation.*;

//To map the request with methods
@RestController
public class Controller {


    @RequestMapping(value = "/welcome", method = RequestMethod.GET)   //requestparam ?name&id
    public String welcome(@RequestParam  String name , @RequestParam ("id") String id){
        return "name is :"+ name + "  " + "and id is : "+ id;
    }

    @RequestMapping(value = "/welcome/{rollno}" , method = RequestMethod.GET)
    public  String welcome(@PathVariable ("rollno") String rollno){
        return "here student roll number is " + rollno;
    }

    @RequestMapping(value = "/Employee/{Emp1}",method = RequestMethod.GET)
    public Details Employee(@PathVariable ("Emp1") String Emp1){

        return new Details(Emp1,"Bhavna","QA" , "30000");
    }


}
