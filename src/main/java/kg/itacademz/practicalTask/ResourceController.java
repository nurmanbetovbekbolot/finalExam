package kg.itacademz.practicalTask;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/counter")
public class ResourceController {

    @GetMapping
    public List<String> getAll() {
        return null;
    }

    @GetMapping(value = "/{id}")
    public String getById(@PathVariable("id")Long id) {
       String res=FileEditor.getCount();
       return res;
    }

    @PostMapping
    public void create(@RequestBody String s) {
        FileEditor.increment();
    }
}

