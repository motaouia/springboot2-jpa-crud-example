package org.medmota.democrud.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception{

	public ResourceNotFoundException(Long id) {
		super("Employee not found for this id :: " + id);
	}
}
