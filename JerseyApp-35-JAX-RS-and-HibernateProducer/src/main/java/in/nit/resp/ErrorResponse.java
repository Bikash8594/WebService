package in.nit.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {

	@NonNull
	private String code; 
	@NonNull
	private String message; 

}
