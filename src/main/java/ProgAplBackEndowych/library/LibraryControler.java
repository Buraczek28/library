package ProgAplBackEndowych.library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryControler {

        @GetMapping("/test")
        public int test(){
            return 1;
        }
}
