package pl.sdacademy.osk.app.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.sdacademy.domain.entity.Student;
import pl.sdacademy.domain.entity.Teacher;

@Controller
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        LOGGER.debug("is executed");
        return "test";
    }

    @RequestMapping(value = {"/student"}, method = RequestMethod.GET)
    public String studentTest(@ModelAttribute("student") Student student, Model model) {
        LOGGER.debug("is executed");
        model.addAttribute("student", student);

        return "studentForm";
    }

    @RequestMapping(value = "/teacher", method = RequestMethod.GET)
    public String teacherTest(@ModelAttribute("teacher") Teacher teacher, Model model) {
        LOGGER.debug("is executed");
        model.addAttribute("teacher", teacher);

        return "teacherForm";
    }
}
