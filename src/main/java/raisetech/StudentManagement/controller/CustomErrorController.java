package raisetech.StudentManagement.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomErrorController implements ErrorController {

  private static final String PATH = "/error";

  @RequestMapping(PATH)
  public ModelAndView error() {
    ModelAndView modelAndView = new ModelAndView("error/error"); // エラーページのテンプレート名
    return modelAndView;
  }

  // getErrorPath()メソッドは不要です
}
