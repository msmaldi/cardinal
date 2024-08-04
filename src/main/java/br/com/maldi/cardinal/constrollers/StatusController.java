package br.com.maldi.cardinal.constrollers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController
{
    @GetMapping()
	@ResponseStatus(HttpStatus.OK)
	public void getStatus()
    {
	}
}
