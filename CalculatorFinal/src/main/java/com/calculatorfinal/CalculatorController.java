package com.calculatorfinal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Controller
public class CalculatorController {

	private CalculatorService calc = new CalculatorService();

	@GetMapping("/add")
	@ResponseBody
	public long getIndexPage(@RequestParam int x, @RequestParam int y) throws Exception {
		CalculatorModel model = new CalculatorModel(x, y);
		return calc.add(model);
	}

}
