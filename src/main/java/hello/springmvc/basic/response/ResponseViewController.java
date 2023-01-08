package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1() {
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data","hello!");
        return mav;
    }
    @RequestMapping("/response-view-v2")
    public String responseViewV2(Model model) { // String 반환시 return값은 논리적 뷰 경로
        model.addAttribute("data","hello!");
        return "response/hello";
    }
    @RequestMapping("/response/hello") // 권장하지 않는방법
    public void responseViewV3(Model model) {
        model.addAttribute("data","hello!");
    }
}
