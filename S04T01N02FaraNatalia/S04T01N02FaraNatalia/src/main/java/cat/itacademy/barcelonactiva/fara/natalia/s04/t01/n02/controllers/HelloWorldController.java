package cat.itacademy.barcelonactiva.fara.natalia.s04.t01.n02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(name = "nom", defaultValue = "UNKNOWN") String nombre) {
        return "Hola, " + nombre + ". Estás ejecutando un proyecto Maven.";
    }
    @GetMapping({"/HelloWorld2", " /HelloWorld2/{nombre}"} )
    public String saluda2(@PathVariable(required = false)String nombre) {
        if(nombre == null) {
            nombre = "Desconocido";
        }
        return "Hola, " + nombre + ". Estás ejecutando un proyecto Maven.";

    }

}
