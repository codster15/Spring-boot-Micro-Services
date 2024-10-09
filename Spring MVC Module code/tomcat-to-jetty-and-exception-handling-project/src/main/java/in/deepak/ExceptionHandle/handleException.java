package in.deepak.ExceptionHandle;

import in.deepak.Controller.AppController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class handleException {

    private Logger logger = LoggerFactory.getLogger(AppController.class);
    @ExceptionHandler(value = Exception.class)
    public String errorPageLoad(Exception exception){
        String message = exception.getMessage();
        logger.error(message);
        return "loadError";
    }

}
