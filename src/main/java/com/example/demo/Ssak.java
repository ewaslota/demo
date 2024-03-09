package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

public class Ssak {
}

class Kot extends Ssak {

}

class Tygrys extends  Kot {

}
@Component
class TygrysSyberyjski extends Tygrys {

    @PostConstruct
    public void  init() {

    }

    @PreDestroy
    public void  cleanUp() {

    }

}
