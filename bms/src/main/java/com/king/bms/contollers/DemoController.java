package com.king.bms.contollers;

import com.king.bms.dtos.DemoDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * we have two task
 * 1 is to set this class as a contoller class by the help of RestMapping annotaion
 * 2 is to ready this class when bean has been created
 */

@RestController
//localhost:8085/bms/v1/demos/
@RequestMapping("/bms/v1/demos")  // this annotation us used for routing
public class DemoController {
    /**
     *when someone hit on 127.0.0.1:8085/bms/v1/demos
     *
     * return "Hello World " as a response
     */
    @GetMapping
    public ResponseEntity getDemo(){
        return new ResponseEntity("Hello World", HttpStatus.OK);
    }

    /**
     * I want that when some one make a GET call on
     * 127.0.0.1:8085/bms/v1/demos/{demo_id}
     * return the demo_id
     */
    @GetMapping("/{demo_id}")
    // here path varible is used to assign the value in demo_id to demoId
    public ResponseEntity getDemoBasedOnId(@PathVariable("demo_id") int demoId){
        return new ResponseEntity("the given demo is : "+demoId,HttpStatus.OK);
    }
    /**
     * Create a new demo
     * POST 127.0.0.1:8085/bms/v1/demos
     *
     * Request body
     *
     * {
     *     "demo_name": "",
     *     "demo_id":"",
     *     "demo_desc":""
     * }
     */
    @PostMapping
    public ResponseEntity createDemo(@RequestBody DemoDto demoDto){
        System.out.println(demoDto);
        return new ResponseEntity("object created ",HttpStatus.CREATED);
    }
    /**
     * Update a attribute
     */
    @PutMapping
    public ResponseEntity updateDemo(@RequestBody DemoDto demoDto){
        System.out.println(demoDto);
        return new ResponseEntity("object modified",HttpStatus.ACCEPTED);
    }
    /**
     * Delete a call
     */
    @DeleteMapping("/{demo_id}")
    public ResponseEntity deleteDemo(@PathVariable("demo_id") int demoId){
        return new ResponseEntity("Demo deleted with id : "+demoId,HttpStatus.OK);
    }
}
