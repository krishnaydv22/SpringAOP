    package com.example.SpringAOP.controller;

    import com.example.SpringAOP.service.PrintSomething;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/print")

    public class PrintController {
        private final PrintSomething printSomething;
     public PrintController(PrintSomething printSomething){
         this.printSomething = printSomething;
     }

        @GetMapping
        public ResponseEntity<String> getString(){
            return ResponseEntity.ok(printSomething.printSomething());
        }
    }
