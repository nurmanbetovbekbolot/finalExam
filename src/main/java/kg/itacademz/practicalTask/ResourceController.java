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
        return null;
    }

    @PostMapping
    public void create(@RequestBody String s) {
        FileEditor.increment();
    }
}

