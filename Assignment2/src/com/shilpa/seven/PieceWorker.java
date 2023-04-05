/**
 * 
 */
package com.shilpa.seven;

/**
 * @author shilp
 *
 */
public class PieceWorker extends Employee {
	private int wage;
	private int pieces;

	public PieceWorker(String firstName, String lastName, String socialSecurityNumber, int wage, int pieces) {
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.pieces = pieces;
	}

	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		this.pieces = pieces;
	}

	@Override
	public double earnings() {
		return wage * pieces;
	}

	@Override
	public String toString() {
		return "PieceWorker [wage=" + wage + ", pieces=" + pieces + "]";
	}

}
