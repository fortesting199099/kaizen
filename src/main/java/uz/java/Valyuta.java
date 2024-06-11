package uz.java;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Valyuta{
	private String CcyNm_EN;
	private String CcyNm_UZC;
	private double Diff;
	private double Rate;
	private String Ccy;
	private String CcyNm_RU;
	private int id;
	private String CcyNm_UZ;
	private String Code;
	private int Nominal;
	private String Date;
}
