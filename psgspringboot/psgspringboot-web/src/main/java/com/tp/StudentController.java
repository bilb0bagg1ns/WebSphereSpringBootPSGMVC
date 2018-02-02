package com.tp;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tp.service.LoginService;

@Controller
public class StudentController {

	@Inject
	LoginService service;

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb") Student student,

			ModelMap model) {

		String returnVal = null;

		if (service.validateUser(student.getName(), student.getName())) {

			System.out.println("******************in Here");
			model.addAttribute("name", student.getName());
			model.addAttribute("age", student.getAge());
			model.addAttribute("id", student.getId());

			returnVal = "result";
		}
		return returnVal;
	}

	@RequestMapping(value = "/addPayment", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb") Payment payment,

			ModelMap model, HttpServletRequest request, HttpServletResponse response) {

		String returnVal = null;

		System.out.println("******************in Here");
		model.addAttribute("amount", payment.getAmount());
		model.addAttribute("register", payment.getRegister());

		ThreadLocalRandom.current();
		// payment.setTransactionId(random.nextLong(10_000_000_000L, 100_000_000_000L));
		model.addAttribute("transactionId", payment.getTransactionId());

		try {
			response.sendRedirect("https://localhost:9443/bingo/PaymentReceiptServlet");
		} catch (final IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		returnVal = "paymentResult";
		return returnVal;
	}

}