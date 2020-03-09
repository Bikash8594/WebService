package in.nit.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class Product {
	private int prodId;
	private String prodCode;
	private double prodCost;
	private double prodDisc;
	private double  prodGst;

}
