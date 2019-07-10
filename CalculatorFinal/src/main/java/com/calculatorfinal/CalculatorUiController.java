//package com.calculatorfinal;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.client.RestTemplate;
//
//@Controller
//public class CalculatorUiController {
//	@GetMapping("/ui/add")
//	public String getAddUI(Model uiModel) {
//		uiModel.addAttribute("operator1", 0);
//		uiModel.addAttribute("operator2", 0);
//		uiModel.addAttribute("result", 0);
//		return "/index";
//	}
//
//	@PostMapping("/ui/add")
//	public String AddTwoNumber(@ModelAttribute CalculatorUIModel model, Model uiModel) {
//		RestTemplate restTemplate = new RestTemplate();
//		String calcUrl = "http://localhost:8080/add?x={0}&y={1}";
//		calcUrl = calcUrl.replace("{0}", model.getOperator1());
//		calcUrl = calcUrl.replace("{1}", model.getOperator2());
//
//		ResponseEntity<String> response = restTemplate.getForEntity(calcUrl, String.class);
//
//		String result = response.getBody();
//
//		uiModel.addAttribute("operator1", model.getOperator1());
//		uiModel.addAttribute("operator2", model.getOperator2());
//		uiModel.addAttribute("result", result);
//
//		return "/index";
//
//	}
//}
