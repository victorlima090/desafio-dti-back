package main;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Executable;

@RestController
public class Controller {
    @PostMapping(value = "/login")
    @ResponseBody
    public ResponseDTO saveLogin(@RequestParam(value = "simulateError", required = false) Boolean simulatedError,
                                 HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            String login = request.getParameter("login");
            String password = request.getParameter("password");
            ResponseDTO responseDTO = new ResponseDTO();
            if(simulatedError != null && simulatedError){
                responseDTO.setErrorMessage("Serviço indisponível no momento. Tente novamente mais tarde.");
                responseDTO.setSuccess(false);
            }else{
                responseDTO.setSuccess(true);
            }
            return   responseDTO;

        } catch (Exception ex) {
            ResponseDTO responseDTO = new ResponseDTO(false,"Serviço indisponível no momento. Tente novamente mais tarde.");
            return responseDTO;
        }
    }

    @PostMapping(value = "/newUser")
    @ResponseBody
    public ResponseDTO newUser(@RequestParam(value = "simulateError", required = false) Boolean simulatedError,
                                 HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            String login = request.getParameter("login");
            String password = request.getParameter("password");
            ResponseDTO responseDTO = new ResponseDTO();
            if(simulatedError != null && simulatedError){
                responseDTO.setErrorMessage("Serviço indisponível no momento. Tente novamente mais tarde.");
                responseDTO.setSuccess(false);
            }else{
                responseDTO.setSuccess(true);
            }
            return   responseDTO;

        } catch (Exception ex) {
            ResponseDTO responseDTO = new ResponseDTO(false,"Serviço indisponível no momento. Tente novamente mais tarde.");
            return responseDTO;
        }
    }
}
