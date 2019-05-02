package ind.syu.elemental;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rest/busi/resourcePublish")
public class SomeController {

    @RequestMapping(value = "/start",method = RequestMethod.POST)
    @ResponseBody
    public Object commit(@RequestBody Map<String,Object> body){
        List<String> resourceIds = (List<String>) body.get("resourceIds");
        return null;
    }


}
