package com.huanglei.wf2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("ok")
    public String ok(){
        System.out.println("ok");
        return "ok";
    }

    private static List<String> words = Arrays.asList("the","quick");

    public static void main(String[] args) {

        String[] mm= {"eee","ffff"};
        for (String ss:mm){
            System.out.println(ss);
        }


        Flux.fromIterable(words)
                .flatMap(word->Flux.fromArray(word.split("")))
                .concatWith(Mono.just("s"))
                .distinct().sort()
                .zipWith(Flux.range(1,Integer.MAX_VALUE),(string,count)->String.format("%2d.%s",count,string))
                .subscribe(System.out::println);
    }
}
